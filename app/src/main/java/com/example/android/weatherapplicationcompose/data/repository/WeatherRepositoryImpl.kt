package com.example.android.weatherapplicationcompose.data.repository

import com.example.android.weatherapplicationcompose.data.mappers.toWeatherInfo
import com.example.android.weatherapplicationcompose.data.remote.WeatherApi
import com.example.android.weatherapplicationcompose.domain.repository.WeatherRepository
import com.example.android.weatherapplicationcompose.domain.util.Resource
import com.example.android.weatherapplicationcompose.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
): WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(data = api.getWeatherData(lat = lat, long = long).toWeatherInfo())
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}