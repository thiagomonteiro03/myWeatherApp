package com.example.myweatherapp

class ApiUrls {

    companion object{
        private var baseUrl = "http://api.openweathermap.org/"
        private var appId = "&appid=2d06429fbe1b359bc8d42fc55301d37a"

        var coordinates = baseUrl + "data/2.5/weather?units=metric&lat=%s&lon=%s" + appId
    }

}