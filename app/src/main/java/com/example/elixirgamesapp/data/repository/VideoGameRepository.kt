package com.example.elixirgamesapp.data.repository

import com.example.elixirgamesapp.data.response.VideoGameresponse

interface VideoGameRepository {
    suspend fun fetchVideoGames(): MutableList<VideoGameresponse>

}