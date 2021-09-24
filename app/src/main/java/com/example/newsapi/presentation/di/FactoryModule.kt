package com.example.newsapi.presentation.di

import android.app.Application
import com.example.newsapi.domain.usecase.GetPrincipaisNoticiasUseCase
import com.example.newsapi.presentation.viewmodel.NoticiaViewModel
import com.example.newsapi.presentation.viewmodel.NoticiaViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {

    @Singleton
    @Provides
    fun provideNoticiasViewModelFactory(
        getPrincipaisNoticiasUseCase: GetPrincipaisNoticiasUseCase
    ): NoticiaViewModelFactory{
        return NoticiaViewModelFactory(
            getPrincipaisNoticiasUseCase
        )
    }
}