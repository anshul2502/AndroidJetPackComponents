package com.app.androidarchitecture.liveData

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel:ViewModel() {

    private var counts = MutableLiveData<Int>()
    val count:LiveData<Int>
    get() = counts






}