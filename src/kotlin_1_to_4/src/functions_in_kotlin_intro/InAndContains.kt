package functions_in_kotlin_intro

/**
 * now we know!
 *
 * the in and contains methods are also available for overloading ...
 *
 * we can also overload these as well
 *
 * */

// consider

val arr = arrayOf(1,2,3)

val a = 1 in arr // returns true
val b = arr.contains(1) // returns true


operator fun String.contains(s: String): Boolean {
    println("HEY THIS IS YOUR SUPER COOL OPERATOR OVERLOADING FUNCTION!!!! DECLARED AS AN EXTENSION!!!")
    return true;
}

// and now run my super cool overloaded function

fun main(args: Array<String>) {
    "hello".contains("random string")
}