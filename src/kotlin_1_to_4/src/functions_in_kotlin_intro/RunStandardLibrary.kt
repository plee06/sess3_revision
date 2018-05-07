package functions_in_kotlin_intro

/**
 * run * standard library function
 *
 * in Kotlin, Run is an extension function that combines the use cases of with and let.
 *
 *
 *
 * closure is passed to run (something to wrap over that returns a value) and is run on an instsance as the
 * receiver.
 *
 * with -> runs on instance that runs multiple methods on a reference of that instance
 * let ->
 *
 *
 * so what run does is it'll run whatever is in the closure, and then run that result on the instance
 * its referring to.
 *
 *
 * */

class Car {
    private var carType: String = "No Type"

    fun setCar(type: String) {
        println("Setting car type")
        this.carType = type
    }

    fun runCar() = println("Running car of type ${this.carType}")
    fun getCar() = this.carType
}

// using run

fun main(args: Array<String>) {

    val whatType = Car().run {
        setCar("HONDA")
        getCar()
    }
    println(whatType)

    // in .run the receiver is the instance it works on, i.e. whatever it's called on. Here that's car
    // the whole point of run is to have an instance to run some closure on i.e. some set of methods
}