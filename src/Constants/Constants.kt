package Constants

const val rocks = 3

val number = 5

const val num = 5

fun completedFunctionCall() {}

val result = completedFunctionCall()

// not good, const has to be set at compile time, not at execution time
//const val result2 = completedFunctionCall()

const val CONSTANT = "top-level constant"

object Constants {
    const val CONSTANT2 = "object constant"
}

val foo = Constants.CONSTANT2

class MyClass {

    companion object {
        const val CONSTANT3 = "constant inside companion"
    }
}