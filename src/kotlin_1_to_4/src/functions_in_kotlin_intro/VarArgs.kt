package functions_in_kotlin_intro

/**
 * Kotlin just like Java allows for a variable number of arguments.
 *
 * In Java it's String.. args ...
 *
 * var args allows users to pass in a comma separated list of arguments which the
 * compiler wraps into an ARRAY!
 *
 *
 * */

// kotlin equivalent of varargs
fun muliprint(vararg s: String): Unit {
    for (str in s) println(str)
}

fun main(args: Array<String>) {
    muliprint("hello","one","two","three")
}

// in Kotlin you can also have regular parameters with varargs (but only at most one parameter) marked as varargs ..

// usually as last param but can be in middle as well. If that is the case like named parameters
// and telescoping you must name the parameters when passing them in for the Kotlin compiler to do it's magic