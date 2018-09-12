package Inlines

//Practice Time
//In this practice, you will finish your simple game using higher-order functions,
// that is, a function that takes functions as an argument.
//
//In the game class, create a function move() that takes an argument called where,
// which is a lambda with no arguments that returns Unit.
//
//Hint: Declaring a function that takes a lambda as its argument:
//
//fun move(where: () -> Boolean )
//Inside move(), invoke the passed-in lambda.
//In the Game class, create a function makeMove()
// that takes a nullable String argument and returns nothing.
//Inside makeMove, test whether the String is any of the 4 directions and
// invoke move() with the corresponding lambda. Otherwise, invoke move() with end.
//
//Hint: You can call the function like this:
//
//move(north)
//In main() add a while loop that is always true.
//
//Inside the loop, print instructions to the player:
//print("Enter a direction: n/s/e/w:")
//Call makeMove() with the contents of the input from the user via readLine()
//Remove the code for testing the first version of your game.
//Run your program.
//Challenge:
//Create a simple “map” for your game, and when the user moves,
// show a description of their location. Consider the following:
//
//Use a Location class that takes a default width and height to track location. 4x4 is pretty manageable.
//You can create a matrix like this:
//val map = Array(width) { arrayOfNulls<String>(height) }
//Use an init block to initialize your map with descriptions for each location.
//When you move() also updateLocation(). There is some math involved
// to prevent null-pointer exceptions and keep the user from walking
// off the map. rem() and absoluteValue come handy.
//When you are done, zip up the code and send it to a friend to try your first Kotlin game.

enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game(var path: MutableList<Directions> = mutableListOf<Directions>(Directions.START)) {
    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val east = { path.add(Directions.EAST) }
    val west = { path.add(Directions.WEST) }
    val end = { path.add(Directions.END); println("Game over: $path"); path.clear(); false }

    fun move(where: () -> Boolean) {
        where()
    }

    fun makeMove(where: String?) {
        when(where) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }
}

fun main(args: Array<String>) {
    val g = Game()

    while (true) {
        print("Enter a direction: n/s/e/w: ")
        g.makeMove(readLine())
    }


}