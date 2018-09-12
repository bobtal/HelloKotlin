package SAM

//interface Runnable {
//    fun run()
//}

interface Callable<T> {
    fun call() : T
}

//fun example() {
//    val runnable = object: Runnable {
//        override fun run() {
//            println("I'm a runnable")
//        }
//    }
//    JavaRun.runNow(runnable)
//}

fun example() {
    JavaRun.runNow {
        println("Passing a lambda as a runnable")
    }
}