package com.example.mvvm

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class MainViewModel(application: Application):AndroidViewModel(application) {

    var count = MutableLiveData<Int>()

    init {
        count.value = 0
    }

    fun plus() {
        count.value = count.value?.plus(1)
    }

    fun minus() {
        count.value = count.value?.minus(1)
    }
}