package HigherOrderFunctions

//Practice Time
//Create an extension on List using a higher order function that
// returns all the numbers in the list that are divisible by 3.
// Start by creating an extension function on List that takes an lambda on Int
// and applies it to each item in the list. When the lambda returns zero,
// include the item in the output. For example, this list:
//
//val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,0)
//Should return
//
//> [3, 6, 9, 0]

fun divisibleByThree(list: List<Int>, block: List<Int>.() -> Unit) {
    list.block()
}

// Udacity solution
fun List<Int>.divisibleBy(block: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (block(item) == 0) {
            result.add(item)
        }
    }
    return result
}

fun main(args: Array<String>) {
    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,0)

    divisibleByThree(numbers) {forEach { if (it % 3 == 0) print(it) }}

    print(numbers.divisibleBy {
        it.rem(3)
    })
}