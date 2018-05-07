package higher_order_functions

/**
 * Just refers to the "composition" of a function, i.e. what's inside it?
 *
 *
 * */

// An Example of Function Composition in Kotlin

// Declare a function that takes in three Generic Types of A B and C
// Declare first parameter that takes in type A and returns type B
// Declare second parameter that takes in type B and returns type C


/*
* We are composing this "compose" function with two functions that return a specific type and the next function
* uses that returned type to do it's own work!
*
* It then finally returns a function that takes in type A and returns type C through fn2.
*
* */
//fun <A, B, C> compose(fn1: (A) -> B, fn2: (B) -> C): (A) -> C {
//    a ->
//    val b = fn1(a)
//    val c = fn2(b)
//    c
//}
//
//fun main(args: Array<String>) {
//    val f  = String::length
//    val g = Any::hashCode
//    val fog = compose(f,g)
//}