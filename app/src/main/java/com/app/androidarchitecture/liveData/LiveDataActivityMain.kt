package com.app.androidarchitecture.liveData

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.app.androidarchitecture.R
import com.app.androidarchitecture.databinding.ActivityMainViewBinding

class LiveDataActivityMain:AppCompatActivity() {

    private lateinit var binding:ActivityMainViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main_view)

        //Initialization of ViewModel Class
        val viewModel: LiveDataViewModel = ViewModelProvider(this).get(LiveDataViewModel::class.java)

        //Observing the count
        viewModel.count.observe(this, Observer {
            binding.tvCount.text = viewModel.count.toString()
        })


        binding.btAdd.setOnClickListener {
            val value:String = binding.etNumber.text.toString()
            //Setting value in observer
            viewModel.setValue(value.toInt())
        }

    }

}