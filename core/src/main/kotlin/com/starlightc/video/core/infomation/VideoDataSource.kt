package com.starlightc.video.core.infomation

import android.net.Uri
import java.io.Serializable
import java.net.HttpCookie

/**
 * @author StarlightC
 * @since 2022/4/24
 *
 * TODO: description
 */
data class VideoDataSource(
    var name: String?,
    var uri: Uri?,
    var defaultType: Int = -1, /** Uri为重定向连接时，的默认视频类型 -1 为不作处理*/
    var headers: Map<String?, String?>? = null,
    var cookies: List<HttpCookie>? = null,
    var isLive: Boolean = false
) : Serializable