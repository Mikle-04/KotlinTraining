package com.example.kotlintraining.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlintraining.data.dao.AppDao
import com.example.kotlintraining.data.db.Question
import kotlinx.coroutines.launch

class TestViewModel(private val dao: AppDao) : ViewModel() {
    private val _questions = MutableLiveData<List<Question>>()
    val questions: LiveData<List<Question>> get() = _questions

    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int> get() = _score

    private var userAnswers = mutableListOf<Int?>() // Ответы пользователя

    init {
        loadQuestions()
    }

    private fun loadQuestions() {
        viewModelScope.launch {
            val randomQuestions = dao.getRandomQuestions()
            _questions.value = randomQuestions
            userAnswers = MutableList(randomQuestions.size) { null }
        }
    }

    fun submitAnswer(questionIndex: Int, answerIndex: Int) {
        userAnswers[questionIndex] = answerIndex
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
    }
}