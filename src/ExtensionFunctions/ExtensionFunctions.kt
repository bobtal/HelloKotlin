package ExtensionFunctions

fun String.hasSpaces(): Boolean {
    val found = this.find { it == ' ' }
    return found != null
}

fun String.hasSpacesShorterKotlin() = find { it == ' ' } != null

fun extensionsExample() {
    "Does it have spaces?".hasSpaces() // true
}

open class AquariumPlant(val color: String, private val size: Int)

fun AquariumPlant.isRed() = color == "Red"

// error, size is private, can't access it from extension function
//fun AquariumPlant.isBig() = size > 50

class GreenLeafyPlant(size: Int): AquariumPlant("Green", size)

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

fun staticExample() {
    val plant = GreenLeafyPlant(50)
    plant.print() // GreenLeafyPlant

    val aquariumPlant: AquariumPlant = plant
    aquariumPlant.print() // AquariumPlant
}

fun AquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}

fun nullableExample() {
    val plant: AquariumPlant? = null
    plant.pull() // ok since we have this? in pull function
}

// Extension Properties
val AquariumPlant.isGreen: Boolean
    get() = color == "Green"

fun propertyExample() {
    val plant = AquariumPlant("Green", 50)
    println(plant.isGreen) // true
}

fun main(args: Array<String>) {
    nullableExample()
}