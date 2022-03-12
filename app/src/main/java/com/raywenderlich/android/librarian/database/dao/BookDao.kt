package com.raywenderlich.android.librarian.database.dao

import androidx.room.*
import androidx.room.OnConflictStrategy.*
import com.raywenderlich.android.librarian.model.Book

@Dao
interface BookDao {

    @Query("SELECT * FROM books")
    fun getBooks(): List<Book>

    @Query("SELECT * FROM books WHERE id = :bookId")
    fun getBookById(bookId: String): Book

    @Insert(onConflict = REPLACE)
    fun addBook(book: Book)

    @Delete
    fun removeBook(book: Book)
}