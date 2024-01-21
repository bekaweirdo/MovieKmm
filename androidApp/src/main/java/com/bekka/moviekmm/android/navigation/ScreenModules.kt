package com.bekka.moviekmm.android.navigation

import cafe.adriel.voyager.core.registry.ScreenRegistry
import cafe.adriel.voyager.core.registry.screenModule
import com.bekka.watchlist.presentation.WatchlistContent
import com.bekka.watchlist_details.presentation.WatchlistDetailsContent

val featurePostsScreenModule = screenModule {
    ScreenRegistry {
        register<SharedScreen.MainMovies> {
            WatchlistContent()
        }
        register<SharedScreen.Details> {
            WatchlistDetailsContent()
        }
    }
}