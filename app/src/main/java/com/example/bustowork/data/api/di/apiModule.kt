package com.example.bustowork.data.api.di

import com.example.bustowork.data.BusApi
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val apiModule = module {
    single {
        HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }

    single {
        Retrofit.Builder()
            .baseUrl("https://thikira.jepanglee.page/api/user/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(BusApi::class.java)
    }
}