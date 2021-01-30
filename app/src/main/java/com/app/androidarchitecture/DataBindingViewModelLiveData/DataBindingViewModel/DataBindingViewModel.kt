package com.app.androidarchitecture.DataBindingViewModelLiveData.DataBindingViewModel

import androidx.lifecycle.ViewModel

class DataBindingViewModel:ViewModel() {

    private var count:Int = 0

    fun getCount():Int{
        return count
    }

    fun updateCount():Int{
        return ++count
    }

}