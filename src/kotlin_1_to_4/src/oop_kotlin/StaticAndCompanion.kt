package oop_kotlin

import java.lang.IllegalArgumentException

// In Java, as we know, static methods do not belong to the object instance, but rather belongs to the Class "Type"

// In Kotlin, it advises that we define methods at a package level to get the same "effect"



// A function that returns the first character of an input String
fun showFirstCharacter(input: String): Char {
    // If empty, throw an IllegalArgumentException
    if (input.isEmpty()) throw IllegalArgumentException()

    // Otherwise, return the first character of the String ...
    return input.first()
}


fun main(args: Array<String>) {
    println(showFirstCharacter("Kotlin is awesome. Kind of."))
}