package com.example.napat.layout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun on_bt_Fream_layout(view: View){
        setContentView(R.layout.frame_layout)
    }
    fun Back_click(view: View){
        setContentView(R.layout.activity_main)
    }
    fun bt_Linear_layout(view: View){
        setContentView(R.layout.linear_layout)
    }
    fun bt_Relative_layout(view: View){
        setContentView(R.layout.relative_layout)
    }
}
