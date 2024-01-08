package com.bekka.moviekmm.data.api

import com.bekka.moviekmm.data.model.Movie

interface MovieRemoteApi {
    suspend fun getMovies(): List<Movie>
}