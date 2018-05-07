package functions_in_kotlin_intro

/**
 * Kotlin supports the functionality of single expression types; you can use this for functions
 * that consist of a single expression. "Single line functions"
 *
 *
 * */

fun multiply(n1: Int, n2: Int): Int = n1 * n2 // I guess a square ...

// Rational behind not needing to declare a type? Makes it more concise easier to read, prettier!

// *return keyword also is not needed! Awesome.

// Although we can write single expression functions as regular blocks, the compiler WILL ENFORCE return keyword
// if the function is in a block
//
//
//// This throws an error
//fun add(n1: Int, n2: Int): Int {
//
//    n1 + n2
//}