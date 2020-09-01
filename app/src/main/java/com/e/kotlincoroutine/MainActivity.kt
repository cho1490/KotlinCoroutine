package com.e.kotlincoroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.e.kotlincoroutine.Model.Data.Match
import com.e.kotlincoroutine.Model.RetrofitClient
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    private var api_key : String = "RGAPI-aa58555d-119d-40b0-95ce-efd92ceee203"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RetrofitClient.getInstance()
        val myAPI = RetrofitClient.getServer()

        var beforeTime : Long = System.currentTimeMillis();

        GlobalScope.launch(Dispatchers.Main) {
            val response = myAPI.getSummoner("deepredk", api_key)
            if (response.isSuccessful) {

                val response2 = myAPI.getMatchList(response.body()!!.accountId!!, api_key)
                if (response2.isSuccessful){

                    for(match in response2.body()!!.matches!!){

                        val response3 = myAPI.getMatchInfo(match.gameId.toString(), api_key)
                        if(response3.isSuccessful){

                        }

                    }
                }

            }
            var afterTime : Long = System.currentTimeMillis();
            println("csh : time = " + (afterTime - beforeTime)/1000 + " sec")
        }

    }

}