package com.mindorks.framework.mvi.ui.main.viewmodel

import androidx.lifecycle.ViewModel
import com.mindorks.framework.mvi.data.repository.MainRepository
import com.mindorks.framework.mvi.ui.main.intent.MainIntent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.Channel


@ExperimentalCoroutinesApi
class MainViewModel(private val repository: MainRepository):ViewModel() {


    val userIntent = Channel<MainIntent>(Channel.)
}