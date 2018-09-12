//Practice Time
//You used object in the previous lesson and quiz.
//
//And now that you know about enums, here's the code for Color as an enum:
//
//enum class Color(val rgb: Int) {
//    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
//}
//In SpiceColor, change the type of color from String to the Color class, and set the appropriate color in YellowSpiceColor.
//
//Hint: The color code for yellow is YELLOW(0xFFFF00)
//Make Spice a sealed class.
//
//What is the effect of doing this?
//Why is this useful?
// --Making Spice a sealed class helps keep all the spices together in one file.

package SpecialClasses

sealed class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor):
        SpiceColor by color{

    abstract fun prepareSpice()
}

class Curry(name: String = "Curry", spiciness: String = "mild", color: SpiceColor = YellowSpiceColor):
        Spice(name, spiciness, color),
        Grinder{

    override fun prepareSpice() {
        grind()
    }
}

interface Grinder {
    fun grind() {
        println("grinding")
    }
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor{
    override val color = Color.YELLOW
}

fun main(args: Array<String>) {
    val curry = Curry()
    println("Color: ${curry.color}")
}