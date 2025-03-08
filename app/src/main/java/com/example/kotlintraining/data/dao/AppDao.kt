package com.example.kotlintraining.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.kotlintraining.data.db.Question
import com.example.kotlintraining.data.db.Theory

@Dao
interface AppDao {
    @Query("SELECT * FROM question ORDER BY RANDOM() LIMIT 30")
    suspend fun getRandomQuestions(): List<Question>

    @Query("SELECT * FROM theory WHERE category = :category")
    suspend fun getTheoryByCategory(category: String): List<Theory>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertQuestions(questions: List<Question>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTheory(theory: List<Theory>)
}