package functions_in_kotlin_intro

import java.util.*

/**
 * Extension functions can also be added to companion objects!
 *
 * Remember that for now: Companion objects are like objects that "companion" classes that allow the
 * methods declared within them to be "static" in a sense
 *
 * And so instead of having an extension function as a member, or as a top level "global" we can just have
 * extension functions on Companion objects....
 *
 * How is this different?
 *
 * top level -> completely global and accessible. Defined on the native Objects of Kotlin like List ... etc.
 * member -> only available as a member function but is an extension function, i.e. myInstance.memberExtensionFunction(..)
 * companion object -> available like a static method MyClass.staticExtensionFunction(...)
 *  the benefit here is that you don't need specific instances, you just invoke it on the Class
 * */

// it's not exactly that useful considering we can just put it at the top level or member ...

// one useful benefit would be POSSIBLY adding a factory type function to a Type
// this is more intuitive then defining a whole new class like IntFactory and then creating a function within that ...
// but honestly, you could just declare a top level extension function like this:
fun Int.random(): Int {
    val random = Random()
    return random.nextInt()
} // but in this case it wouldn't make sense, you are calling this on a literally Int...
// much more intuititve to create Companion Object that acts "static' and call Int.random()..



// an extension function that is now "static" for Int class that returns a random number
// kind of like a "factory" that churns out random numbers!!!
fun Int.Companion.random(): Int {
    val random = Random()
    return random.nextInt()
}

// and now we can call as if it was like a static method

fun main(args: Array<String>) {
    val randomInt: Int = Int.random()

    val someInt: Int = 5

    // instead of doing something like

    // myIntInstance: Int = new Int()
    // myIntInstance.random() ...
    // and having random defined as a member extension function on Int
    // fun Int.random() { ... } ... etc.

    // Int.random() is just more "intuitive" then doing it on like myIntInstance.random() etc.
}