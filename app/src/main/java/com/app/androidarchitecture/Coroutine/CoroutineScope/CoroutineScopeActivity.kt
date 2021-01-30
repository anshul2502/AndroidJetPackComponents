package com.app.androidarchitecture.Coroutine.CoroutineScope

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.app.androidarchitecture.R
import kotlinx.android.synthetic.main.global_scope_view.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CoroutineScopeActivity:AppCompatActivity() {

    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.coroutine_scope_view)

        btnCount.setOnClickListener {
            tvCount.text = count++.toString()
        }
        btnDownloadUserData.setOnClickListener {

            CoroutineScope(Dispatchers.IO).launch {
                downloadUserData()
            }
        }
    }

    private suspend fun downloadUserData() {
        withContext(Dispatchers.Main) {
            for (i in 1..200000) {
                Log.i("MyTag", "Downloading user $i in ${Thread.currentThread().name}")
            }
        }
    }
}