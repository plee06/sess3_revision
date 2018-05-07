package functions_in_kotlin_intro

/**
 * function literals in Kotlin can be defined with the { ... } braces
 *
 *
 *
 *
 * */

// example.

val printHello = { println("Hello!") }

// these function literals once defined as above can be invoked like regular functions as shown below

/*
* function literals in Kotlin can also accept parameters!
*
*
* */


// consider ...
val printMessage = { message: String -> println(message) }


// and of course just like regular functions, in Kotlin the type is inferred as so we can omit the type i.e.
// the message: String part

/**
 * Kotlin's awesome trick!
 *
 * if there is a single parameter, i.e. a function with a single parameter.
 *
 * we can completely omit the parameter and make it "implicit" with *it keyword
 *
 * * this is coming up in higherorder functoins. wait for that .
 *
 * */


fun main(args: Array<String>) {
    printHello()
    printMessage("HI WORLD!")
}