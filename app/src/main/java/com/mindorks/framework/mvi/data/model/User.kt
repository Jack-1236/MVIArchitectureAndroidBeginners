package com.mindorks.framework.mvi.data.model

import com.squareup.moshi.Json
/**
 *  @author : Tan
 *  time   : 2023/3/29
 *  desc   : 网路请求数据模型
 */
data class User(
    @Json(name = "id")
    val id: Int = 0,
    @Json(name = "name")
    val name: String = "",
    @Json(name = "email")
    val email: String = "",
    @Json(name = "avatar")
    val avatar: String = "",
    )
