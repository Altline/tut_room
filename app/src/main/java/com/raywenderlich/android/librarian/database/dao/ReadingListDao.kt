package com.raywenderlich.android.librarian.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.raywenderlich.android.librarian.model.ReadingList
import kotlinx.coroutines.flow.Flow

@Dao
interface ReadingListDao {

    @Query("SELECT * FROM readinglist")
    suspend fun getReadingLists(): List<ReadingList>

    @Query("SELECT * FROM readinglist")
    fun getReadingListsFlow(): Flow<List<ReadingList>>

    @Insert(onConflict = REPLACE)
    suspend fun addReadingList(readingList: ReadingList)

    @Delete
    suspend fun removeReadingList(readingList: ReadingList)
}