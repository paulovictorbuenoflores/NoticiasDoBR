package com.example.newsapi.domain.usecase

import com.example.newsapi.data.model.Article
import com.example.newsapi.data.model.Noticias
import com.example.newsapi.domain.repository.NoticiasRepository
import retrofit2.Response

class GetPrincipaisNoticiasUseCase(private val noticiasRepository: NoticiasRepository) {
    suspend fun execute(): Response<Noticias> {
        return noticiasRepository.getNoticiasAPI()
    }
}