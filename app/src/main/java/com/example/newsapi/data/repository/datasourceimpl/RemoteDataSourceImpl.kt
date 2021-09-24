package com.example.newsapi.data.repository.datasourceimpl

import com.example.newsapi.data.api.NoticiasService
import com.example.newsapi.data.model.Noticias
import com.example.newsapi.data.repository.datasource.RemoteDataSource
import retrofit2.Response

class RemoteDataSourceImpl(private val noticiasService: NoticiasService, private val country: String, private val apiKey: String): RemoteDataSource {
    override suspend fun getNoticias(): Response<Noticias> {
        return noticiasService.getPrincipaisNoticias(country, apiKey)
    }
}