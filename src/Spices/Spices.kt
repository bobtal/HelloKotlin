//Practice Time
//Abstract and Interface
//Let's go back to your spices. Make Spice an abstract class, and then create some subclasses that are actual spices.
//
//It's easiest (organizationally) if you make a new package, Spices, with a file, Spice, that has a main() function.
//Copy/paste your Spice class code into that new file.
//Make Spice abstract.
//Create a subclass, Curry. Curry can have varying levels of spiciness, so we don't want to use the default value, but rather pass in the spiciness value.
//Spices are processed in different ways before they can be used. Add an abstract method prepareSpice to Spice, and implement it in Curry.
//Curry is ground into a powder, so let's call a method grind(). However, grinding is something that's not unique to curry, or even to spices, and it's always done in a grinder. So we can create an Interface, Grinder, that implements the grind() method. Do that now.
//Then add the Grinder interface to the Curry class.

package Spices

abstract class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor):
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
    val color: String
}

object YellowSpiceColor : SpiceColor{
    override val color = "yellow"
}

fun main(args: Array<String>) {
    val curry = Curry()
    println("Color: ${curry.color}")
}