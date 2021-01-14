package com.example.myweatherapp

data class LocationWeatherModel(
        var id: Int,
        var name: String,
        var country: String,
        val lat: Double,
        val lon: Double,
        val threeHourlyRainVolume: Double,
        var threeHourlySnowVolume: Double,
        var windSpeed: Double?,
        var weatherDescription: String?,
        var temp: Int,
        var tempMax: Int,
        var tempMin: Int,
        var humidity: Int,
        var pressure: Int,
        var feelsLike: Int,
        var clouds: Int
)