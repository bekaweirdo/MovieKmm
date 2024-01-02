package com.bekka.moviekmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform