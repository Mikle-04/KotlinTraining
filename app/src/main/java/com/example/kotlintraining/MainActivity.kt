package com.example.kotlintraining

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.lifecycleScope
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.room.Room
import com.example.kotlintraining.data.db.AppDatabase
import com.example.kotlintraining.data.db.populateDatabase
import com.example.kotlintraining.ui.TestScreen
import com.example.kotlintraining.ui.TheoryScreen
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { // Здесь начинается Compose
            KotlinMentorTheme { // Тема приложения
                MainScreen()
            }
        }

        // Инициализация базы данных
        val db = Room.databaseBuilder(this, AppDatabase::class.java, "app_db").build()
        lifecycleScope.launch {
            populateDatabase(db.appDao())
        }
    }
}

@Composable
fun MainScreen() {
    val navController = rememberNavController() // Навигация между экранами

    NavHost(navController = navController, startDestination = "main") {
        composable("main") {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Button(onClick = { navController.navigate("theory") }) {
                    Text("Изучить теорию")
                }
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = { navController.navigate("test") }) {
                    Text("Пройти тест")
                }
            }
        }
        composable("theory") { TheoryScreen() }
        composable("test") { TestScreen() }
    }
}

@Composable
fun KotlinMentorTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = lightColorScheme(primary = Color(0xFF6200EE)), // Используем lightColorScheme
        shapes = Shapes(),
        content = content
    )
}