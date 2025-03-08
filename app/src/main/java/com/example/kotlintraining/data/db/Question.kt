package com.example.kotlintraining.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "question")
data class Question (
    @PrimaryKey(autoGenerate = true) val id : Int = 0,
    val text: String,
    val options: List<String>, // 4 варианта ответа
    val correctAnswerIndex: Int // Индекс правильного ответа (0-3)
    )

