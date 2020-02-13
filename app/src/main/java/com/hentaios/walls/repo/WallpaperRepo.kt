package com.hentaios.walls.repo

import com.hentaios.walls.api.WallpaperClient

class WallpaperRepo(private val webClient: WallpaperClient) : BaseRepo() {
    fun getAllWallpapers() = makeRequest {
        webClient.getAllWallpapers()
    }
}