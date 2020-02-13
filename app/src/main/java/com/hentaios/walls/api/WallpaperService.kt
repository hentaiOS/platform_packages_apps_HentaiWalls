package com.hentaios.walls.api

import com.hentaios.walls.models.WallCollection
import retrofit2.Response
import retrofit2.http.GET

interface WallpaperService {
    @GET("wallpaper/all")
    suspend fun getAllWallpapers(): Response<List<WallCollection>>
}