package com.example.counterapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.counterapp.ui.theme.CounterRepository

class CounterViewModel() : ViewModel(){
    private val _repository:CounterRepository = CounterRepository()
    private var _count by mutableStateOf(_repository.getCounter().count)
    val count: Int get() = _count

    fun increment(){
        _repository.incrementCounter()
        _count=_repository.getCounter().count
    }

    fun decrement(){
        _repository.decrementCounter()
        _count=_repository.getCounter().count
    }

}