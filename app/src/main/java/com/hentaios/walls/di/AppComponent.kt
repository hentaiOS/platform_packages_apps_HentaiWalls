package com.hentaios.walls.di

import com.hentaios.walls.di.module.apiModule
import com.hentaios.walls.di.module.repoModule
import com.hentaios.walls.di.module.viewModelModule

val appComponent = listOf(
    apiModule,
    repoModule,
    viewModelModule
)