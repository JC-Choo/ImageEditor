package dev.chu.editor.ui.custom_view

import android.annotation.SuppressLint
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.graphics.*
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AlertDialog
import dev.chu.core.util.ext.currentWindowMetricsPointCompat
import dev.chu.core.util.ext.findActivity
import dev.chu.core.util.ext.getScaleOfScreen
import dev.chu.core.util.ext.toast
import dev.chu.editor.etc.CropType
import dev.chu.editor.R
import dev.chu.editor.data.DrawPoint
import dev.chu.editor.data.DrawRegion
import dev.chu.editor.etc.Const
import java.io.ByteArrayOutputStream
import kotlin.math.abs

/**
 * Crop 을 비율로 하기 위한 Custom View
 * - [setBitmapOnDraw] 을 통해 가져온 bitmap 을 비율에 맞게 변경 후, [onDraw]에서 canvas 에 그려준다. 그리기 전에는 뷰의 가운데에 오도록 설정한다.
 * - [onClear]를 CropRatioView 를 가져다 사용하는 Activity or Fragment 의 onStop or onPause 에서 호출해 초기화를 시켜줘야 한다. -> 아니면 화면에 paint 가 남아있다.
 *
 * =======================
 * override fun onCreate(~~) {
 * ...
 * binding.cropRatioView.setBitmapOnDraw(bitmap)
 * }
 *
 * override onStop() {
 * ...
 * binding.cropRatioView.onClear()
 * }
 * =======================
 *
 * - [showCropDialog]를 통해 positive button or negative button click 시 호출한 activity 의 onNewIntent 에 들어가게 구성해놨다.
 * - [getCroppedBitmapImage]를 통해 crop 된 이미지를 bitmap 으로 가져올 수 있다.
 * - [getImageRegion]을 통해 크롭된 이미지의 left, top, width, height 를 가져올 수 있다. 해당 결과는 [getCroppedBitmapImage]을 호출 후 호출 가능하다.
 *
 * =======================
 * imageBitmap = binding.cropRatioView.getCroppedBitmapImage(imageBitmap.copy(imageBitmap.config, false))
 * val cropRegion = binding.cropRatioView.getCropRegion()
 * var bitmap = imageBitmap.copy(imageBitmap.config, false)
 * bitmap = Bitmap.createBitmap(bitmap!!, cropRegion.left, cropRegion.top, cropRegion.width, cropRegion.height)
 * binding.image.setImageBitmap(bitmap)
 * =======================
 */
@SuppressLint("ClickableViewAccessibility")
class CustomCropView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : View(context, attrs, defStyle), View.OnTouchListener {

    companion object {
        val points = mutableListOf<DrawPoint>()   // 그릴 포인트들 리스트 형태로 모아 놓음
    }

    private val paint: Paint by lazy {
        Paint(Paint.ANTI_ALIAS_FLAG).apply {
            style = Paint.Style.STROKE
            pathEffect = DashPathEffect(floatArrayOf(10f, 20f), 0f)
            strokeWidth = 5f
            color = Color.WHITE
        }
    }                                           // 어떻게 그릴지에 대해 설정할 변수
    private var isPathDraw = true               // 경로를 그릴지 말지에 대한 값 설정
    private var isFirstPoint = false            // 첫번째 포인트인지에 대한 값 설정
    private var firstPoint: DrawPoint? = null     // 첫번째 포인트에 대한 값 설정
    private var lastPoint: DrawPoint? = null      // 마지막 포인트에 대한 값 설정
    private var scaledBitmap: Bitmap? = null    // 뷰에서 보여주는 비트맵에 대해 비율에 맞게 새로 만든 비트맵

    // crop 영역
    private var drawRegion: DrawRegion? = null

    private lateinit var byteArr: ByteArray     // scaledBitmap 정보를 압축해 ByteArrayOutputStream 에 담기 위한 ByteArray

