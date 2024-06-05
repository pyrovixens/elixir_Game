package com.example.elixirgamesapp.data.network.api

import com.example.elixirgamesapp.data.response.VideoGameresponse
import retrofit2.http.GET

interface VideoGameService {
    @GET("games")
    suspend fun getAllVideoGAmes(): MutableList<VideoGameresponse>
}