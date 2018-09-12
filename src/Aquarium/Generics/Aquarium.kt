package Aquarium.Generics

open class WaterSupply(var needsProcessed: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessed = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessed = false
    }
}

class Aquarium<out T: WaterSupply>(val waterSupply: T) {
//    fun addWater() {
//        check(!waterSupply.needsProcessed) {"water supply needs processed"}
//
//        println("adding water from $waterSupply")
//    } updated version with generics below

    fun addWater(cleaner: Cleaner<T>) {
        if (waterSupply.needsProcessed) {
            cleaner.clean(waterSupply)
        }

        println("adding water from $waterSupply")
    }

}

interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner: Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) {
        waterSupply.addChemicalCleaners()
    }
}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

inline fun <reified R: WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R

fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
    println("aquarium water is clean: ${aquarium.waterSupply.needsProcessed}")
}

inline fun <reified T: WaterSupply> WaterSupply.isOfType() = this is T

fun genericExample() {
    val aquarium = Aquarium(TapWater())
    aquarium.waterSupply.addChemicalCleaners()

    // works with <T: Any>
//    val aquarium2 = Aquarium("string")
//    println(aquarium2.waterSupply)

    // works with <T: Any?>
//    val aquarium3 = Aquarium(null)
//    println(aquarium3.waterSupply)

    val aquarium4 = Aquarium(LakeWater())
    aquarium4.waterSupply.filter()

    val cleaner = TapWaterCleaner()
    aquarium.addWater(cleaner)

    addItemTo(aquarium)

    isWaterClean(aquarium)

    println(aquarium.hasWaterSupplyOfType<TapWater>()) // true
    println(aquarium.hasWaterSupplyOfType<LakeWater>()) // false

    println(aquarium.waterSupply.isOfType<TapWater>()) // true
    println(aquarium.waterSupply.isOfType<LakeWater>()) // false
}

fun main(args: Array<String>) {
    genericExample()
}