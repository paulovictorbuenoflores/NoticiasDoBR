package com.example.newsapi.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsapi.R
import com.example.newsapi.databinding.ActivityMainBinding
import com.example.newsapi.presentation.adapter.NoticiasAdapter
import com.example.newsapi.presentation.viewmodel.NoticiaViewModel
import com.example.newsapi.presentation.viewmodel.NoticiaViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var noticiasAdapter: NoticiasAdapter

    @Inject
    lateinit var viewModelFactory: NoticiaViewModelFactory

    lateinit var viewModel: NoticiaViewModel
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this, viewModelFactory)
            .get(NoticiaViewModel::class.java)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = noticiasAdapter

        var noticias = viewModel.getNoticias()
        noticias.observe(this, Observer {
            noticiasAdapter.setList(it.body()!!.articles)
            noticiasAdapter.notifyDataSetChanged()
        })
    }
}
