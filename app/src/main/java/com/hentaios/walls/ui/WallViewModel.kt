package com.hentaios.walls.ui

import androidx.lifecycle.ViewModel
import com.hentaios.walls.repo.WallpaperRepo

class WallViewModel(private val repo: WallpaperRepo) : ViewModel() {
    fun getAllWallpapers() = repo.getAllWallpapers()
}