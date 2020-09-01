package com.e.kotlincoroutine.Model.Data

class MatchList {

        var matches : ArrayList<MatchReference>? = null

        class MatchReference{

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