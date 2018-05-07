package basics.types

// Important to remember that in Kotlin everything is an Object!

/*
* Kotlin offers your basic standard number types: long, int, short, byte, double, float ...
*
* For more information consider the Kotlin documentation, duh.
*
* */

fun main(args: Array<String>)
{
    var myLong: Long
    var myInt: Int
    var myShort: Short
    var myByte: Byte
    var myDouble: Double
    var myFloat: Float


    myLong = 123456L
    myInt = 42
    myDouble = 13.24
    myFloat = 12.34F

    // Etc. etc. ...


    // Important to note that the default in Kotlin is the * double and so with LONG and FLOAT we must use the suffixes
    // L and F accordingly.


    // "Widening" example
    // Widening refers to casting a type to it's "super" type, in the context of numbers, a number that can
    // handle more bits, or i.e. width
    var wideningExample: Long = myInt.toLong()


    // When it goes the other way around it's the same deal. We must "cast" explicitly using the .to* keyword
    var autoExample: Float = myDouble.toFloat()

}