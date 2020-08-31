package com.e.kotlincoroutine.Model

import com.e.kotlincoroutine.Model.Data.Summoner
import retrofit2.Response
import retrofit2.http.*

interface SummonerAPI {

    @GET("summoner/v4/summoners/by-name/{summonerName}")
    suspend fun getSummoner(
        @Path("summonerName") summonerName : String,
        @Query("api_key") api_key : String
    ): Response<Summoner>

}