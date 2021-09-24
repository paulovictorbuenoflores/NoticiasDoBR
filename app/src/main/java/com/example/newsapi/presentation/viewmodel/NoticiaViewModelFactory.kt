package com.example.newsapi.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.newsapi.domain.usecase.GetPrincipaisNoticiasUseCase

class NoticiaViewModelFactory(
    private val getPrincipaisNoticiasUseCase: GetPrincipaisNoticiasUseCase
) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NoticiaViewModel(
            getPrincipaisNoticiasUseCase
        ) as T
    }
}