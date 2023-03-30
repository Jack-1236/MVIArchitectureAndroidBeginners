package com.mindorks.framework.mvi.data.api

import com.mindorks.framework.mvi.data.model.User

/**
 * @author : Tan
 * Time    : 2023/3/29
 * desc    : 服务接口
 */
interface ApiHelper {
    suspend fun getUsers():List<User>
}