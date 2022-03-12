package com.raywenderlich.android.librarian.database.dao

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.raywenderlich.android.librarian.model.Review

@Dao
interface ReviewDao {

    @Query("SELECT * FROM review")
    fun getReviews(): List<Review>

    @Query("SELECT * FROM review WHERE id = :reviewId")
    fun getReviewById(reviewId: String): Review

    @Insert(onConflict = REPLACE)
    fun addReview(review: Review)

    @Update(onConflict = REPLACE)
    fun updateReview(review: Review)

    @Delete
    fun removeReview(review: Review)
}