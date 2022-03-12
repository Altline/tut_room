package com.raywenderlich.android.librarian.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Update
import com.raywenderlich.android.librarian.model.Review

@Dao
interface ReviewDao {

    @Insert(onConflict = REPLACE)
    fun addReview(review: Review)

    @Update(onConflict = REPLACE)
    fun updateReview(review: Review)
}