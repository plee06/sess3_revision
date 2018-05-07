package higher_order_functions

/**
 * What is a Higher Order Function?
 *
 *
 * */

/**
 *
 * What is a Higher Order Function Exactly?
 *
 * A higher order function is simply a function that accepts another function as a parameter
 *
 * or returns a function as it's value.
 *
 * It can also be both!
 *
 *
 * */


// An Example:

/*
* This function of foo takes in a String as an argument along with a function (Parameter type String that returns
* a String) and the function foo itself returns nothing i.e. Unit.
*
* Note the fn. being passed in, the parameters are wrapped in a ( ... ) and a -> used to identify the return type.
*
* */
fun foo(str: String, fn: (String) -> String): Unit {

    val applied = fn(str)
    println(applied)
}

// The above function could also be written as the following:
fun foo(str: String): Unit {
    println(str.reversed())
}

// So why use higher order functional programming? It makes things easier in the long run.

// Consider the approaches to separating a list of Int based on even and odd
fun evenOrOdd(ints: List<Int>): Unit {

    ints.forEach { it -> if (it % 2 == 0) println("It's an even number $it") else println("It's an odd number $it") }

}


fun main(args: Array<String>) {
    // Calling of our higher order function that takes in a String and our function literal which uses the "it"
    // reference
    foo("Hello", { it.reversed() })

    // This will output the String reversed

    /**
     * A Function Literal can use the `it` parameter to avoid naming the argument explicity.
     * The above is the same as the below
     *
     *
     * */

    foo("Hello", { "Hello".reversed() })

    // Run even or odd, consider here that we wrote a whole function to take in the argument.
    // Kind of FP style but it's not.
    evenOrOdd(listOf(1,2,3,4,5))

    // Here we use the filter function which takes in a function literal and apply it!
    val evens = listOf(1,2,3,4,5).filter { it % 2 == 0 }
    println("List of even numbers $evens")
    val odds = listOf(1,2,3,4,5).filter {it % 2 == 1 }
    println("List of odd numbers $odds")
}