package com.example.bustowork.repository.di

import com.example.bustowork.model.repository.CityRepository
import com.example.bustowork.repository.CityRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    factory<CityRepository> { CityRepositoryImpl(get()) }
}