package com.example.bustowork.data.api.darasource

import com.example.bustowork.data.BusApi
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.lang.Exception

interface RemoteBusStopDataSource {
    suspend fun getBusStopData(cityCode: String, nodeNm: String, )
}

class RemoteBusStopDataSourceImpl(
    private val busDataApi: BusApi,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : RemoteBusStopDataSource {
    override suspend fun getBusStopData(cityCode: String, nodeNm: String) = withContext(ioDispatcher) {
//        TODO("Not yet implemented")
    }
}