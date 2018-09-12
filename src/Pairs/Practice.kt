package Pairs

class Book(val title: String, val author: String, val year: Int) {
    fun getTitleAuthor() : Pair<String, String> {
        return title to author
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}

fun main(args: Array<String>) {
    val b = Book("Some Title", "Some Author", 2000)

    val bookTitleAuthor = b.getTitleAuthor()
    val bookTitleAuthorYear = b.getTitleAuthorYear()

    println("Here is your book ${bookTitleAuthor.first} " +
            "written by ${bookTitleAuthor.second}")
    println("Here is your book ${bookTitleAuthorYear.first} " +
            "written by ${bookTitleAuthorYear.second} in ${bookTitleAuthorYear.third}")
}