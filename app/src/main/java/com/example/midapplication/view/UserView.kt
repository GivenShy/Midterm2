package com.example.midapplication.view

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.midapplication.dto.User

@Composable
fun UserListItem(user: User) {
    Card (modifier = Modifier
        .fillMaxWidth()
        .height(100.dp)
        .padding(5.dp)) {
        Text(text = user.name, fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            style = TextStyle(color = Color(173, 21, 173, 255)))
        Spacer(modifier = Modifier.size(20.dp))
        Text(text = user.email)
    }
    Spacer(modifier = Modifier.height(8.dp))
}