package com.example.elixirgamesapp.presentation.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.elixirgamesapp.data.response.VideoGameresponse
import com.example.elixirgamesapp.domain.VideoGameUserCase
import kotlinx.coroutines.launch

class VideoGameViewModel(private val userCase: VideoGameUserCase): ViewModel() {
    private var videoGameList = MutableLiveData<MutableList<VideoGameresponse>>()

    val videoGamesLV
        get() = videoGameList


    init {
        viewModelScope.launch {
            videoGameList.value = userCase.getAllVideoGamesOnStock()
        }

    }
}