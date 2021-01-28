package com.app.androidarchitecture.viewmodel

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.app.androidarchitecture.R
import com.app.androidarchitecture.databinding.ActivityMainViewBinding

class ActivityMain:AppCompatActivity() {

    private lateinit var binding:ActivityMainViewBinding

    override fun setContentView(view: View?) {
        super.setContentView(view)

        //Initiazing the data binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main_view)

        //Viewmodel Factory which will be used to pass constructor value in view model class
        val modelFactory = ActivityViewModelFactory(22)

        //Initialization of ViewModel Class
        val viewModel:ActivityViewModel = ViewModelProvider(this,modelFactory).get(ActivityViewModel::class.java)

        //TextView Data Binding
        binding.tvCount.text = viewModel.getCount().toString()

        //Button Data Binding
        binding.btAdd.setOnClickListener {
            binding.tvCount.text = viewModel.updateCount().toString()
        }

    }

}