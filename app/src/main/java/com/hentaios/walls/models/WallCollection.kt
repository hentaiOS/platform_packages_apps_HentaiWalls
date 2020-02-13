package com.hentaios.walls.models

import androidx.annotation.Keep

@Keep
data class WallCollection(
    var name: String,
    var wallpapers: List<Wallpaper>
)