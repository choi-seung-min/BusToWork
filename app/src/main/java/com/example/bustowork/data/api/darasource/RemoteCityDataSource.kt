package com.example.bustowork.data.api.darasource

import android.widget.Toast
import com.example.bustowork.data.CityApi
import com.example.bustowork.model.City
import com.example.bustowork.model.CityResponse
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.lang.Exception

interface RemoteCityDataSource {
    suspend fun getCityData(): CityResponse
}

class RemoteCityDataSourceImpl(
    private val cityApi: CityApi,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
): RemoteCityDataSource {
    override suspend fun getCityData(): CityResponse = withContext(ioDispatcher){
        try {
            cityApi.getCityCodeList()
        } catch (e: Exception) {
            throw e
        }
    }
}