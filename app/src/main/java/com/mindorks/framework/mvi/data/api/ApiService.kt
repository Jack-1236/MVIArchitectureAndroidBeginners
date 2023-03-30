package com.mindorks.framework.mvi.data.api

import com.mindorks.framework.mvi.data.model.User
import retrofit2.http.GET
/**
 * @author : Tan
 * Time    : 2023/3/29
 * desc    : 指定与 API 通信的 HTTP 方法
 */
interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>

}