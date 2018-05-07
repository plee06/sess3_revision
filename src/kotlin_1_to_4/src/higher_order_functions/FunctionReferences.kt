package higher_order_functions

/**
 * We can also pass in functions through what is known as "function references"
 *
 *
 *
 * */


// Consider some top-level function


fun isEven(k: Int): Boolean = k % 2 == 0

// Now consider the comparison between a reference and direct passing

fun main(args: Array<String>) {
    val ints = listOf(1,2,3,4,5)

    // Here we pass in a function by passing in the function directly
    val evens = ints.filter { isEven(it) }

    // Here we utilize the function reference
    ints.filter(::isEven)

    // Use as normal
    ints.filter { it.isOdd() }

    // Or use the reference!
    ints.filter(Int::isOdd)
}

// This also works with Member functions and Function extensions

// First we define an extension function of "isOdd" on Int Class
fun Int.isOdd() = this % 2 == 1

// Basically this "function reference" thing is done to reduce boiler plate ...
