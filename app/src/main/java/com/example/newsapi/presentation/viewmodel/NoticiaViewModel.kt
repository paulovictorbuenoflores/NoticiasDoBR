package com.example.newsapi.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.newsapi.domain.usecase.GetPrincipaisNoticiasUseCase

class NoticiaViewModel(private val getPrincipaisNoticiasUseCase: GetPrincipaisNoticiasUseCase):ViewModel() {
    fun getNoticias() = liveData{
        val noticiasList = getPrincipaisNoticiasUseCase.execute()
        emit(noticiasList)
    }
}