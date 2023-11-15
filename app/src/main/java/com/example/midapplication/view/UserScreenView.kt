package com.example.midapplication.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.midapplication.dto.User
import com.example.midapplication.viewmodel.UserViewModel

@Composable
fun UserListScreen(userViewModel: UserViewModel = viewModel()) {
    val usersObserver = userViewModel.users.observeAsState()
    val users = usersObserver.value

    LaunchedEffect(key1 = true) {
        userViewModel.getUsers()
    }

    Column {
        Text(text = "User List", fontSize = 20.sp)
        Spacer(modifier = Modifier.size(10.dp))
        LazyColumn {
            users?.let { users ->
                items(users.size) { index ->
                    UserListItem(user = users[index])

                }
            }
        }
    }


}



