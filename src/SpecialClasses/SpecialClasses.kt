package SpecialClasses

// Singleton
object MobyDickWhale {
    val author = "Herman Melville"

    fun jump() {
        //..
    }
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00)
}

// Can be subclassed only by classes in the same file
sealed class Seal

class SeaLion: Seal()
class Walrus: Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}