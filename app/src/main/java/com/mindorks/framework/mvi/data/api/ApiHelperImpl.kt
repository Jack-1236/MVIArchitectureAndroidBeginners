package com.mindorks.framework.mvi.data.api

import com.mindorks.framework.mvi.data.model.User

/**
 * @author : Tan
 * Time    : 2023/3/29
 * desc    : 与数据层的restful服务进行通信
 * @param apiService restful 服务
 */
class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {
    override suspend fun getUsers(): List<User> {
        return apiService.getUsers();
    }
}