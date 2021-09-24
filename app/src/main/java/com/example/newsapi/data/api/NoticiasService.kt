package com.example.newsapi.data.api

import com.example.newsapi.data.model.Noticias
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NoticiasService {
    @GET("v2/top-headlines")
    fun getPrincipaisNoticias(
        @Query("country") country : String,
        @Query("apiKey") apiKey: String
    ): Response<Noticias>
}

