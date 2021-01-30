package com.app.androidarchitecture.DataBindingViewModelLiveData.DataBindingLiveData

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataBindingLiveDataViewModel:ViewModel() {

    private var count = MutableLiveData<Int>()
    private var intData:Int = 0

    val countData :LiveData<Int>
    get() = count


    fun increaseValue(){
        intData++
        count.value = intData
    }


}