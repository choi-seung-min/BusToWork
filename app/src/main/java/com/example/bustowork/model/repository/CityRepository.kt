package com.example.bustowork.model.repository

import com.example.bustowork.model.City
import com.example.bustowork.model.CityResponse

interface CityRepository {
    suspend fun getCityData(): CityResponse
}