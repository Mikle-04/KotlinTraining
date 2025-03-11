package com.example.kotlintraining.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.kotlintraining.data.db.dao.AppDao
import com.example.kotlintraining.data.db.models.Question
import kotlinx.coroutines.launch

class TestViewModel(private val dao: AppDao, private val category: String) : ViewModel() {
    private val _questions = MutableLiveData<List<Question>>()
    val questions: LiveData<List<Question>> get() = _questions

    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int> get() = _score

    private var userAnswers = mutableListOf<Int?>()

    init {
        loadQuestions()
    }

    private fun loadQuestions() {
        viewModelScope.launch {
            val randomQuestions = dao.getRandomQuestionsByCategory(category)
                .distinctBy { it.text } // Дополнительно убираем дубликаты по тексту
                .take(30) // Ограничиваем до 30 вопросов
            _questions.value = randomQuestions
            userAnswers = MutableList(randomQuestions.size) { null }
            println("Loaded ${randomQuestions.size} unique questions for category $category: ${randomQuestions.map { it.text }}")
        }
    }

    fun submitAnswer(questionIndex: Int, answerIndex: Int) {
        userAnswers[questionIndex] = answerIndex
        println("Answer submitted for question $questionIndex: $answerIndex")
    }

    fun calculateScore() {
        val correctAnswers = _questions.value?.mapIndexed { index, question ->
            userAnswers[index] == question.correctAnswerIndex
        }?.count { it } ?: 0

        val score = when (correctAnswers) {
            in 0..5 -> 1
            in 6..12 -> 2
            in 13..19 -> 3
            in 20..25 -> 4
            else -> 5
        }
        _score.value = score
        println("Score calculated: $score")
    }
}

class TestViewModelFactory(private val dao: AppDao, private val category: String) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TestViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return TestViewModel(dao, category) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}