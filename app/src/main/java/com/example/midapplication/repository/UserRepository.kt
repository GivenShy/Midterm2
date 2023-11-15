package com.example.midapplication.repository

import com.example.midapplication.dto.User
import com.example.midapplication.retrofit.JsonApiService
import com.example.midapplication.retrofit.RetrofitService

class UserRepository() {
    private val jsonApiService = RetrofitService.getRetrofit().create(JsonApiService::class.java);
    suspend fun getUsers(): List<User> {
        return jsonApiService.getUsers()
    }

}