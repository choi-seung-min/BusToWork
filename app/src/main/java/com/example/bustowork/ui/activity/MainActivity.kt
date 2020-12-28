package com.example.bustowork.ui.activity

import android.os.Bundle
import com.example.bustowork.R
import com.example.bustowork.base.BaseActivity
import com.example.bustowork.databinding.ActivityMainBinding
import com.example.bustowork.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val layoutResourceId: Int = R.layout.activity_main

    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.viewModel = viewModel
    }
}