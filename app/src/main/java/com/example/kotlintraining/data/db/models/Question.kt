package com.example.kotlintraining.data.db.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "question")
data class Question(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val text: String,
    val options: List<String>,
    val correctAnswerIndex: Int,
    val category: String
)

