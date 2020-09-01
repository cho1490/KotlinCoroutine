package com.e.kotlincoroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.e.kotlincoroutine.Model.Data.MatchRecord
import com.e.kotlincoroutine.Model.RetrofitClient
import com.e.kotlincoroutine.Model.SummonerAPI
import kotlinx.coroutines.*
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    private var api_key : String = "RGAPI-aa58555d-119d-40b0-95ce-efd92ceee203"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RetrofitClient.getInstance()
        val myAPI = RetrofitClient.getServer()


        GlobalScope.launch(Dispatchers.Main) {
            val response = myAPI.getSummoner("deepredk", api_key)

            if (response.isSuccessful) {
                println("csh response : " + response.body()!!.accountId)

                val response2 = myAPI.getMatchList(response.body()!!.accountId!!, api_key)
                if (response2.isSuccessful){
                    for(match in response2.body()!!.match!!){
                        println("csh response2 : " + match.champion)
                    }
                }
            }
        }
    }

}