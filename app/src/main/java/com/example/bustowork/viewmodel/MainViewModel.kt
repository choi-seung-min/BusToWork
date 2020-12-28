package com.example.bustowork.viewmodel

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bustowork.model.CityResponse
import com.example.bustowork.model.repository.CityRepository
import kotlinx.coroutines.launch
import java.lang.Exception

class MainViewModel(
    private val cityRepository: CityRepository,
    private val context: Context
) : ViewModel() {

    private val _cities: MutableLiveData<CityResponse> = MutableLiveData()
    val cities: LiveData<CityResponse> = _cities

    fun getCityData() = viewModelScope.launch {
        try {
            _cities.value = cityRepository.getCityData()

            Log.d("main view model", _cities.value.toString())
            //제대로 오는 것 같음
            //recyclerview로 확인
        } catch (e: Exception) {
            throw e
        }
    }
}