package functions_in_kotlin_intro

/**
 * Idea behind functions simple -> make programs into small bits
 * these bits should allow reuse to avoid repetition -> DRY principle
 *
 * In Java we create "helper" methods to help methods out by calling them in the bigger methods
 *
 * In Kotlin, we're allowed to create nested / local functions !
 *
 * The depth of nesting can be some infinite *?  amount of times
 * */



fun sayHello() {
    fun sayGoodbyeFirst() = println("Goodbye First")


    println("Hello Second.")
}


/**
 * Local functions are automatically private i.e. they can't be accessed elsewhere and has similar scoping rules
 * i.e. it can access the outer scope variables
 *
 *
 * */

fun tryUsingGoodbye() {
   // sayGoodByeFirst() // Throws Error
}