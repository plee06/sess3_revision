package functions_in_kotlin_intro

/**
 * Kotlin offers up multiple return values!
 *
 *
 *
 *
 * */

// Consider if we want to return two different values
// A square root of a number and return it's negative and positive value

// Could approach by writing two different functions as the following:
fun positiveRoot(k: Int): Double {
    require(k >= 0)
    return Math.sqrt(k.toDouble())
}

fun negativeRoot(k: Int): Double {
    require(k >= 0)
    return -Math.sqrt(k.toDouble())
}

// or use an arrayOf alternative

// here we define one function called roots which takes in an integer and returns an Array of type Double
fun roots(k: Int): Array<Double> {
    // use require to require a positive number ..
    require(k >= 0)
    // we then calculate the root
    val root = Math.sqrt(k.toDouble())
    // and then we return an Array of the two numbers, this way no two functions are required only one function!
    return arrayOf(root, -root)
}

// the problem? How do we know which one is negative and positive i.e. referring to the index. Is it 0 or 1???

// further improvement could be done by defining a Class and then wrapping our results in that Class
// as a new instance consider :
class Roots(pos: Double, neg: Double)

fun rootsImprovedWithClass(k: Int): Roots {
    // use require to require a positive number ..
    require(k >= 0)
    // we then calculate the root
    val root = Math.sqrt(k.toDouble())
    // and then we return an Array of the two numbers, this way no two functions are required only one function!
    return Roots(root, -root)
}
// the above has the advantage of named fields... we know what is positive and negative

// OR!!! ....we could use the custom Kotlin class called Pair this is kind of like a Tuple in a way this Pair
// will wrap up two diff values
fun rootsWithPairs(k: Int): Pair<Double, Double> {
    require(k >= 0)
    val root = Math.sqrt(k.toDouble())
    return Pair(root, -root)
} // a triple pair exists which is called... Triple

// I mean the basic usage of this is just so that we can return multiple types using "best practices"
// and instead of doing some boilerplate code (i.e. defining a freaking class for one function) use Kotlin's
// built in Pair / Triple!!!

// we can also do something similar when it comes to destructuring like in Python tuples
// consider

fun main(args: Array<String>) {
    // boom! Kind of like Python tuples no? ...
    val (pos,neg) = rootsWithPairs(16) // important to note, only works with pair interface if you want to use in class
    // consider data classes with usage, more on this later
}

