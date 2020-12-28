package com.example.bustowork.base

import android.app.Application
import android.content.Context
import com.example.bustowork.data.api.di.apiModule
import com.example.bustowork.repository.di.repositoryModule
import com.example.bustowork.viewmodel.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApplication: Application() {

    companion object {
        private var context: Context? = null

        val appContext: Context?
            get() = context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext

        startKoin {
            androidContext(this@BaseApplication)
            modules(
                listOf(
                    apiModule,
                    repositoryModule,
                    viewModelModule
                )
            )
        }
    }
}