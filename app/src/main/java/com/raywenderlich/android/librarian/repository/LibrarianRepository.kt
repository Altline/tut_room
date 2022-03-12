package com.raywenderlich.android.librarian.repository

import com.raywenderlich.android.librarian.model.Book
import com.raywenderlich.android.librarian.model.Genre
import com.raywenderlich.android.librarian.model.relations.BookAndGenre

interface LibrarianRepository {

    fun getBooks(): List<BookAndGenre>

    fun getGenres(): List<Genre>

    fun getGenreById(genreId: String): Genre

    fun addBook(book: Book)

    fun addGenres(genres: List<Genre>)
}