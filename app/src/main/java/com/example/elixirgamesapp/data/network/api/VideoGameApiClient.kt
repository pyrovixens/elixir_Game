package com.example.elixirgamesapp.data.network.api

import com.example.elixirgamesapp.data.network.retrofit.RetrofitHelper
import com.example.elixirgamesapp.data.response.VideoGameresponse

class VideoGameApiClient {
    private val retrofit = RetrofitHelper.getRetrofit()

   suspend fun getVideoGames():MutableList<VideoGameresponse>{

    val response =retrofit.create(VideoGameService::class.java).getAllVideoGAmes()
    return response

       }
}