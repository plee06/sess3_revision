package higher_order_functions

/**
 * In Kotlin we also have the ability to return a function! Which is also a higher order function.
 *
 *
 * */

/*
* This is a function that returns a type of function that takes in a String as a parameter and returns a String.
*
* The function bar itself returns that function! i.e. str -> str.reversed()
*
* The function literal of { str -> str.reversed() } returns a function that takes in type of String and returns
* the String reversed.
*
* */
fun bar(): (String) -> String = { str -> str.reversed() }


// Consider the following:

/*
* Here we define a modulo function that has one parameter of type Int.
*
* It returns a function that uses that passed in parameter as a modulo divisor!
*
* */

fun modulo(k: Int): (Int) -> Boolean = { it % k == 0 }

fun main(args: Array<String>) {

    val getTheFunction = bar() // Here we grab the returned function, and now we can run it!

    println(getTheFunction("Hello"))

    // Consider using the higher order function here

    val ints = listOf(1,2,3,4,5)
    /*
    * What we are doing here is passing in the predicate of modulo(2) which returns the required parameter
    * in filter(...) which is a function that goes from Int -> Boolean and the function we return from modulo
    * is the parameter of `it` which refers to the ints and % k which is 2. And so it's checking to see if
    * for every int (it) it's even.
    *
    * */
    val evens = ints.filter(modulo(2))
    val all = ints.filter(modulo(1))
    println("List of evens give to us from the filter predicate with higher order functions $evens")
    println("List of all given to us from the filter predicate with higher order functions $all")
}