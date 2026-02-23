package com.ginogipsy.counterapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    var _count by mutableIntStateOf(0)

    fun increment() {
        _count += 1
    }

    fun decrement() {
        _count -= 1
    }
}