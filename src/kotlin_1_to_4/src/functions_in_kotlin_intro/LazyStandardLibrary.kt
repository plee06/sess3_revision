package functions_in_kotlin_intro

/**
 * the lazy library function allows us to wrap an expensive function to be invoked when required, so the compiler
 * does not actually create these objects at runtime and instead we invoke them on our own at runtime
 *
 *
 * */


class MySuperExpensiveObject {
    // tons of stuff ...
}


val dontInvokeTillNecessary = lazy { MySuperExpensiveObject() } // can be done on objects or functions!

fun superExpensive() = println("My super expensive function ... ")

val anotherExpensiveFunction = lazy { superExpensive() } // not invoked until we do it explicitly