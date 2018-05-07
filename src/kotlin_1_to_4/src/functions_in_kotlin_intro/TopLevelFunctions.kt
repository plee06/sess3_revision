package functions_in_kotlin_intro

/**
 * In addition to member functions and local functions: top-level functions also exist in Kotlin!
 *
 * What are top level functions?
 *
 * Top level functions exist outside of any class, object, interface etc. that are defined in the file.
 *
 * We can think of these as the equivalent of static functions in Java! Hence, very useful as helper functions.
 *
 *
 * */


// Creating a "top-level" function is simple in Kotlin, the compiler does all the work. Simply just declare a function at
// the top of a kt. file!
fun top() = println("I'm at the top.")