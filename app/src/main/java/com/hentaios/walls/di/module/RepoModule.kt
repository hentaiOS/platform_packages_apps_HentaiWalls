package com.hentaios.walls.di.module

import com.hentaios.walls.repo.WallpaperRepo
import org.koin.dsl.module

val repoModule = module {
    factory { WallpaperRepo(get()) }
}