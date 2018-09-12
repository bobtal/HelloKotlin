import java.util.*

//Practice Time: LambdasRecap

//Create a lambda and assign it to rollDice, which returns a dice roll (number between 1 and 12).
//val rollDice = { Random().nextInt(12) + 1}

//Extend the lambda to take an argument indicating the number of sides of the dice used for the roll.
//val rollDice = { numSides: Int -> Random().nextInt(numSides) + 1 }

//If you haven't done so, fix the lambda to return 0 if the number of sides passed in is 0.
val rollDice = { numSides: Int ->
    if (numSides > 0) Random().nextInt(numSides) + 1
    else 0
}

//Create a new variable, rollDice2, for this same lambda using the function type notation.
val rollDice2: (Int) -> Int = { numSides ->
    if (numSides > 0) Random().nextInt(numSides) + 1
    else 0
}

//Practice Time: Extra Questions
//Why would you want to use the function type notation instead of just the lambda?
// -- Function type notation is more readable, which reduces errors,
// -- clearly showing what type is passed in and what type is returned.

//Create a function gamePlay() that takes a roll of the dice as an argument and prints it out.
fun gamePlay(diceRoll: Int) {
    println(diceRoll)
}
//Pass your rollDice2 function as an argument to gamePlay() to generate a dice roll every time gamePlay() is called.
fun main(args: Array<String>) {
    gamePlay(rollDice2(15))
}