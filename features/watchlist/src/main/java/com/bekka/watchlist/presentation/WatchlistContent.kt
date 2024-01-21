package com.bekka.watchlist.presentation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen

class WatchlistContent: Screen {
    @Composable
    override fun Content() {
        Text(
            text = "This is WatchlistContent damn boooooy!"
        )
    }
}