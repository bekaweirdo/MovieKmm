package com.bekka.moviekmm.android

import android.app.Application
import com.bekka.moviekmm.android.di.initialAppModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MovieApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MovieApplication)
            modules(initialAppModules)
        }
    }
}