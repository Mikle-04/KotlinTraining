package com.example.kotlintraining.data.db.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "theory")
data class Theory(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val content: String,
    val category: String // Например, "Основы", "ООП", "Собеседование"
)
