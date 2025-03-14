package com.example.kotlintraining.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.kotlintraining.data.db.converter.Converters
import com.example.kotlintraining.data.db.dao.AppDao
import com.example.kotlintraining.data.db.models.Question
import com.example.kotlintraining.data.db.models.Theory

@Database(entities = [Question::class, Theory::class], version = 1)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun appDao(): AppDao
}