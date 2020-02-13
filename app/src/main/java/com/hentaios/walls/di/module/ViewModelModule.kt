package com.hentaios.walls.di.module

import com.hentaios.walls.ui.WallViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { WallViewModel(get()) }
}