package com.ginogipsy.counterapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private val _counterRepository = CounterRepository()
    private val _count = mutableIntStateOf(_counterRepository.getCounter().count)

    //Expose the count as an immutable state
    val count: MutableState<Int> = mutableIntStateOf(_count.intValue)

    fun increment() {
        _counterRepository.increaseCounter()
        _count.intValue = _counterRepository.getCounter().count
    }

    fun decrement() {
        _counterRepository.decreaseCounter()
        _count.intValue = _counterRepository.getCounter().count
    }
}