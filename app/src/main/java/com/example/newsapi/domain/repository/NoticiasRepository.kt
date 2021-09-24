package com.example.newsapi.domain.repository

import com.example.newsapi.data.model.Article
import com.example.newsapi.data.model.Noticias
import retrofit2.Response

interface NoticiasRepository{
    suspend fun getNoticiasAPI(): Response<Noticias>
}