open class Book (val title: String, val author: String) {

    private var currentPage = 1

    open fun readPage() {
        currentPage++
    }
}

class eBook(title: String, author: String, val format: String = "text") : Book(title, author) {

    var currentWord = 0

    override fun readPage() {
        currentWord += 250
    }
}