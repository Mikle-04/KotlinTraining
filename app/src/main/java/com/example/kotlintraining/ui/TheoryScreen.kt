package com.example.kotlintraining.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.room.Room
import com.example.kotlintraining.data.db.AppDatabase
import com.example.kotlintraining.data.db.models.Theory

@Composable
fun TheoryScreen() {
    val context = LocalContext.current
    val db = Room.databaseBuilder(context, AppDatabase::class.java, "app_db").build()
    var theoryList by remember { mutableStateOf(listOf<Theory>()) }

    LaunchedEffect(Unit) {
        theoryList = db.appDao().getTheoryByCategory("Основы")
    }

    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        items(theoryList) { theory ->
            Column(modifier = Modifier.padding(bottom = 8.dp)) {
                Text(text = theory.title, style = MaterialTheme.typography.bodyMedium)
                Text(text = theory.content, style = MaterialTheme.typography.bodySmall)
            }
        }
    }
}