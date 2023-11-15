package com.example.midapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.midapplication.dto.User
import com.example.midapplication.repository.UserRepository
import kotlinx.coroutines.launch

class UserViewModel : ViewModel() {

    private val userRepository = UserRepository()
    private val _users = MutableLiveData<List<User>>()
    val users: LiveData<List<User>> = _users

    fun getUsers() {
        viewModelScope.launch {
            try {
                val userList = userRepository.getUsers()
                _users.postValue(userList)
            } catch (e: Exception) {
                // Handle error
            }
        }
    }
}