package functions_in_kotlin_intro

/**
 * the with is a top-level function designed for when we want to call multiple functions on a n object and don't
 * want to repeat the object name every time (object = receiver)
 *
 * with * accepts a receiver and a closure (wrap over it with { }) to oerate on the receiver ...
 *
 *
 * */

class Airplane {


    // bunch of fake setters ...
    fun setEngine() {
        println("Setting the engine")
    }
    fun setBreaks() {
        println("Setting the breaks")
    }
    fun setPilot() {
        println("Pilot ready")
    }
    fun takeOff() {
        println("TAKE OFF!")
    }
}

// consider the following:

fun main(args: Array<String>) {
    // with with *
    val airplane = Airplane()
    with (airplane) {
        setEngine()
        setBreaks()
        setPilot()
        takeOff()
    }

    // vs....
    val airplane2 = Airplane()
    airplane2.setEngine()
    airplane2.setBreaks()
    airplane2.setPilot()
    airplane2.takeOff()

    // obviously with is a lot better and more conscise ... the with block just closes over all those
    // methods and has a "this" reference to the instance we pass in as the parameter.
    // the invocations work directly on the reference where as in the second set we explicitly set the recevier
    // to airplane2 every single time. 2nd set invokes directly on object, 1st set invokes on reference
}