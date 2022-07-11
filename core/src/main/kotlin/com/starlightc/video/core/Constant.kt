package com.starlightc.video.core

/**
 * @author StarlightC
 * @since 2022/4/24
 *
 * 常量
 */
object Constant {
    const val MAX_TIMES_RETRY = 5
    const val TAG = "HBVideoView"
    const val HB_SP = "HBVideoView_SharedPreference"

    const val ANDROID_MEDIA_PLAYER = "AndroidMediaPlayer"
    const val IJKPLAYER = "ijkplayer"
    const val EXOPLAYER = "exoplayer"

    const val CONTROLLER_HIDE_TIME = 5000L

    const val EXOPLAYER_INFO_CODE_BUFFERING_START = 0
    const val EXOPLAYER_INFO_CODE_LOADING_START = 1
    const val EXOPLAYER_INFO_CODE_LOADING_CANCELED = 2
    const val EXOPLAYER_INFO_CODE_LOADING_COMPLETED = 3
    const val EXOPLAYER_INFO_CODE_RENDERING_STARTED = 4
    const val EXOPLAYER_INFO_CODE_IS_PLAYING = 5

    const val EXOPLAYER_ERROR_CODE_IO = 0
    const val EXOPLAYER_ERROR_CODE_LOADING = 1

}