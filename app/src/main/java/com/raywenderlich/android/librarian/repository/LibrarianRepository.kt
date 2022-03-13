package com.raywenderlich.android.librarian.repository

import com.raywenderlich.android.librarian.model.Book
import com.raywenderlich.android.librarian.model.Genre
import com.raywenderlich.android.librarian.model.ReadingList
import com.raywenderlich.android.librarian.model.Review
import com.raywenderlich.android.librarian.model.relations.BookAndGenre
import com.raywenderlich.android.librarian.model.relations.BookReview
import com.raywenderlich.android.librarian.model.relations.ReadingListsWithBooks

interface LibrarianRepository {

    fun getBooks(): List<BookAndGenre>
    fun getBookById(bookId: String): Book
    fun getBooksByGenre(genreId: String): List<BookAndGenre>
    fun getBooksByRating(rating: Int): List<BookAndGenre>
    fun addBook(book: Book)
    fun removeBook(book: Book)

    fun getGenres(): List<Genre>
    fun getGenreById(genreId: String): Genre
    fun addGenres(genres: List<Genre>)

    fun getReviews(): List<BookReview>
    fun getReviewById(reviewId: String): BookReview
    fun getReviewByRating(rating: Int): List<BookReview>
    fun addReview(review: Review)
    fun updateReview(review: Review)
    fun removeReview(review: Review)

    fun getReadingLists(): List<ReadingListsWithBooks>
    fun addReadingList(readingList: ReadingList)
    fun removeReadingList(readingList: ReadingList)
}