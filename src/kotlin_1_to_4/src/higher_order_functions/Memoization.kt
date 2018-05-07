package higher_order_functions

import java.util.concurrent.ConcurrentHashMap

/**
 * What is Memoization?
 *
 * Basically this technique is used for speeding up function calls by caching the results and reusing that output
 * instead of having to recompute the results every time.
 *
 * Kind of think of it like the relationship between the CPU and Cache in Computer Architecture.
 *
 *
 * */


// Example with Fibonacci
fun fib(k: Int): Long =
    when (k) {
        0 -> 1
        1 -> 1
        else -> fib(k - 1) + fib(k - 2)
    }


fun main(args: Array<String>) {
    println(fib(6)) // 0 1 1 2 3 5 8 13
}

// Instead of risking possible Stack overflow and in general just running a "bad" recursive method
// we can use a map to take advantage of memoization

val map = mutableMapOf<Int, Long>()
fun memfib(k: Int): Long {
    return map.getOrPut (k) {
        when (k) {
            0 -> 1
            1 -> 1
            else -> memfib(k -1) + memfib(k - 2)
        }
    }
}

/**
 * So what's happening above?
 *
 * Basically we return a value everytime we call memfib either a value is put into the map and then
 * returns that value we just put into the map, or it'll get the
 * value from the map if it already exists and just quickly return it.
 *
 * */

// General Memoization function implementation to use anywhere

/*
* This function is a Generic function which takes in one type of A and returns a type of R.
* It's parameter is a function itself with type parameter A and return parameter R and returns
* a function of type parameter A and return R.
*
*
*
* */
fun <A, R> memoize(fn: (A) -> R): (A) -> R {
    // First we declare and initialize a concurrent HashMap which maps from type A to type R
    val map = ConcurrentHashMap<A, R>()
    // And then we return a wrapper function
    // here a -> runs getOrPut on the map we declared above and will link the key value of (a)
    // whatever that parameter was that was passed into the original function and map it to the
    // value of fn(a) the function result, it'll either A. retrieve if it exists or B. put and return if it doens't
    return { a ->
        map.getOrPut(a) {
            fn(a)
        }
    }
}


