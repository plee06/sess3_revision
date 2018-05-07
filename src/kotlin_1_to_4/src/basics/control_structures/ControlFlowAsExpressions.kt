package basics.control_structures

import java.util.*

// In Java the control blocks are statements, i.e. they don't return anything in it's evaluations think boolean

// So in Java it's common to have:

/*
* boolean someBoolean = null; if (something) { someBoolean = assignThisThing } else { someBoolean = assignOtherThing } .
*
* */

// In Kotlin, control blocks are expressions and so the result can be directly assigned to a value or passed as
// an argument to another function

// Allows boilerplate code to be reduced and made more readable

val date = Date()

// Use of control flow expression to assign a boolean!

val today = if (date.time == 19L) true else false // Or something like this ...

fun checkIfZero(x: Int): Boolean
{
    return if (x == 0) true else false

    // Compare with: if (x == 0) { return true } else { return false } ... in Java
}

// Same concept can be applied to try/catch blocks in Kotlin

val success = try {
    println("Try this thing")
    true
} catch (e: Exception)
{
    println("Couldn't succeed")
    false
}

fun main(args: Array<String>) {
    success // Prints out "Try this thing"
}