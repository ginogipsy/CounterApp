package com.ginogipsy.counterapp

data class CounterModel(var count: Int)

class CounterRepository {
    private var _counter = CounterModel(0)

    fun getCounter() = _counter

    fun increaseCounter() {
        _counter.count++
    }

    fun decreaseCounter() {
        _counter.count--
    }
}