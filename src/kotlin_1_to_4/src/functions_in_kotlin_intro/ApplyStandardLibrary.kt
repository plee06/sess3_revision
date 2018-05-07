package functions_in_kotlin_intro

/**
 * Introduction to the Standard Library functions of Kotlin ...
 *
 * */


/*
*
* Apply
* */
// apply is a Kotlin standard library extension function delcared on Any <- it's like the SUPER SUPER SUPER CLASS
// of everything! Kind of like the Object Super class in Java
// apply accepts a lambda that is invoked with the receiver (i.e. whats this .apply applying itself to?, what's
// receiving apply?
// apply will return the original instance
// primary usage of Apply-> makes setting of instance objects more readable. consider the below
class Coffee {
    private var type: String = "No Type"
    init {
        println("Creating Coffee Instance")
    }

    fun makeCoffee(): Unit = println("Making coffee of type $type")
    fun setCoffee(type: String): Unit {
        this.type = type
    }
}

// do everything in one line

fun main(args: Array<String>) {
    // we initialize it then we set the coffee then we make some coffee!!!
    Coffee().apply { setCoffee("Americano") }.makeCoffee() // looks pretty doesn't it?

    // compare with this down here
    val someCoffee = Coffee()
    someCoffee.setCoffee("Dark Roast")
    someCoffee.makeCoffee()
    // 2nd one is a lot more verbose ...

    /**
     * IMPORTANT TO NOTE: the apply function ALWAYS returns the same isntance which is why we can do that
     * .makeCoffe() or whatever after applying a certain function.
     *
     * the whole point of apply is to invoke a lambda (some function literal, like setCoffee) and invoke it on
     * what its being applied to Coffee() and then return that same instance with the change of whatever
     * it applied here we just set the type of the coffee ...
     *
     * */
}



