package com.example.bustowork.data

import com.example.bustowork.model.City
import retrofit2.http.GET

interface BusApi {
    @GET("")
    suspend fun getCityCodeList(): List<City>
}