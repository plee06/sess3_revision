package functions_in_kotlin_intro

/**
 * Okay so first off, what is an infix notation?
 *
 * it's just referring to an operator or function placed between operands / arguments!!
 *
 *
 * */

// example of the infix "to" which is used to create a pair

// in kotlin we can define our own infix functions, because by definition infix functions work on two arguments
// our infix functions must of course have only two parameters ...

/*
* how to define an infix function?
*
* first parameter in our function is the instance that our function is invoked on, second parameter is
* an explicit parameter to the function
*
* */

// example. still confused a bit.

// to define an infix function we just use the infix keyword, remember infix only has one explicit parameter
// the first parameter is implicit and the second is explicit

/*
* infix functions must meet three requirements:
* 1. member function or extension function
* 2. must have a single parameter
* 3. parameter must not accept variable number of arguments and no default value
*
* */

infix fun String.concat(other: String): String {
    return this + other
}

// consider some account class with an add function we can use infix for it
// the infix fun takes one parameter and the first parameter is implicit reference to the instance

class Account {
    private var balance = 0.0

    infix fun add(other: Int): Double {
        return this.balance + other
    }
}

// and then we can run it like this ...
fun main(args: Array<String>) {
    var acc = Account()
    // our instance variable add the parameter
    acc add 50 // this updates our balance ...

    // honestly not that much more readable but it's there if we need it.

    // a good time to use it would be for a frequently used function like the Pair "to" that mapping makes sense
    // and makes it readable. Compare the styles below
    val pair1 = "London" to "Paris"
    //vs ...

    val pair2 = Pair("London", "Barcelona")

    // obvio one is more readable or consider

    val map1 = "Fifty Grand" to "Rich!!!!"
    //vs
    val map2 = "Fifty Dollas" to "Poor...."

}