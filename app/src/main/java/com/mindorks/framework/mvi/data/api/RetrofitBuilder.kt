package com.mindorks.framework.mvi.data.api

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


/**
 * @author : Tan
 * Time    : 2023/3/29
 * desc    : 构造器：构建端点URL并使用REST服务
 */
object RetrofitBuilder {
    private const val BASE_URL = "https://5e510330f2c0d300147c034c.mockapi.io/"
    private fun getRetrofit(): Retrofit = Retrofit.Builder().baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val apiService: ApiService = getRetrofit().create(ApiService::class.java)
}