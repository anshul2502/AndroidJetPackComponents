package com.app.androidarchitecture.viewmodel

import androidx.lifecycle.ViewModel

class ActivityViewModel:ViewModel() {

    private var count:Int = 0


    fun getCount():Int{
        return count
    }

    fun updateCount():Int{
        return ++count
    }



}