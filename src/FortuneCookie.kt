fun main(args: Array<String>) {
    var message: String = ""
    var counter = 0

    while (!(message.startsWith("take it easy", true)) && (counter < 10)) {
        message = getFortuneCookie(getBirthday())
        println("Your fortune is $message")
        counter++

    }

    println("Good bye!")
}

fun getFortuneCookie(birthDay: Int): String {
    val fortunes = listOf(
            "You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune."
    )
    return when (birthDay) {
        in 1..7 -> fortunes[1]
        28, 31 -> fortunes[2]
        else -> fortunes[birthDay.rem(fortunes.size)]
    }
}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}