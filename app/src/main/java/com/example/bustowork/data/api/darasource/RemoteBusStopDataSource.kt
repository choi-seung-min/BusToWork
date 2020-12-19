package com.example.bustowork.data.api.darasource

import com.example.bustowork.data.BusApi
import com.example.bustowork.model.City
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.lang.Exception

interface RemoteBusStopDataSource {

    suspend fun getCityData(): List<City>

    suspend fun getBusStopData(cityCode: String, nodeNm: String, )
}

class RemoteBusStopDataSourceImpl(
    private val busDataApi: BusApi
) : RemoteBusStopDataSource {

    override suspend fun getCityData(): List<City> = withContext(Dispatchers.IO) {
        try {
            busDataApi.getCityCodeList()
        } catch (e: Exception) {
            throw e
        }
    }

    override suspend fun getBusStopData(cityCode: String, nodeNm: String) {
        TODO("Not yet implemented")
    }
}