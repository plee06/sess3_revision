package higher_order_functions
import higher_order_functions.modulo

/**
 * In Kotlin functions can also be assigned to variables to easily be passed around!
 *
 *
 *
 * */

// Consider the modulo function we defined earlier and for easier use...

fun main(args: Array<String>) {

    // First we store the function returned from modulo(2) into isEven then we use it!
    val isEven: (Int) -> Boolean = modulo(2)

    val evens = listOf(1,2,3,4,5,6).filter(isEven)

    println(evens)

    /**
     * "First class functions" are just functions that support the passing in of functions and returning of
     * functions, also function assignment.
     *
     * It just means that the language treats functions like regular values, i.e. this language, Kotlin!
     *
     * */
}