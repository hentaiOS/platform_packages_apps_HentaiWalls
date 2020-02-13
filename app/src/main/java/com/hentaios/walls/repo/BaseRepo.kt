package com.hentaios.walls.repo

import androidx.lifecycle.liveData
import com.hentaios.walls.models.ApiResult

open class BaseRepo {
    protected fun <T> makeRequest(request: suspend () -> ApiResult<T>) = liveData {
        emit(ApiResult.loading())

        val response = request.invoke()

        when (response.status) {
            ApiResult.Status.SUCCESS -> {
                emit(ApiResult.success(response.data))
            }
            ApiResult.Status.ERROR -> {
                emit(ApiResult.error(response.message!!))
            }
            else -> {
            }
        }
    }
}