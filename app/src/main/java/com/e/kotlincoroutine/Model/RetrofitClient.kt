package com.e.kotlincoroutine.Model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private var instance : Retrofit? = null

    fun getServer(): SummonerAPI = instance!!.create(
        SummonerAPI::class.java)


    fun getInstance() : Retrofit {
        if(instance == null){
            instance = Retrofit.Builder()
                .baseUrl("https://kr.api.riotgames.com/lol/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return instance!!
    }
}