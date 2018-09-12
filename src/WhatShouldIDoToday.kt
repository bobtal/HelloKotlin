//Practice Time
//Create a program that suggests an activity based on various parameters.
//
//Start in a new file with a main function.
//From main(), create a function, whatShouldIDoToday().
//Let the function have three parameters.
//mood: a required string parameter
//weather: a string parameter that defaults to "sunny"
//temperature: an Integer parameter that defaults to 24 (Celsius).
//Use a when construct to return some activities based on combinations of conditions. For example:
//mood == "happy" && weather == "Sunny" -> "go for a walk"
//else -> "Stay home and read."
//Copy/paste your finished function into REPL, and call it with combinations of arguments. For example:
//whatShouldIDoToday("sad")
//> Stay home and read.
//Note: Keep your work as you will do more with this code in the next practice.

//Practice Time
//Improve your whatShouldIDoToday() program with the new knowledge from this segment.
//
//Add 3 more situations and activities. For example:
//mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
//temperature > 35 -> "go swimming"
//Create a single-expression function for each condition and then use it in your when expression.
//Challenge
//Instead of passing in the mood, get a mood string from the user.
//
//Hint: The !! operator may come handy.
//
//Loops
//This lesson introduced the while and repeat loops. To practice using them, do the following:
//
//Change your fortune cookie program to use repeat() instead of a for loop. What happens to the break instruction? Using the error message from the compiler, with what you've learned so far, can you think of why?
//Change your fortune cookie program to use a while loop, which is the better choice when you are looping until a condition is met.

fun main(args: Array<String>) {
    println("How do you feel? ")
    println(whatShouldIDoToday(readLine()!!))
}

fun whatShouldIDoToday(mood: String, weather: String = "Sunny", temperature: Int = 24) : String {
    return when {
        amHappyAndIsSunny(mood, weather) -> "go for a walk"
        amSadIsRainyAndTempIsZero(mood, weather, temperature) -> "stay in bed"
        isHot(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}

fun isHot(temperature: Int) = temperature > 35

fun amSadIsRainyAndTempIsZero(mood: String, weather: String, temperature: Int) =
        mood == "sad" && weather == "rainy" && temperature == 0

fun amHappyAndIsSunny(mood: String, weather: String) = mood == "happy" && weather == "Sunny"

