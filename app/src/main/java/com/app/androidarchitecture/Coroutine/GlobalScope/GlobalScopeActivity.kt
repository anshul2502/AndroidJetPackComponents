package com.app.androidarchitecture.Coroutine.GlobalScope

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.app.androidarchitecture.R
import kotlinx.android.synthetic.main.global_scope_view.*
import kotlinx.coroutines.*

class GlobalScopeActivity:AppCompatActivity() {

    private var count:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.global_scope_view)


        btnCount.setOnClickListener {
            tvCount.text = count++.toString()
        }
        btnDownloadUserData.setOnClickListener {

            GlobalScope.launch {
                downloadUserData()
            }
        }
    }

    private suspend fun downloadUserData() {
        withContext(Dispatchers.Main){
            for (i in 1..200000) {
                Log.i("MyTag", "Downloading user $i in ${Thread.currentThread().name}")
            }
        }
    }
}
