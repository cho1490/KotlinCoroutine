package com.e.kotlincoroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.e.kotlincoroutine.Model.RetrofitClient
import com.e.kotlincoroutine.Model.SummonerAPI
import kotlinx.coroutines.*
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    private var retrofit : Retrofit? = null
    private var myAPI: SummonerAPI? = null
    private var api_key : String = "RGAPI-2f5ef770-6152-4dea-a80b-0c3fb0d5e73b"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        retrofit = RetrofitClient.getInstance()
        myAPI = RetrofitClient.getServer()


        GlobalScope.launch(Dispatchers.Main) {
            val response = myAPI!!.getSummoner("원주콩", api_key)
            println("csh : " + response.body()!!.accountId)
        }

    }
}