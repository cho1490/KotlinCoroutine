package com.e.kotlincoroutine.Model

import com.e.kotlincoroutine.Model.Data.Match
import com.e.kotlincoroutine.Model.Data.MatchList
import com.e.kotlincoroutine.Model.Data.Summoner
import retrofit2.Response
import retrofit2.http.*

interface SummonerAPI {

    @GET("summoner/v4/summoners/by-name/{summonerName}")
    suspend fun getSummoner(
        @Path("summonerName") summonerName : String,
        @Query("api_key") api_key : String
    ) : Response<Summoner>

    @GET("match/v4/matchlists/by-account/{encryptedAccountId}")
    suspend fun getMatchList(
        @Path("encryptedAccountId") encryptedAccountId : String,
        @Query("api_key") api_key : String
    ) : Response<MatchList>

    @GET("match/v4/matches/{matchId}")
    suspend fun getMatchInfo(
        @Path("matchId") matchId : String,
        @Query("api_key") api_key : String
    ) : Response<Match>

}