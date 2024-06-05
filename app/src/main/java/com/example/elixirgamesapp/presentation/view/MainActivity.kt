package com.example.elixirgamesapp.presentation.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.elixirgamesapp.R
import com.example.elixirgamesapp.data.network.api.VideoGameService
import com.example.elixirgamesapp.data.network.retrofit.RetrofitHelper
import com.example.elixirgamesapp.data.repository.VideoGameImplement
import com.example.elixirgamesapp.data.repository.VideoGameRepository
import com.example.elixirgamesapp.databinding.ActivityMainBinding
import com.example.elixirgamesapp.domain.VideoGameUserCase
import com.example.elixirgamesapp.presentation.viewModel.VideoGameViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val apiService = RetrofitHelper.getRetrofit().create(VideoGameService::class.java)
        val repository = VideoGameImplement(apiService)
        val userCase = VideoGameUserCase(repository)

        val viewModel = ViewModelProvider(this).get(VideoGameViewModel::class.java)

        }
    }
