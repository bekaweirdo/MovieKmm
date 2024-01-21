package com.bekka.moviekmm.android

import android.app.Application
import cafe.adriel.voyager.core.registry.ScreenRegistry
import com.bekka.moviekmm.android.di.initialAppModules
import com.bekka.moviekmm.android.navigation.featurePostsScreenModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MovieApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MovieApplication)
            modules(initialAppModules)
        }

        ScreenRegistry {
            featurePostsScreenModule()
        }
    }
}