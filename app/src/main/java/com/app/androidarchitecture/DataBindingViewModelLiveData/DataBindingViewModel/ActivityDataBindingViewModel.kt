package com.app.androidarchitecture.DataBindingViewModelLiveData.DataBindingViewModel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.app.androidarchitecture.R
import com.app.androidarchitecture.databinding.DatabindingViewModelViewBinding

class ActivityDataBindingViewModel:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dataBinding:DatabindingViewModelViewBinding = DataBindingUtil.setContentView(this, R.layout.databinding_view_model_view)

        val viewModel:DataBindingViewModel = ViewModelProvider(this).get(DataBindingViewModel::class.java)

        dataBinding.databindingViewModel = viewModel

    }

}