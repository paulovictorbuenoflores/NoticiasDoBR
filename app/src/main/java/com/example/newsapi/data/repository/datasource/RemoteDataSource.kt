package com.example.newsapi.data.repository.datasource

import com.example.newsapi.data.model.Noticias
import retrofit2.Response

interface RemoteDataSource {
    suspend fun getNoticias(): Response<Noticias>
}