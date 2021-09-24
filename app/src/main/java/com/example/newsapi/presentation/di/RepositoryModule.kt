package com.example.newsapi.presentation.di

import com.example.newsapi.data.repository.NoticiasRepositoryImpl
import com.example.newsapi.data.repository.datasource.CacheDataSource
import com.example.newsapi.data.repository.datasource.LocalDataSource
import com.example.newsapi.data.repository.datasource.RemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    @Singleton
    fun provideNoticiasRepositoryImpl(
        remoteDataSource: RemoteDataSource,
        localDataSource: LocalDataSource,
        cacheDataSource: CacheDataSource
    ): NoticiasRepositoryImpl {

        return NoticiasRepositoryImpl(
            cacheDataSource,
            localDataSource,
            remoteDataSource
        )


    }
}