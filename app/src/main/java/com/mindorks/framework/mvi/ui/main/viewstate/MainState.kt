package com.mindorks.framework.mvi.ui.main.viewstate

import com.mindorks.framework.mvi.data.model.User

/**
 * @author : Tan
 * Time    : 2023/3/29
 * desc    : 主页面数据加载状态
 */
sealed class MainState {
    /** 状态空闲 */
    object Idle:MainState()

    /** 加载中 */
    object Loading:MainState()

    /** 加载成功 展现用户数据 */
    data class Users(val user:List<User>):MainState()

    /** 加载失败 展现加载失败结果 */
    data class Error(val error:String?):MainState()

}