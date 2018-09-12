package Inlines

fun main(args: Array<String>) {
    fishExamples()
}

data class Fish(val name: String)

fun fishExamples() {
    val fish = Fish("splashy")

    myWith(fish.name) {
        capitalize()
    }

    // Longhand version - without inline an object is created on every call to myWith
//    myWith(fish.name, object : Function1<String, Unit> {
//        override fun invoke(name: String) {
//            name.capitalize()
//        }
//    })

    // with inline no object is created, and lambda body is inlined here
    // capitalize is called directly on fish.name
    fish.name.capitalize()
}

inline fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}