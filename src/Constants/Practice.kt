//Create a top-level constant for the maximum number of books a person could borrow.
//Inside the Book class, create a method canBorrow() that returns true or false depending on whether a
// user has already borrowed the max number of books.
//Create a Constants object that provides constants to the book.
// For this example, provide the BASE_URL for all books in the library catalog.
// Inside Book, add a method printUrl that creates and prints a URL composed of BASE_URL,
// the book title, and “.html”.
//The base URL is really of interest to the Book class.
// As such, it makes sense to limit its scope to the Book class.
// Use a companion object to define the constant in Book.

package Constants

const val MAX_BOOKS = 5

open class Book (val title: String, val author: String) {

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

object ConstantsBook {
    const val BASE_URL = "www.library.com/"
}

fun main(args: Array<String>) {
    val b = Book("AI mod approach", "Peter Norwig")
    b.printUrl()
}