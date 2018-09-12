//Practice Time
//It can be useful to know the weight of a book, for example, for shipping. The weight of a book can change because sometimes pages get torn, and the page count changes. While calculating the weight could be defined as a method, it’s more like a helper function. Besides, it would hurt a book's feelings to have a method that tears up its pages.
//
//Add a mutable property pages to Book.
//Create an extension function on Book that returns the weight of a book as the page count multiplied by 1.5 grams.
//Create another extension, tornPages(), that takes the number of torn pages as an argument and changes the page count of the book.
//Write a class Puppy with a method playWithBook() that takes a book as an argument, and removes a random number of pages from the book.
//Create a puppy and give it a book to play with, until there are no more pages.
//Note: If you don’t want to give your puppy a book, then create a puzzle toy class and fill it with treats.

package ExtensionFunctions

import java.util.*

const val MAX_BOOKS = 5

open class Book (val title: String, val author: String, var pages: Int) {

    private var currentPage = 1

    open fun readPage() {
        currentPage++
    }

    fun canBorrow(numBooks: Int) = numBooks < MAX_BOOKS

    fun printUrl() {
        println(BASE_URL + title + ".html")
    }

    companion object {
        val BASE_URL = "www.library.com/"
    }
}

fun Book.getWeight() = pages * 1.5

fun Book.tornPages(tornPages: Int) = if (pages >= tornPages) pages -= tornPages else pages = 0

class Puppy(){
    fun playWithBook(book: Book) = book.tornPages(Random().nextInt(book.pages) + 1)
}

fun main(args: Array<String>) {
    val book = Book("AI", "Peter", 1050)
    val puppy = Puppy()
    println(book.getWeight())
    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("playing ${book.pages} pages remaining")
    }
    println("done playing, there are ${book.pages} pages remaining")
}