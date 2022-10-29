package com.modelairplanes.di

import com.modelairplanes.ui.splash.SplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel {
        SplashViewModel(
            firebaseAuth = get()
        )
    }
}