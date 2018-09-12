package HigherOrderFunctions

data class Fish (var name: String)

fun main(args: Array<String>) {
    fishExamples()
}

fun fishExamples() {
    val fish = Fish("splashy")

    with (fish.name) {
        println(capitalize())
    }

    myWith(fish.name) {capitalize()}

    println(fish.run {name})

    println(fish.apply { })

    val fish2 = Fish("splashy").apply { name = "Sharky" }
    println(fish2.name)

    println(fish.let { it.name.capitalize() }
            .let{it + "fish"}
            .let{it.length}
            .let{it + 31})
}

fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}
