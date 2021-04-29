package dev.chu.custom_gallery.util.paging;

import java.lang.System;

/**
 * 참고 싸이트 : https://codechacha.com/ko/android-jetpack-paging/
 *
 * DataSource
 * "데이터를 로딩"하는 객체"로 로컬 또는 Backend의 데이터를 가져오는 역할입니다.
 *
 * DataSource의 파생클래스
 * PositionalDataSource: 위치기반의 데이터를 로딩하는 DataSource입니다.
 *     ** 셀 수 있는 데이터, 고정된 사이즈의 데이터를 로딩할 때 사용됩니다.
 *     만약 끝을 알 수 없는 무한대의 아이템이라면, ItemKeyedDataSource 또는 PageKeyedDataSource이 적합합니다.
 *     ** Room은 PositionalDataSource 타입의 소스를 제공합니다.
 * ItemKeyedDataSource: 키 기반의 아이템을 로딩하는 DataSource입니다.
 * PageKeyedDataSource: 페이지 기반의 아이템을 로딩하는 DataSource입니다.
 *
 * 공통점 : 데이터를 가져온다는 것
 * 차이점 : 데이터 덩어리를 가져오는 방식이 다르다는 것
 *
 * PositionalDataSource
 * 특정 위치(index)에서 원하는 개수만큼 데이터를 가져올 수 있다면 PositionalDataSource 를 적용
 * loadInitial : 처음 데이터를 가져올 때 호출되는 함수
 * loadRange : 다음 데이터를 가져올 때 호출
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0002J\u001e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0016J\u001e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0016R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0011\u00a8\u0006!"}, d2 = {"Ldev/chu/custom_gallery/util/paging/LocalDataSource;", "Landroidx/paging/PositionalDataSource;", "Ldev/chu/custom_gallery/entity/Media;", "contentResolver", "Landroid/content/ContentResolver;", "count", "Landroidx/lifecycle/MutableLiveData;", "", "buckedId", "", "(Landroid/content/ContentResolver;Landroidx/lifecycle/MutableLiveData;Ljava/lang/Long;)V", "Ljava/lang/Long;", "contentUri", "Landroid/net/Uri;", "projection", "", "", "[Ljava/lang/String;", "getMedias", "", "startPosition", "loadSize", "isInitial", "", "loadInitial", "", "params", "Landroidx/paging/PositionalDataSource$LoadInitialParams;", "callback", "Landroidx/paging/PositionalDataSource$LoadInitialCallback;", "loadRange", "Landroidx/paging/PositionalDataSource$LoadRangeParams;", "Landroidx/paging/PositionalDataSource$LoadRangeCallback;", "custom_gallery_debug"})
public final class LocalDataSource extends androidx.paging.PositionalDataSource<dev.chu.custom_gallery.entity.Media> {
    private final android.net.Uri contentUri = null;
    private final java.lang.String[] projection = null;
    private final android.content.ContentResolver contentResolver = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> count = null;
    private java.lang.Long buckedId;
    
    @java.lang.Override()
    public void loadInitial(@org.jetbrains.annotations.NotNull()
    androidx.paging.PositionalDataSource.LoadInitialParams params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PositionalDataSource.LoadInitialCallback<dev.chu.custom_gallery.entity.Media> callback) {
    }
    
    @java.lang.Override()
    public void loadRange(@org.jetbrains.annotations.NotNull()
    androidx.paging.PositionalDataSource.LoadRangeParams params, @org.jetbrains.annotations.NotNull()
    androidx.paging.PositionalDataSource.LoadRangeCallback<dev.chu.custom_gallery.entity.Media> callback) {
    }
    
    private final java.util.List<dev.chu.custom_gallery.entity.Media> getMedias(int startPosition, int loadSize, boolean isInitial) {
        return null;
    }
    
    public LocalDataSource(@org.jetbrains.annotations.NotNull()
    android.content.ContentResolver contentResolver, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> count, @org.jetbrains.annotations.Nullable()
    java.lang.Long buckedId) {
        super();
    }
}