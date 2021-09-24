package com.example.newsapi.presentation.di

import com.example.newsapi.data.api.NoticiasService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetModule {
    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://newsapi.org/")
            .build()
    }

    @Singleton
    @Provides
    fun provideGitHubAPIService(retrofit: Retrofit): NoticiasService {
        return retrofit.create(NoticiasService::class.java)
    }
}