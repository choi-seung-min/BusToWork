package com.example.bustowork.base

import android.app.Application
import android.content.Context

class BaseApplication: Application() {

    companion object {
        private var context: Context? = null

        val appContext: Context?
            get() = context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}