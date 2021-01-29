package com.app.androidarchitecture.viewmodel

import androidx.lifecycle.ViewModel

class ActivityViewModel(intCount:Int):ViewModel() {

    private var count:Int = 0


    init {
        count = intCount
    }


    fun getCount():Int{
        return count
    }

    fun updateCount():Int{
        return ++count
    }



}