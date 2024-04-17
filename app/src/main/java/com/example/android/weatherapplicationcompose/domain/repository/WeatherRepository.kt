package com.example.android.weatherapplicationcompose.domain.repository

import com.example.android.weatherapplicationcompose.domain.util.Resource
import com.example.android.weatherapplicationcompose.domain.weather.WeatherInfo

interface WeatherRepository {

    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}