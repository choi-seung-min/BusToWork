package com.example.bustowork.ui.activity

import android.os.Bundle
import com.example.bustowork.R
import com.example.bustowork.base.BaseActivity
import com.example.bustowork.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val layoutResourceId: Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}