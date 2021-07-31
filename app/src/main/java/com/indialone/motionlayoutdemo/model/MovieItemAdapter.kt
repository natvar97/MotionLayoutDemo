package com.indialone.motionlayoutdemo.model

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.indialone.motionlayoutdemo.databinding.MovieItemLayoutBinding

class MovieItemAdapter(
    private val movieList: ArrayList<Movie>
) : RecyclerView.Adapter<MovieItemAdapter.MovieItemViewHolder>() {
    class MovieItemViewHolder(itemView: MovieItemLayoutBinding) :
        RecyclerView.ViewHolder(itemView.root) {
        private val movieTitle = itemView.tvMovieTitle
        private val movieIMDb = itemView.tvMovieImdb
        private val movieDirector = itemView.tvMovieDirector
        private val moviePoster = itemView.ivPoster

        fun bind(movie: Movie) {
            movieTitle.text = movie.title
            movieIMDb.text = movie.imdb
            movieDirector.text = movie.director
            Glide.with(itemView.context)
                .load(movie.poster)
                .into(moviePoster)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieItemViewHolder {
        val view =
            MovieItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieItemViewHolder, position: Int) {
        holder.bind(movieList[position])
    }

    override fun getItemCount(): Int {
        return movieList.size
    }
}