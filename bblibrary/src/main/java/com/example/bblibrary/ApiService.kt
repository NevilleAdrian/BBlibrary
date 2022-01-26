package com.example.bblibrary

import retrofit2.http.GET


interface ApiService {
    @GET(".")
    suspend fun getData(): ApiData
}