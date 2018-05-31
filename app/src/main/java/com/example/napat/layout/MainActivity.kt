package com.example.napat.layout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun on_bt_Fream_layout(){
        setContentView(R.layout.frame_layout)
    }
    fun Back_click(){
        setContentView(R.layout.activity_main)
    }
}
