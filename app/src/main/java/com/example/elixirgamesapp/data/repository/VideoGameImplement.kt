package com.example.elixirgamesapp.data.repository

import com.example.elixirgamesapp.data.network.api.VideoGameService
import com.example.elixirgamesapp.data.response.VideoGameresponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class VideoGameImplement (private var apiservice :VideoGameService) : VideoGameRepository {
    override suspend fun fetchVideoGames(): MutableList<VideoGameresponse> {
       return withContext(Dispatchers.IO){
           var listVideogames = apiservice.getAllVideoGAmes()
           listVideogames
       }
    }

}