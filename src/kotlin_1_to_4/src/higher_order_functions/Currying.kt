//package higher_order_functions
//
//import java.util.logging.Level
//
///**
// * Currying is a concept in functional programming and it is a "common" technique.
// *
// * What exactly is Currying?
// *
// * Currying is the concept of taking one function -> that accepts multiple parameters and turning
// * that one function -> into a series of functions taking just one parameter.
// *
// * */
//
//// Example:
//
///*
//* Non-curried function that has two parameters, and returns a Boolean
//* fun foo(a: String, b: Int): Boolean
//*
//* the "curried" version would look like this: fun foo(a: String): (Int) -> Boolean ...
//*
//* The curried version above takes in one parameter a String, and returns a function that takes in the
//* what was originally the second parameter and returns a Boolean.
//*
//* */
//
///**
// *
// * Currying is related to "partial application".
// *
// * What this means is that some parameters of a function are specified in advance, but then a new function
// * is returned that accepts the missing parameters.
// *
// * So we can say that partial application -> produces from a generalized function -> a specialized function ...
// *
// * For example: fun foo(a: Int, b: Boolean, c: Double): Long
// *
// * an example of "partial application" might be to apply Int and Double but then return a function
// * that goes from Boolean -> Long
// *
// * */
//
//// Currying in action
//
//// First let's say we have a logging function which just prints out some stuff
//
//// fun compute(logger: (String) -> Unit): Unit
//
//// then let's say that the logging function has three parameters
//
//// fun log(level: Level, appender: Appendable, msg: String): Unit
//
//// Could be invoked like: log(Level.Warn, System.out, "Starting Execution") ...
//
//// We can see here clearly that the compute function cannot take our log * function in the way that it is
//// defined. Why? our log function takes three parameters and the compute() function that takes a logging function
//// only takes one parameter!
//
///*
//* This is where we want to apply the concept of "partially apply" ... to create a function of the form
//* (String) -> Unit
//*
//* */
//
//// Done manually by wrapping in a function literal
//
////fun compute {
////    msg -> log(Level.Warn, Appender.Console, msg)
////}
//
//// Kotlin doesn't have any "native" Currying but offers up some functionality to mimic it ...
//
//// Adding Currying Support
//
//fun <P1, P2, R> Function2<P1, P2, R>.curried(): (P1) -> (P2) -> R = {
//    // Run lambda function of parameter p1 with function literal and within that function literal
//    // we have another lambda function that runs this(p1,p2)
//    p1 -> {
//        p2 -> this(p1, p2)
//    }
//}
//
//// a curry function that has four generic types p1,p2,p3 and then a return type
//// it is defined as an Extension function on FunctionN and this extension function is called "curried"
//// The "curried()" function returns a function that runs sequentially through P1, P2, P3
//// so P1 returns type P2, P2 returns type P3, P3 returns type of R which is the final return type.
//fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.curried(): (P1) -> (P2) -> (P3) -> R = {
//    // Within the function we run a lambda on p1 which in turn runs p2 lambda which in turn runs p3 lambda
//    // which refers to "this" which is curried() and runs it on p1,p2,p3
//    p1 -> {
//        p2 -> {
//            p3 -> this(p1, p2, p3)
//        }
//    }
//}
//
//
///**
// * Each time a function is applied (think about the lambda expression p1 -> ... p2 -> {...} ... etc.
// * ) another function is returned with the "arity" (parameter) reduced by one, i.e. number of arguments that the
// * function takes.
// *
// * Each time the function is called it will return a function with one argument reduced.
// *
// * Consider. We run a Function3 i.e. Three arguments, that will then run Function3.curried() which runs
// * p3 with three arguments. p3 with Three arguments is nested within p1 and p2 and so once p3 is done running
// * with three arguments p2 is run with two arguments and then p1, the original function is run.
// *
// *
// * */
//
//
//fun main(args: Array<String>) {
//
//    // Example currying with logger
//
//    fun logger(level: Level, appender: Appendable, msg: String) {
//        println("running.")
//        println(msg)
//    }
//
//    // Curry the logger and partially apply
//    // Remember :: is a function reference
//    /*
//    * So as we can see here instead of passing in three parameters we just pass in two parameters,
//    * the Level and Appendable and then assign it to a value of logger and that value of logger
//    * which is a function can then run with one parameter of String, the message
//    *
//    * Currently logger = Function3 and so running curried runs on Function3.curried().
//    *
//    *
//    * */
//    val logger = ::logger.curried()(Level.SEVERE)(System.out) // Returns a curried function that
//    // only takes one parameter.
//
//    // Run the curried function with one parameter
//    logger("My message")
//
//    // So we can just kind of simply say that Currying is a way to break down functions
//    // that into multiple functions and each level of a nested function just returns a function
//    // with one less parameter necessary to run it.
//}