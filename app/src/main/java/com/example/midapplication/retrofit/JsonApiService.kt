package com.example.midapplication.retrofit

import com.example.midapplication.dto.User
import retrofit2.http.GET
import retrofit2.http.Query

interface JsonApiService {
    @GET("users")
    suspend fun getUsers(): List<User>
}