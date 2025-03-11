package com.example.kotlintraining.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.kotlintraining.presentation.TestViewModel
import com.example.kotlintraining.presentation.TestViewModelFactory

@Composable
fun TestScreen(category: String) {
    val context = LocalContext.current
    val db = Room.databaseBuilder(context, AppDatabase::class.java, "app_db").build()
    val viewModel: TestViewModel = viewModel(factory = TestViewModelFactory(db.appDao(), category))
    val questions by viewModel.questions.observeAsState(emptyList())
    val score by viewModel.score.observeAsState(null)
    var currentQuestionIndex by remember { mutableStateOf(0) }
    var selectedAnswer by remember { mutableStateOf<Int?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 50.dp, start = 16.dp, end = 16.dp)
    ) {
        if (score != null) {
            Text("Ваш результат: $score/5", style = MaterialTheme.typography.bodyMedium)
        } else if (questions.isNotEmpty()) {
            val question = questions[currentQuestionIndex]
            Text(question.text, style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(8.dp))

            question.options.forEachIndexed { index, option ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = selectedAnswer == index,
                        onClick = { selectedAnswer = index }
                    )
                    Text(option, modifier = Modifier.padding(start = 8.dp))
                }
            }

            Button(
                onClick = {
                    if (selectedAnswer != null) {
                        viewModel.submitAnswer(currentQuestionIndex, selectedAnswer!!)
                        if (currentQuestionIndex < questions.size - 1) {
                            currentQuestionIndex++
                            selectedAnswer = null
                        } else {
                            viewModel.calculateScore()
                        }
                    }
                },
                modifier = Modifier.align(Alignment.End)
            ) {
                Text("Далее")
            }
        }
    }
}