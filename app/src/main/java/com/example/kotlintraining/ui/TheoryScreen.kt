package com.example.kotlintraining.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.room.Room
import com.example.kotlintraining.data.db.AppDatabase
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.kotlintraining.data.db.models.Theory

@Composable
fun TheoryScreen(category: String) {
    val context = LocalContext.current
    val db = Room.databaseBuilder(context, AppDatabase::class.java, "app_db").build()
    // Список уникальных перемешанных тем
    val theoryListState = remember { mutableStateOf(listOf<Theory>()) }
    var currentTheoryIndex by remember { mutableStateOf(0) }

    // Загружаем данные один раз при смене категории
    LaunchedEffect(category) {
        val theories = db.appDao().getTheoryByCategory(category)
            .distinctBy { it.title + it.content } // Уникальность по заголовку и содержимому
            .shuffled() // Случайный порядок
        theoryListState.value = theories
        currentTheoryIndex = 0 // Сбрасываем индекс при новой категории
    }

    val theoryList = theoryListState.value

    if (theoryList.isNotEmpty() && currentTheoryIndex < theoryList.size) {
        val currentTheory = theoryList[currentTheoryIndex]

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 20.dp, start = 8.dp, end = 8.dp)
        ) {
            // Заголовок жирным шрифтом
            Text(
                text = currentTheory.title,
                style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // Текст теории
            Text(
                text = currentTheory.content,
                style = MaterialTheme.typography.bodyLarge.copy(lineHeight = 28.sp),
                modifier = Modifier
                    .padding(bottom = 8.dp)
                    .weight(1f)
            )

            // Spacer для отступа кнопки от низа
            Spacer(modifier = Modifier.height(30.dp))

            // Кнопка "Далее"
            Button(
                onClick = {
                    if (currentTheoryIndex < theoryList.size - 1) {
                        currentTheoryIndex++
                    }
                },
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(bottom = 45.dp)
            ) {
                Text("Далее")
            }
        }
    } else if (theoryList.isNotEmpty() && currentTheoryIndex >= theoryList.size) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 20.dp, start = 8.dp, end = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Теория по категории '$category' завершена!", style = MaterialTheme.typography.bodyLarge)
        }
    } else {
        Text(
            "Загрузка...",
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 8.dp, end = 8.dp)
                .wrapContentSize(Alignment.Center),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}