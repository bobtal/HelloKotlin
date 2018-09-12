class SimpleSpice {
    val name: String = "curry"
    val spiciness: String = "mild"
    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            else -> -1
        }
}

fun main(args: Array<String>) {
    val spice = SimpleSpice()
    println("Spice name: ${spice.name}, Spice heat: ${spice.heat}." )
}