    init {
        // 뷰에 touchListener 를 달아준다.
        this.setOnTouchListener(this)

        // 뷰가 포커스를 받을 수 있는지에 대한 설정 ( if true, 포커스 받음 )
        isFocusable = true
        // 터치 모드에서 뷰가 포커스를 받을 수 있는 지에 대한 설정
        isFocusableInTouchMode = true
        // 첫번째 포인트인지에 대한 값 설정
        isFirstPoint = false
    }

    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas?) {
//        super.onDraw(canvas)
        if (scaledBitmap != null) {
            val left = (context.findActivity()!!.windowManager.currentWindowMetricsPointCompat().x - scaledBitmap!!.width)/2f
            val top = (context.findActivity()!!.windowManager.currentWindowMetricsPointCompat().y - scaledBitmap!!.height)/2f    // top 의 높이 설정(전체 사이즈의 height 의 반 - scaledBitmap 의 height 의 반
            canvas?.drawBitmap(scaledBitmap!!, left, top, null)
        }

        if (points.size > 1) {
            val left = points[0].x.toInt()
            val top = points[0].y.toInt()
            val right = points[points.size - 1].x.toInt()
            val bottom = points[points.size - 1].y.toInt()

            val rect = Rect(left, top, right, bottom)
            canvas?.drawRect(rect, paint)
        }
    }

    override fun onTouch(v: View?, e: MotionEvent?): Boolean {
        val point = DrawPoint()
        e?.let { event ->
            point.x = event.x
            point.y = event.y

            if (isPathDraw) {
                if (isFirstPoint) {
                    if (firstPoint != null &&
                        comparePoint(firstPoint!!, point)
                    ) {
                        // points.add(point)
                        points.add(firstPoint!!)
                        isPathDraw = false
                        showCropDialog()
                    } else {
                        points.add(point)
                    }
                } else {
                    points.add(point)
                }

                if (!isFirstPoint) {
                    firstPoint = point
                    isFirstPoint = true
                }
            }

            invalidate()

            if (event.action == MotionEvent.ACTION_UP) {
                lastPoint = point
                if (isPathDraw) {
                    if (points.size > 4) {
                        if (firstPoint != null && lastPoint != null &&
                            !comparePoint(firstPoint!!, lastPoint!!)
                        ) {
                            isPathDraw = false
                            showCropDialog()
                        }
                    }
                }
            }
        }

        return true
    }

    /**
     * CropRatioView 에서 사용할 bitmap 을 가져오는 함수
     */
    fun setBitmapOnDraw(original: Bitmap) {
        // 가져온 이미지를 비율에 맞는 비트맵의 크기로 새로 만들어주면서 byteArray 형태로 만들어준다.
        val stream = ByteArrayOutputStream()
        scaledBitmap = context.findActivity()!!.getScaleOfScreen(original)
        scaledBitmap?.compress(Bitmap.CompressFormat.JPEG, 50, stream)
        byteArr = stream.toByteArray()
    }

    /**
     * CropRatioView 에서 사용할 bitmap, byteArr 을 가져오는 함수
     */
    fun convertByteArrayToBitmap(byteArray: ByteArray) {
        this.byteArr = byteArray
        scaledBitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.size)
    }

    private fun comparePoint(first: DrawPoint, current: DrawPoint): Boolean {
        val leftRangeX = (current.x - 3).toInt()
        val leftRangeY = (current.y - 3).toInt()

        val rightRangeX = (current.x + 3).toInt()
        val rightRangeY = (current.y + 3).toInt()

        return if ((leftRangeX < first.x && first.x < rightRangeX) &&
            (leftRangeY < first.y && first.y < rightRangeY)
        ) {
            points.size >= 4
        } else {
            false
        }
    }

    private fun showCropDialog() {
        val dialogClickListener = DialogInterface.OnClickListener { _, which ->
            when (which) {
                DialogInterface.BUTTON_POSITIVE -> {
                    if (scaledBitmap != null) {
                        context.startActivity(Intent(context, context::class.java).apply {
                            putExtra(Const.IS_CROP, true)
                            putExtra(Const.CROP_METHOD, CropType.RATIO.ordinal)
                            putExtra(Const.IMAGE_BYTE_ARRAY, byteArr)
                        })
                    }
                }

                DialogInterface.BUTTON_NEGATIVE -> {
                    if (scaledBitmap != null) {
                        context.startActivity(Intent(context, context::class.java).apply {
                            putExtra(Const.IS_CROP, false)
                            putExtra(Const.CROP_METHOD, CropType.RATIO.ordinal)
                            putExtra(Const.IMAGE_BYTE_ARRAY, byteArr)
                        })
                    }

                    isFirstPoint = false
                }
            }
        }

        AlertDialog.Builder(context)
            .setMessage("크롭 이미지 or 크롭 제외 이미지 볼래?")
            .setPositiveButton("Crop", dialogClickListener)
//            .setNegativeButton("Non-crop", dialogClickListener)
            .setNegativeButton("취소") { _, _ ->
                onClear()
            }
            .setCancelable(false)
            .show()
    }

    /**
     * crop 된 이미지를 bitmap 으로 가져오는 함수
     */
    fun getCroppedBitmapImage(bitmap: Bitmap): Bitmap? {
        val screenSize = context.findActivity()?.windowManager?.currentWindowMetricsPointCompat() ?: return null
        return Bitmap.createBitmap(screenSize.x, screenSize.y, bitmap.config).apply {
            val canvas = Canvas(this)
            val paint = Paint()
            paint.isAntiAlias = true

            val points = points
            val lastIndex = points.size - 1

            val leftPosition = (screenSize.x - bitmap.width) / 2
            val rightPosition = (screenSize.x + bitmap.width) / 2
            val topPosition = (screenSize.y - bitmap.height) / 2
            val bottomPosition = (screenSize.y + bitmap.height) / 2

            var left = if (points[0].x < points[lastIndex].x) points[0].x.toInt() else points[lastIndex].x.toInt()
            var right = if (points[0].x > points[lastIndex].x) points[0].x.toInt() else points[lastIndex].x.toInt()
            var top = if (points[0].y < points[lastIndex].y) points[0].y.toInt() else points[lastIndex].y.toInt()
            var bottom = if (points[0].y > points[lastIndex].y) points[0].y.toInt() else points[lastIndex].y.toInt()

            when {
                right < leftPosition ||
                        rightPosition < left ||
                        bottom < topPosition ||
                        bottomPosition < top
                -> {
                    context.toast(R.string.no_region)
                    return null
                }
                else -> {
                    left =
                        if (left < leftPosition) leftPosition - leftPosition else left - leftPosition
                    right =
                        if (right < rightPosition) right - leftPosition else rightPosition - leftPosition
                    top = if (top < topPosition) topPosition - topPosition else top - topPosition
                    bottom =
                        if (bottom < bottomPosition) bottom - topPosition else bottomPosition - topPosition

                    drawRegion =
                        DrawRegion(left, top, abs(left - right), abs(top - bottom))

                    val rect = Rect(left, top, right, bottom)
                    canvas.drawRect(rect, paint)

                    paint.xfermode = PorterDuffXfermode(PorterDuff.Mode.SRC_IN)

                    canvas.drawBitmap(bitmap, 0f, 0f, paint)
                }
            }
        }
    }

    /**
     * 이미지의 영역(left, top, width, height)를 가져오는 함수
     * 반드시 getCroppedBitmapImage() 호출 후 사용
     */
    fun getDrawRegion() = drawRegion

    /**
     * onStop 시 호출
     */
    fun onClear() {
        points.clear()
        paint.color = Color.WHITE
        paint.style = Paint.Style.STROKE
        isPathDraw = true
        invalidate()
    }
}