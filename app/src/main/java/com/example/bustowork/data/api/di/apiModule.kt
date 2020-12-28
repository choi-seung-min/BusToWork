package com.example.bustowork.data.api.di

import com.example.bustowork.data.BusApi
import com.example.bustowork.data.CityApi
import com.example.bustowork.data.api.darasource.RemoteCityDataSource
import com.example.bustowork.data.api.darasource.RemoteCityDataSourceImpl
import com.example.bustowork.data.api.interceptor.ServiceKeyInterceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.simplexml.SimpleXmlConverterFactory

val apiModule = module {
    single {
        HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }

    single {
        Retrofit.Builder()
            .baseUrl("https://openapi.tago.go.kr/openapi/service/BusSttnInfoInqireService/getSttnNoList/")
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(BusApi::class.java)
    }

    single {
        Retrofit.Builder()
            .baseUrl("http://openapi.tago.go.kr/openapi/service/BusSttnInfoInqireService/")
            .client(
                OkHttpClient.Builder()
                    .addInterceptor(ServiceKeyInterceptor())
                    .addInterceptor(get<HttpLoggingInterceptor>())
                    .build()
            )
            .addConverterFactory(SimpleXmlConverterFactory.create())
            .build().create(CityApi::class.java)
    }

    factory<RemoteCityDataSource> { RemoteCityDataSourceImpl(get()) }
}