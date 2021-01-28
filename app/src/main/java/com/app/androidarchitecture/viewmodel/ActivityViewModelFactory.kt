package com.app.androidarchitecture.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ActivityViewModelFactory(private val count:Int):ViewModelProvider.Factory {


    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        if(modelClass.isAssignableFrom(ActivityViewModel::class.java)){

            return ActivityViewModelFactory(count) as T

        }

        throw IllegalArgumentException("Unknown model view class")

    }


}