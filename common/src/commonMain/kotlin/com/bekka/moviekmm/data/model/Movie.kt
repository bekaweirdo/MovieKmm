package com.bekka.moviekmm.data.model

data class Movie(
    val id: Int,
    val movie: String,
    val rating: Double,
    val image: String,
    val imdbUrl: String
)