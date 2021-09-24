package com.example.newsapi.data.repository

import com.example.newsapi.data.model.Article
import com.example.newsapi.data.model.Noticias
import com.example.newsapi.data.repository.datasource.CacheDataSource
import com.example.newsapi.data.repository.datasource.LocalDataSource
import com.example.newsapi.data.repository.datasource.RemoteDataSource
import com.example.newsapi.domain.repository.NoticiasRepository
import retrofit2.Response

class NoticiasRepositoryImpl(
    private val cacheDataSource: CacheDataSource,
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource
) : NoticiasRepository {
    override suspend fun getNoticiasAPI(): Response<Noticias> {
        return remoteDataSource.getNoticias()
    }
}