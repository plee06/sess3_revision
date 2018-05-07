package functions_in_kotlin_intro

/**
 * Kotlin also allows us to overload the shorthand assignment operator of course, this is only for mutable
 * variables ...
 *
 * these shorthand operator assignments are += -= /= etc. ...
 * */

// consider this example

class Counter(val k: Int) {
    // consider the difference here to regular plus overload,
    // we're doing this as a member and returning a new Counter with the two added!
    operator fun plus(other: Int): Counter = Counter(k + other)
    // but if we just want += or -= i.e. shorthand assignments
    // we can always do plusAssign subAssign etc. ... limits the plus / sub + - !!

    // important to note, you can only use one or the other.

    // if you want functionality of both use plus / sub ... etc. if you just want assign shorthand use plusAssign etc.
    // look at docs for all possible operations. but basically same as basic operations + the Assign name
}


fun main(args: Array<String>) {
    var counter: Counter = Counter(1)

    // now use it

    counter += 3 // gives us 4
    // or
    counter = counter + 3 // also works
}