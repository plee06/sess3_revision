package basics.null_and_types

// Consider the following


// Compile error, no null safety operator
// var str: String = null

// Null safety operator used, okay!
var str: String? = null


// Type checking and casting in Kotlin is done with the *is operator

fun isString(str: Any): Boolean
{
    return if (str is String) true else false
}

// ClassCastException thrown if not

/*
* Smart Casts in Kotlin.
*
* Unlike Java Kotlin is a bit smarter in "Smart casting"
*
* In Java we always have to explicitly cast something after checking if it instanceof for some element.
*
* i.e. if (str instanceof String) { String str = (String) str ... }
* In Kotlin, the explicit cast is done implicitly.
*
*
* */

// Consider:

// It can be of type Any, but Kotlin will "smart cast" and instead of throwing an error, it says "okay"
// if what you pass in is a String I'll print out the length, otherwise I won't

// Important to note that Smart casts will only work with variables that will not change between
// time it's checked and time when it is used, i.e. mutating any local var breaks this...


fun printIfString(s: Any): Unit
{
    if (s is String) println(s.length)
}

// Explicit Casting is also available in Kotlin, used with the *as operator

// Important to note that if a possible null is to be returned, use safe operator otherwise, ClassCastException is
// thrown.

fun tryCast(t: Any): String?
{
    return if (!(t is String)) t as String else null
}