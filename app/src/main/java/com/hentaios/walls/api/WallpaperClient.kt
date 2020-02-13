package com.hentaios.walls.api

class WallpaperClient(private val webService: WallpaperService) : BaseApiClient() {
    suspend fun getAllWallpapers() = getResult {
        webService.getAllWallpapers()
    }
}