package com.example.newsapi.presentation.di

import com.example.newsapi.presentation.adapter.NoticiasAdapter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AdapterModule {

    @Singleton
    @Provides
    fun dafdfadf():NoticiasAdapter{
        return NoticiasAdapter()
    }
}