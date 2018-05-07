package functions_in_kotlin_intro


/**
 * Finally! Extension Functions
 *
 * This is basically extending some functionality that we want for some existing object.
 *
 * Consider how String class doesn't have a reverse method ... or at least I don't think so in Kotlin?
 *
 * */

// This is our drop function as an Extension function, Extension functions must be top level functions i.e.
// declared at the top...

// this is our top level extension function, it returns some generic element type, extends List<E>, and returns List<E>


fun <E> List<E>.drop(k: Int): List<E> {
    val resultSize = size - k
    when {
        resultSize <= 0 -> return emptyList<E>()
        else -> {
            val list = ArrayList<E>(resultSize)
            for (index in k..size - 1) {
                // the use of *this keyword refers to the specific instance of List.
                // i.e. What instance of List is calling this?

                /*
                * With extension functions in Kotlin, the this* keyword always refers to the particular instance
                * that it is extending ..
                *
                * */
                list.add(this[index])
            }
            return list }
    } }


/// ** to use extension functions, just import them from your "extension functions class file"


fun main(args: Array<String>) {

    for (m in String::class.java.declaredMethods) {
        println(m)
    }
}

/**
 * An OOP approach to the problem like in Java would be to extend the Class with a Subclass and within
 * that Subclass define the method that we want.
 *
 *
 *
 * */

// For example say we want to have a extended functionality in List that "drops" the first k elements and returns to us
// that list after the drop!

abstract class DroppableList<E> : ArrayList<E>() {
    fun drop(k: Int): List<E> {
        val resultingSize = size - k  // size here is inferred
        when {
            resultingSize <= 0 -> return emptyList() // when the size is <= 0 of the list passed in just return empty
            else -> {
                val list = ArrayList<E>(resultingSize)
                for (i in k..size - 1) {
                    list.add(this[i]) // add to the list, this object list index accordingly
                }
                return list // and then finally return the list
            }
        }
    }
}

// but above isn't always possible, what if the class is defined as final? No extensions are possible
// another solution is to create a whole another class with Static helper functions, consider the entire Collections
// library. Those are all Static functions ..

/*
* The issue with this Static Function approach?
*
* #1 It makes code highly unreadable. Consider Collections.someFunction(someOtherFunction(.... MyActualCollection())...
* versus. MyActualCollection.reverse().drop(). ... etc.
*
* #2 Code completion in IDE isn't available cause we have to know the function name to access it within Collections
* instead of on the instance.
*
* In conclusion, it's just much easier to have extended functions on a specific instance ...
*
* */

// This is what extension functions do. They allow us to extend functionality without wrapping objects or
// modifying original or creating subclasses ...

/*
* In Kotlin, the way to create an Extension Function is by declaring a top-level function and then prefixing
* the intended type (i.e. the Class we are extending) before the function name.
*
* This prefix type is known as the "receiver type" in Kotlin
*
* So we can say, the "receive type" is the recepient of the extension in Kotlin!!
*
*
* */