package LambdasRecap

fun main(args: Array<String>) {
    { println("Hello Fish")}() // Hello Fish

    val waterFilter = {dirty : Int -> dirty / 2}
    println(waterFilter(30)) // 15

    val myFish = listOf(Fish("Flipper"), Fish("Moby Dick"), Fish("Dory"))

    println(myFish.filter { it.name.contains('i') }.joinToString(" "){it.name}) // Flipper Moby Dick
}

data class Fish(val name: String)