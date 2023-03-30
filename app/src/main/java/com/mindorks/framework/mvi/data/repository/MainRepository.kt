package com.mindorks.framework.mvi.data.repository

import com.mindorks.framework.mvi.data.api.ApiHelper

/**
 * @author : Tan
 * Time    : 2023/3/29
 * desc    : 数据存储库
 * @param  apiHelper 服务接口实例,主要用于和网络层进行通信
 */
class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getUsers() = apiHelper.getUsers()

}