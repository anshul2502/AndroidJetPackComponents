package com.app.androidarchitecture.liveData

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.app.androidarchitecture.R
import com.app.androidarchitecture.databinding.ActivityMainViewBinding

class LiveDataActivityMain:AppCompatActivity() {

    private lateinit var binding:ActivityMainViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main_view)

    }

}