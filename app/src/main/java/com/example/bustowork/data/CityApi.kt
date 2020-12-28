package com.example.bustowork.data

import com.example.bustowork.model.City
import com.example.bustowork.model.CityResponse
import retrofit2.http.GET

interface CityApi {
    @GET("getCtyCodeList")
    suspend fun getCityCodeList(): CityResponse
}