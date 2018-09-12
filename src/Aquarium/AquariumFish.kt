package Aquarium

abstract class AquariumFish {
    abstract val color: String
}

class Shark: AquariumFish(), FishAction {

    override val color = "gray"

    override fun eat() {
        println("hunt and eat fish")
    }
}