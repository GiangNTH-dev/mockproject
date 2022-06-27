package com.pratama.baseandroid.data.datasource.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.pratama.baseandroid.data.datasource.local.entity.NewsEntity

@Dao
interface NewsDao {
    @Query("SELECT * FROM News")
     fun getAllNews(): List<NewsEntity>

    @Insert
     fun insert(news: NewsEntity)
}
