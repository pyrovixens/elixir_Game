package com.example.elixirgamesapp.domain

import com.example.elixirgamesapp.data.repository.VideoGameImplement
import com.example.elixirgamesapp.data.response.VideoGameresponse

class VideoGameUserCase (private val repository : VideoGameImplement) {
    suspend fun getAllVideoGamesOnStock() : MutableList<VideoGameresponse>{
       return repository.fetchVideoGames()
    }

}