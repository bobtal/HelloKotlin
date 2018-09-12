package Spices

data class SpiceContainer(val spice: Spice) {
    val label = spice.name
}

fun main(args: Array<String>) {
    val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
            SpiceContainer(Curry("Red Curry", "medium")),
            SpiceContainer(Curry("Green Curry", "spicy")))

    for(element in spiceCabinet) println(element.label)
}