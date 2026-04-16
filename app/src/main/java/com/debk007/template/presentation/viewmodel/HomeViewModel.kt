package com.debk007.template.presentation.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel : ViewModel() {

    private val _state = MutableStateFlow("GameMode AI Running")
    val state = _state.asStateFlow()
}
