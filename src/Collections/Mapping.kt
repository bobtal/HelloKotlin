package Collections

fun main(args: Array<String>) {
    val cures = mapOf("white spots" to "Ich", "red sores" to "hole disease")

    println(cures.get("white spots"))
    println(cures["white spots"])

    println(cures.get("red sores"))
    println(cures["red sores"])

    println(cures.getOrDefault("bloating", "sorry I don't know"))

    cures.getOrElse("bloating") { "No cure for this" }

    val inventory = mutableMapOf("fish net" to 1)
    inventory.put("tank scrubber", 3)
    inventory.remove("fish net")
}