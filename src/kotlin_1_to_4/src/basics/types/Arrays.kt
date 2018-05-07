package basics.types

import java.util.*

// In Kotlin an Array can be created using the library function of arrayOf()

val array = arrayOf(1,2,3)

// Multi-dimensional Array by nesting
val multiArray = arrayOf(1,2,3, arrayOf(5,6,7))

// In Kotlin, you can also use arrayOfNulls() with a size specified to create an Array full of nulls!
val nullArrays: Array<Int?> = arrayOfNulls(99)

// You can also use the Array constructor syntax as well ...
// The arguments it takes in is the size, and a function that does something with the index numbers
val constructArray = Array(10, { i -> i })

// We just created an Array type object with the values of Int 1 2 3!

/*
* Like usual, the Kotlin Array buckets can be accessed through the [] bracket notation.
*
* Also provides standard size function. Look at Kotlin documentation for more details on the matter
*
* */

// Kotlin offers specific specialized primitive type arrays (everything is an object...) such as IntArray, LongArray etc.


fun main(args: Array<String>)
{
    // array.forEach { num -> println(num) }
    println(Arrays.toString(multiArray))

    println(Arrays.toString(constructArray))
}