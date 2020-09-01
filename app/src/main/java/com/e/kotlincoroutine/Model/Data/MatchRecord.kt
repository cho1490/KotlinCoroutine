package com.e.kotlincoroutine.Model.Data

class MatchRecord {

        var matches : ArrayList<Match>? = null

        class Match{

                var platformId: String? = null
                var gameId: Long? = null
                var champion: Int? = null
                var queue: Int? = null
                var season: Int? = null
                var timestamp: Long? = null
                var role: String? = null
                var lane: String? = null

        }

}