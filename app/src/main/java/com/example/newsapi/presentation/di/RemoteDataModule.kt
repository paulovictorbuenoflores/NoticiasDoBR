package com.example.newsapi.presentation.di

import com.example.newsapi.data.api.NoticiasService
import com.example.newsapi.data.repository.datasourceimpl.RemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(noticiasService: NoticiasService): RemoteDataSourceImpl {
        return RemoteDataSourceImpl(
           noticiasService,
            "br",
            "390479b539504208affee84fe60035fe"
        )
    }
}