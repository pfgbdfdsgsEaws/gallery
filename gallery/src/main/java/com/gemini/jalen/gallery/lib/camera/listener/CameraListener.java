package com.gemini.jalen.gallery.lib.camera.listener;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;

/**
 * @author：luck
 * @date：2020-01-04 13:38
 * @describe：相机回调监听
 */
public interface CameraListener {
    /**
     * 拍照成功返回
     *
     * @param file
     */
    void onPictureSuccess(@NonNull File file);

    /**
     * 录像成功返回
     *
     * @param file
     */
    void onRecordSuccess(@NonNull File file);

    /**
     * 使用相机出错
     *
     * @param file
     */
    void onError(int videoCaptureError, @NonNull String message, @Nullable Throwable cause);
}