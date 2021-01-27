package com.app.androidarchitecture.DataBinding

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.app.androidarchitecture.R
import com.app.androidarchitecture.databinding.DataBindingBasicViewBinding

class DataBindingBasic:AppCompatActivity() {

    private lateinit var dataBindingBasic: DataBindingBasicViewBinding
    private var count:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBindingBasic = DataBindingUtil.setContentView(this,R.layout.data_binding_basic_view)

        //TextView
        dataBindingBasic.tvNumber.text = String.format("%d", count)

        //Button Click Event
        dataBindingBasic.btAdd.setOnClickListener{
            
            //EditText
            val entertedNumber:EditText = dataBindingBasic.etNumber

            if(!entertedNumber.text.isNullOrBlank()){
                dataBindingBasic.tvNumber.text = (count + entertedNumber.text.toString().toInt()).toString()
            }
        }
    }
}