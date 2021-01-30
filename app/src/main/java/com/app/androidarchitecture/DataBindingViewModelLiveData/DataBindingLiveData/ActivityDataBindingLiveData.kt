package com.app.androidarchitecture.DataBindingViewModelLiveData.DataBindingLiveData

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.app.androidarchitecture.R
import com.app.androidarchitecture.databinding.DatabindingLiveDataViewBinding

class ActivityDataBindingLiveData:AppCompatActivity() {

    private lateinit var dataBinding:DatabindingLiveDataViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         dataBinding = DataBindingUtil.setContentView(this, R.layout.databinding_live_data_view)
         val viewModel:DataBindingLiveDataViewModel = ViewModelProvider(this).get(DataBindingLiveDataViewModel::class.java)

        //Binding view to ModelView
        dataBinding.databindingLivedataViewModel = viewModel

        //Binding View to LiveData
        dataBinding.lifecycleOwner = this

    }

}