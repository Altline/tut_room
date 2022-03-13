package com.raywenderlich.android.librarian.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.raywenderlich.android.librarian.model.ReadingList

@Dao
interface ReadingListDao {

    @Query("SELECT * FROM readinglist")
    suspend fun getReadingLists(): List<ReadingList>

    @Insert(onConflict = REPLACE)
    suspend fun addReadingList(readingList: ReadingList)

    @Delete
    suspend fun removeReadingList(readingList: ReadingList)
}