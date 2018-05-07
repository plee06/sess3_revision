package oop_kotlin

// Kotlin also offers up "enum classes" Enumeration is a specific type of class


enum class DaysOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

fun main(args: Array<String>)
{
    for (planet in Planet.values()) println("The planet name is $planet and the mass is ${planet.mass} and the radius is ${planet.radius}")

    println(Planet.MERCURY.name) // Predefined name property
    println(Planet.MERCURY.ordinal) // Predefined ordinal property


    // Testing out the enum class that implements an interface with methods ...
    Say.BYE.printSomethingCool()
    Say.HELLO.printSomethingCool()
}

// Enum class with parameters

public enum class Planet(val mass: Double, val radius: Double) {
    // Create enum objects with constructors passed in ...
    MERCURY(12309123.23,98213.23),
    VENUS(123123.23, 3781233.23)
}

/*
* Enumeration instances in Kotlin come with two properties predefined:
*
* one is * name of type String
* second is * ordinal of type Int
*
* name -> returns the name of the instance
* ordinal -> gives position in the enumeration type declaration
*
* for example above,
*
*
* */

// Enum classes in Kotlin can also inherit interfaces, think of it as just like any other class!
interface Printable {
    fun printSomethingCool(): Unit
}

public enum class Say: Printable {
    HELLO {
        override fun printSomethingCool() {
            println("HELLO SIR!")
        }
    },
    BYE {
        override fun printSomethingCool() {
            println("GOODBYE MOFO!")
        }
    }
}