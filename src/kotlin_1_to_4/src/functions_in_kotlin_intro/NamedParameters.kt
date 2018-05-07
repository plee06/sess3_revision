package functions_in_kotlin_intro

/**
 * Kotlin allows us to work with named parameters which makes things a lot more readable,
 *
 * consider some function that takes a lot of args. Naming each parameter when passing them in would be clearer
 * to the reader of the code
 *
 *
 * */

fun lotsOfArgs(first: String, second: String, third: String) = println("$first $second $third")


// Named parameters
fun main(args: Array<String>) {
    lotsOfArgs(first = "Hello", second = "Bye", third = "Named parameters!")

    // Mix the order up
    lotsOfArgs(second = "Second", first = "FIRST AFTER SECOND?!", third = "Third like normal...")
}

// Two rule to remember: once a parameter has been named, the rest must follow suit and be named as well!

// Second rule: You can mix up named parameters i.e. change the order

// Just a note: These named parameters can only be done in Kotlin functions, not Java, Java bytecode does not compile
// the same way.