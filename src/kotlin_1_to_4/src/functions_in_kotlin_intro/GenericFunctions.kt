package functions_in_kotlin_intro

/**
 * Kotlin like Java, gives us access to Generic Functions!
 *
 *
 *
 *
 * */


// some generic functions ...

fun <E> printGeneric(type: E): Unit {
    println("I just got passed in and I'm $type")
}

// I'mportant to note that with multiple Generic parameters they must all conform to the same type
// i.e. three parameters must all be Int or String etc.
fun main(args: Array<String>) {
    printGeneric("String!")
    printGeneric(55)
    printGeneric(203902L)
}