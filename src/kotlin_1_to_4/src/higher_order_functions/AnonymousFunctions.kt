package higher_order_functions

/**
 * Kotlin also supports Anonymous functions!
 *
 * Anonymous functions are simply functions that have their function definition name omitted.
 *
 * We can use them with short functions if we want to be explicit about return types or be more explicit in
 * general.
 *
 *
 * */

fun main(args: Array<String>) {
    // Consider the usage of anonymous functions
    val ints = listOf(1,2,3,4,5)

    // The filter predicate is an anonymous function where we pass in each Int and then run the Modulo and return
    // a Boolean
    val evens = ints.filter(fun(k: Int) = k % 2 == 0)
}


