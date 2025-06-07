package com.falconteam.laboratorio_5.data.database.Daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.falconteam.laboratorio_5.data.database.Entity.Post
import kotlinx.coroutines.flow.Flow
import androidx.room.OnConflictStrategy

@Dao
interface PostDao {
    @Query("SELECT * FROM posts")
    fun getAllPosts(): Flow<List<Post>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPost(post: Post)

    @Query ("UPDATE posts SET title = :title, description = :description WHERE id = :postid")
    suspend fun updateSelected(postid: String, title: String, description: String)

    @Query("DELETE FROM posts WHERE id = :postid")
    suspend fun deletePostById(postid: String)

}