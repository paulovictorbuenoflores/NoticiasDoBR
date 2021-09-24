package com.example.newsapi.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapi.data.model.Article
import com.example.newsapi.databinding.ListItemBinding

class NoticiasAdapter (): RecyclerView.Adapter<NoticiasAdapter.NoticiasAdapterViewHolder>() {

    private val listaNoticias = ArrayList<Article>()

    fun setList(artists:List<Article>){
        listaNoticias.clear()
        listaNoticias.addAll(artists)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoticiasAdapterViewHolder {
        var binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NoticiasAdapterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NoticiasAdapterViewHolder, position: Int) {
        holder.bind(listaNoticias[position])
    }

    override fun getItemCount(): Int {
        return listaNoticias.size
    }

    class NoticiasAdapterViewHolder(var binding : ListItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(noticia : Article){
            binding.txtListItemNomeAutor.text = noticia.author.toString()
            binding.txtListItemDescricao.text = noticia.description.toString()
            binding.txtListItemNomeNews.text = noticia.title.toString()
            binding.txtListItemPublicacao.text = noticia.publishedAt.toString()
        }
    }
}