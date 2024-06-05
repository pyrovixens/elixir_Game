package com.example.elixirgamesapp.presentation.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.elixirgamesapp.domain.VideoGameUserCase

class ViewModelFactory(private val videoGameUserCase: VideoGameUserCase): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return super.create(modelClass)
    }
}