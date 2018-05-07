package functions_in_kotlin_intro

/**
 * What is the FizzBuzz problem?
 *
 * If integer is a multiple of 3, print out Fizz.
 *
 * If the integer is a multiple of 5, print out Buzz.
 *
 * If it is a multiple of both Fizz and Buzz, print out both 3 and 5.
 *
 * Otherwise, just print the number
 *
 *
 * */

// Regular version

fun fizzbuzz(start: Int, end: Int): Unit {

    for (i in start..end) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        }
        else if (i % 3 == 0) {
            println("Fizz")
        }
        else if (i % 5 == 0) {
            println("Buzz")
        } else {
            println(i)
        }
    }
}

// Now let's do it with local nested functions!

// Potential for bugs -> multiple modulo checks, why not break it down?

fun betterFizzBuzz(start: Int, end: Int) {
    fun isFizz(n: Int): Boolean = if (n % 3 == 0) true else false
    fun isBuzz(n: Int): Boolean = if (n % 5 == 0) true else false

    // Now run checks
    for (i in start..end) {
        if (isFizz(i) && isBuzz(i)) {
            println("FizzBuzz")
        } else if (isFizz(i)) {
            println("Fizz")
        } else if (isBuzz(i)) {
            println("Buzz")
        } else {
            println(i)
        }
    }
}

// However, still verbose, passing in same i every time to the functions .., functions can also be defined within loops!
fun evenBetterFizzBuzz(start: Int, end: Int) {

    for (i in start..end) {
        fun isFizz(): Boolean = if (i % 3 == 0) true else false
        fun isBuzz(): Boolean = if (i % 5 == 0) true else false

        if (isBuzz() && isFizz()) {
            println("Fizz")
        } else if (isBuzz()) {
            println("Buzz")
        } else if (isFizz()) {
            println("FizzBuzz")
        } else {
            println(i)
        }

    }
}

// Finally, use when in Kotlin

// !!
fun evenBetterBetterFizzBuzz(start: Int, end: Int) {
    for (i in start..end) {

        fun isFizz(): Boolean = i % 3 == 0
        fun isBuzz(): Boolean = i % 5 == 0

        when {
            isFizz() && isBuzz() -> println("FizzBuzz")
            isFizz() -> println("Fizz")
            isBuzz() -> println("Buzz")
            else -> print(i)
        }
    }
}

fun main(args: Array<String>) {
// Fizzbuzz....
}