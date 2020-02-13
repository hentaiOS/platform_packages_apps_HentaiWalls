package com.hentaios.walls.di.module

import com.hentaios.walls.api.WallpaperClient
import com.hentaios.walls.api.WallpaperService
import com.hentaios.walls.api.getOkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://hentaios.com/api/"

val apiModule = module {
    factory { getOkHttpClient() }

    single {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build()
    }

    factory { get<Retrofit>().create(WallpaperService::class.java) }
    factory { WallpaperClient(get()) }
}