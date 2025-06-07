package com.falconteam.laboratorio_5.data.database

import androidx.room.Database
import com.falconteam.laboratorio_5.data.database.Daos.PostDao
import com.falconteam.laboratorio_5.data.database.Entity.Post
import androidx.room.RoomDatabase

@Database(entities = [Post::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
}