package com.e.kotlincoroutine.Model.Data

import com.google.gson.annotations.SerializedName

class MatchRecord {

        @SerializedName("matches")
        var match : ArrayList<Match>? = null

        class Match{

                @SerializedName("platformId")
                var platformId: String? = null
                @SerializedName("gameId")
                var gameId: String? = null
                @SerializedName("champion")
                var champion: String? = null
                @SerializedName("queue")
                var queue: String? = null
                @SerializedName("season")
                var season: String? = null
                @SerializedName("timestamp")
                var timestamp: String? = null
                @SerializedName("role")
                var role: String? = null
                @SerializedName("lane")
                var lane: String? = null

                override fun toString(): String {
                        return "[platformId = $platformId, gameId = $gameId, champion = $champion, queue = $queue, season = $season, timestamp = $timestamp, role = $role, lane = $lane]"
                }

        }

}