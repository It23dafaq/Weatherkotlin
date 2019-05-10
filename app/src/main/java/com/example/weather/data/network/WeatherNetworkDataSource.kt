package com.example.weather.data.network

import androidx.lifecycle.LiveData
import com.example.weather.data.db.entity.Location
import com.example.weather.data.network.response.CurrentWeatherResponse
import org.intellij.lang.annotations.Language

interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>
   // val downloadedFutureWeather: LiveData<FutureWeatherResponse>

    suspend fun fetchCurrentWeather(
        location: String,
        languageCode: String
    )

}