package com.example.bustowork.repository

import com.example.bustowork.data.api.darasource.RemoteCityDataSource
import com.example.bustowork.model.City
import com.example.bustowork.model.CityResponse
import com.example.bustowork.model.repository.CityRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.lang.Exception

class CityRepositoryImpl(
    private val remoteCityDataSource: RemoteCityDataSource,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
): CityRepository {
    override suspend fun getCityData(): CityResponse = withContext(ioDispatcher) {
        try {
            remoteCityDataSource.getCityData()
        } catch (e: Exception) {
            throw e
        }
    }
}