package functions_in_kotlin_intro

/**
 * problem: If a function is defined to accept a variable number of args using varargs but we already ahve an
 * array of items. How can we pass it?
 *
 * i.e. we have an arrayOf(1,2,3,4)
 *
 * fun(varargs ints: Int) {... } // how do you pass this array in ?
 *
 * */

// asnwer the spread operator! the spread operator marked by * will unwrap the elements of an array and pass
// it in as individual elements ..


val strings: Array<String> = arrayOf("Hello","There","Paul")

fun multiprint(vararg s: String): Unit {
    for (str in s) println(str)
}

fun main(args: Array<String>) {
    // use spread operator

    multiprint(*strings) // done! As of now, Spread operator only works on Array types in Kotlin ...
}


