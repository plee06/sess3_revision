package higher_order_functions

/**
 * Remember, a receiver function is the instance that corresponds to the "this" keyword when inside the function
 * body. i.e. whatever receives the "this" reference!
 *
 *
 * */


// Function parameters can be defined to accept a receiver when invoked, receiver -> the reference of this
// when declared inside a body.

// Consider ...

/*
* Here we define a function named foo that takes in a Function as a parameter.
* This function as it's own parameter requires that whatever it's receiver type is must be of type String
* and outputs a Boolean.
*
* So when we pass into our higher order function of foo the function we want to call, we also explicitly
* state that this function being passed in MUST (fn is the "this" reference, i.e. receiver function) be called
* on a receiver type of String.
* */


fun main(args: Array<String>) {
    println("hello".substr("ello"))
}

fun foo(fn: String.() -> Boolean): Unit {
    "string".fn()
}

// An Extension function on String which is anonymous and takes in a substring of type String
// to check if it is a Substring of that String!
val substr = fun String.(substr: String): Boolean {
    // Here the `this` reference refers to the String it's being called on and instead of passing it into
    // a defined function we use an Anonymous function and state that it must be of type String
    // within the Parameter explicitly
    return this.contains(substr)
}
