package com.example.kotlintraining.data.db

import com.example.kotlintraining.data.db.dao.AppDao
import com.example.kotlintraining.data.db.models.Question
import com.example.kotlintraining.data.db.models.Theory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

suspend fun populateDatabase(dao: AppDao) {
    withContext(Dispatchers.IO) {
        val questions = listOf(
            Question(
                text = "Что такое var в Kotlin?",
                options = listOf("Переменная", "Константа", "Функция", "Класс"),
                correctAnswerIndex = 0
            ),
            Question(
                text = "Как объявить функцию в Kotlin?",
                options = listOf("fun", "def", "function", "proc"),
                correctAnswerIndex = 0
            )
            // Добавь ещё вопросы, чтобы было 30+
        )
        val theory = listOf(
            Theory(
                title = "Переменные",
                content = "В Kotlin есть var и val...",
                category = "Основы"
            )
        )
        dao.insertQuestions(questions)
        dao.insertTheory(theory)
    }
}