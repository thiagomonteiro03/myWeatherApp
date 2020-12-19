package com.example.myweatherapp

import com.google.gson.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*

class RetrofitInitializer {

    fun getRetrofit() : Retrofit {

        //TODO put your URL
        return Retrofit.Builder().baseUrl("api.openweathermap.org/")
                .addConverterFactory(GsonConverterFactory.create(GsonBuilder()
                .registerTypeAdapter(Date::class.java, JsonDeserializer { json, typeOfT, context -> Date(json.asJsonPrimitive.asString.replace("\\D+".toRegex(), "").toLong()) }).create()))
                .build()

    }

}