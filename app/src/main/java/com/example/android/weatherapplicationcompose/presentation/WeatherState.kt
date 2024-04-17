package com.example.android.weatherapplicationcompose.presentation

import com.example.android.weatherapplicationcompose.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)