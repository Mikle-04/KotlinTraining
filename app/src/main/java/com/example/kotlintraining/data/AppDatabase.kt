package com.example.kotlintraining.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.kotlintraining.data.dao.AppDao
import com.example.kotlintraining.data.db.Question
import com.example.kotlintraining.data.db.Theory

@Database(entities = [Question::class, Theory::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun appDao(): AppDao
}