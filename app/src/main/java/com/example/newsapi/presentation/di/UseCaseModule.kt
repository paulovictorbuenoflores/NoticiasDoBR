package com.example.newsapi.presentation.di

import com.example.newsapi.domain.repository.NoticiasRepository
import com.example.newsapi.domain.usecase.GetPrincipaisNoticiasUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Singleton
    @Provides
    fun provide(noticiasRepository: NoticiasRepository): GetPrincipaisNoticiasUseCase{
        return GetPrincipaisNoticiasUseCase(noticiasRepository)
    }
}