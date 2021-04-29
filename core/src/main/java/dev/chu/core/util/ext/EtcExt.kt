package dev.chu.core.util.ext

import android.content.res.Resources
import android.graphics.Insets
import android.graphics.Point
import android.os.Build
import android.os.Bundle
import android.util.TypedValue
import android.view.WindowInsets
import android.view.WindowManager
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions
import androidx.navigation.Navigator
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.findNavController

val Any.TAG: String
    get() = this::class.java.simpleName

val Int.DP
    get() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        toFloat(),
        Resources.getSystem().displayMetrics
    ).toInt()

@Suppress("DEPRECATION")
fun WindowManager.currentWindowMetricsPointCompat(): Point {
    return if (isAndroid30()) {
        val windowInsets = currentWindowMetrics.windowInsets
        var insets: Insets = windowInsets.getInsets(WindowInsets.Type.navigationBars())
        windowInsets.displayCutout?.run {
            insets = Insets.max(
                insets,
                Insets.of(safeInsetLeft, safeInsetTop, safeInsetRight, safeInsetBottom)
            )
        }

        val insetsWidth = insets.right + insets.left
        val insetsHeight = insets.top + insets.bottom
        Point(
            currentWindowMetrics.bounds.width() - insetsWidth,
            currentWindowMetrics.bounds.height() - insetsHeight
        )
    } else {
        val display = defaultDisplay // deprecated in API 30
        val size = Point()
        display?.getSize(size) // deprecated in API 30
        Point(size.x, size.y)
    }
}

// navigation component 를 위한 extension
fun Fragment.findNavControllerSafely(): NavController? {
    return if (isAdded) {
        findNavController()
    } else {
        null
    }
}

fun Fragment.navigate(destination: NavDirections, extraInfo: FragmentNavigator.Extras? = null) {
    findNavControllerSafely()?.let { navController ->
        with(navController) {
            currentDestination?.getAction(destination.actionId)?.let {
                if (extraInfo == null) {
                    navigate(destination)
                } else {
                    navigate(destination, extraInfo)
                }
            }
        }
    }
}

fun Fragment.navigate(
    @IdRes res: Int,
    args: Bundle? = null,
    navOptions: NavOptions? = null,
    navigatorExtras: Navigator.Extras? = null
) {
    findNavControllerSafely()?.let { navController ->
        with(navController) {
            if (args != null && navOptions != null && navigatorExtras != null) {
                navigate(res, args, navOptions, navigatorExtras)
            } else if (args != null && navOptions != null) {
                navigate(res, args, navOptions)
            } else if (args != null) {
                navigate(res, args)
            } else {
                navigate(res)
            }
        }
    }
}

fun Fragment.backStack() = findNavController().popBackStack()

fun isAndroid29() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q
fun isAndroid30() = Build.VERSION.SDK_INT >= Build.VERSION_CODES.R