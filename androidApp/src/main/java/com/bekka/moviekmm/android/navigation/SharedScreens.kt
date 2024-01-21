package com.bekka.moviekmm.android.navigation

import cafe.adriel.voyager.core.registry.ScreenProvider

sealed class SharedScreen : ScreenProvider {
    data object MainMovies : SharedScreen()
    data class Details(val id: String) : SharedScreen()
}