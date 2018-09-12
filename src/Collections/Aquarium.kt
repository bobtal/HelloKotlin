package Collections

fun main(args: Array<String>) {
    val symptoms = mutableListOf("white spots", "red spots", "not eating", "bloated", "belly up")

    symptoms.add("white fungus")
    symptoms.remove("white fungus")

    symptoms.contains("red") //false
    symptoms.contains("red spots") //true

    println(symptoms.subList(4, symptoms.size)) // [belly up]

    println(listOf(1, 5, 3).sum()) // 9

    println(listOf("a", "b", "cc").sumBy { it.length }) // 4

}