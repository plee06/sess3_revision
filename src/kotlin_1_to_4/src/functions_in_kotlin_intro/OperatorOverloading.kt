package functions_in_kotlin_intro

/**
 * The ability to define functions that use operators is known as *operator overloading ...
 *
 * In Java, the set of operators to be used is fixed by the language, so developers cannot add their own.
 *
 * In Scala, it is much more permissive in allowing you to have virtually any combination
 *
 * So Scala and Java sit on opposite sides of the scale when it comes to that stuff
 *
 *
 * */

// it kind of just depends on you as a programmer of what you like ...

// Kotlin designers sat in the middle of it all ... allows operator overloading but in a fixed and controlled manner

// In Kotlin what we can do is choose an operator from their fixed list to be allowed of use as functions
// it's done be operator * keyword followed by the ENglish equivalent name of the operator which Kotlin
// sets up. The compiler then handles the rest !

// consider defining a new operator overload for adding two Matrix

class Matrix(val a: Int, val b: Int, val c: Int, val d: Int) {
    // defines our operator overload function corresponding to +
    // it takes a Matrix type and then returns a Matrix type
    operator fun plus(matrix: Matrix): Matrix {
        // returns a new Matrix by adding the value passed in (i.e. right hand side) MAtrix
        // and adding it with th left hand side matrix
        return Matrix(a + matrix.a, b + matrix.b, c + matrix.c, d + matrix.d)
    }

    override fun toString(): String {
        return "The values in this matrix are a: $a b: $b c: $c and d: $d"
    }
}
// key remember: val must be the keyword to be used inside member functions ... it's a way of "security"


// given this class ...

val m1 = Matrix(1,2,3,4)
val m2 = Matrix(1,2,3,4)

val m3 = m1 + m2

// compiled into val m3 = m1.plus(m2)

fun main(args: Array<String>) {
    println(m3.toString())
}
// limited example but its just to show that we can do it ....