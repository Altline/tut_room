package com.raywenderlich.android.librarian.database.dao

import androidx.room.*
import androidx.room.OnConflictStrategy.*
import com.raywenderlich.android.librarian.model.Book
import com.raywenderlich.android.librarian.model.relations.BookAndGenre

@Dao
interface BookDao {

    @Query("SELECT * FROM books")
    suspend fun getBooks(): List<BookAndGenre>

    @Query("SELECT * FROM books WHERE id = :bookId")
    fun getBookById(bookId: String): Book

    @Insert(onConflict = REPLACE)
    suspend fun addBook(book: Book)

    @Delete
    suspend fun removeBook(book: Book)
}