package com.raywenderlich.android.librarian.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import com.raywenderlich.android.librarian.model.ReadingList

@Dao
interface ReadingListDao {

    @Insert(onConflict = REPLACE)
    fun addReadingList(readingList: ReadingList)
}