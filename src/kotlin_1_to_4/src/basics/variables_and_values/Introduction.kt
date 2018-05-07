package basics.variables_and_values

/**
 * Kotlin has two keywords for declaring variables.
 *
 * They are var and val.
 *
 * var -> mutable
 * val -> immutable
 *
 *
 * */

fun main(args: Array<String>)
{
// Immutable variable of type String that is my name!
    val myName = "Paul is a nice guy."

    // val is the equivalent of a "read only" variable, it cannot be re-assigned but member variables can be changed.
    // consider. i.e. we can run methods and other things on it, but what we can't do is re-assign it!

    println(myName.split(" "))

    // But this throws an error
    // myName = "Sammy"

// Mutable variable of type Int that is my age ... sadly. *sniff sniff*
    var age = 27


// And of course, variables can be reassigned.
    age = 28


}