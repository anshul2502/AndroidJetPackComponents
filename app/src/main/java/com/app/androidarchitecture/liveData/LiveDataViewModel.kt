package com.app.androidarchitecture.liveData

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel:ViewModel() {

    private var countMutable = MutableLiveData<Int>()
    val count:LiveData<Int>
    get() = countMutable

    fun setValue(value:Int){
        countMutable.value = countMutable.value?.plus(value)
    }




}