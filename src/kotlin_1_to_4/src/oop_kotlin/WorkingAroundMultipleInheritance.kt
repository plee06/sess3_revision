package oop_kotlin

// In Kotlin like Java, multiple inheritance is not allowed .. .


// For example, let's say we want an amphibious car: boat as well as a car. Awesome?

interface Drivable {
    fun drive()
}

interface Sailable {
    fun sail()
}

class AmphibiousCard(val name: String) : Drivable, Sailable {
    override fun sail() {
        println("SAILING MOFO!")
    }

    override fun drive() {
        println("DRIVING!!!!!!")
    }

}