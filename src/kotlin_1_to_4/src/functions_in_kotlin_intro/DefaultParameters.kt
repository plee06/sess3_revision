package functions_in_kotlin_intro

import java.math.BigDecimal
import java.math.RoundingMode

/**
 * Default Parameters in Kotlin
 *
 *
 * */


// A lot of the times, such as in Java we can provide overloaded methods for different types of method
// runs based on the parameter arguments. At that point the user can choose which one to invoke by just passing in
// the correct parameters

// But this can lead to a lot of the same repeat code with overloaded versions of the same function

/**
 * Consider Java BigDecimal
 *
 *  public BigDecimal divide(BigDecimal divisor)
 *  public BigDecimal divide(BigDecimal divisor, RoundingMode roundingMode)
 *  public BigDecimal divide(BigDecimal divisor, int scale,  RoundingMode roundingMode)
 *
 * In Kotlin, a specific function can define one or more of its parameters to have default values!
 *
 * These default values are used if the parameters for them are not specified, this allows a single function be used
 * for multiple cases thereby avoiding the same overloaded variant like in Java.
 *
 * Consider a Kotlin version of divide
 * */

fun divide(divisor: BigDecimal, scale: Int = 0, roundingMode: RoundingMode = RoundingMode.UNNECESSARY): Unit {
    // ... Some code

    println("Pretending like I'm dividing ... ")
}

// Above we can see that instead of having multiple overloaded versions, we can just pick and choose one parameter
// or multiple parameters and everything else goes to default

/*
* It's important to remember that in Kotlin if you don't explicitly declare the parameters you are passing in
* such as roundingMode = RoundingMode.HALF or scale = 0 you cannot mix up the order, i.e. you can't go from
* divisor, roundingMode <-- throws an error.
*
* To get around that you can explicitly declare it.
*
* Consider:
* */

fun main(args: Array<String>) {
    // Okay
    divide(BigDecimal(5.3))
    // Also Okay
    divide(BigDecimal(5), 9)

    // Not okay, mixing up order without explicit declarations
    // Throws a mismatch error, i.e. the parameters don't match
    // divide(BigDecimal.TEN, RoundingMode.DOWN)

    // But you can do this round-about through explicit declaration!!!
    divide(BigDecimal.TEN, roundingMode = RoundingMode.CEILING) // It works!!!!

    // In general to access this "powerful feature" of default parameters consider the usage with explicit declarations

    // This same concept can be applied to constructors so instead of multiple constructors
    // or something like "Telescoping" we can define on main constructor and just define default parameters as well


    // student constructor example

    // the old way
    val student: Student = Student("Paul") // this will call the second constructor based on "telescoping"

    // the new way
    val student2: StudentTwo = StudentTwo("Paul") // because we pass in name only, it'll default the false and 0

    // consider this with parameter naming
    val student3: StudentTwo = StudentTwo("Paul", credits = 10) // it works!!


    // to do that with the old constructor way? Not possible with the way we've defined it
    // val student4: Student = Student("Paul", credits = 5) -> throws error
}

// Example of default constructor usage

// Consider this "multiple constructors" taking advantage of overloading

class Student(val name: String, val registered: Boolean, credits: Int) {
    // and then we have other constructors based on passed in values
    constructor(name: String) : this(name,false, 0) // if someone passes in name only, it defaults with false and 0
    // likewise another one, if someone passes in two, set third to default
    constructor(name: String, registered: Boolean) : this(name, registered, 0)

    // this also doesn't work, we have to call the constructor in order ...
    // constructor(name: String, credits: Int) : this(name, registered = false, credits)
}

// but we can just do this with "default parameter" usage and then combine it with parameter names
class StudentTwo(val name: String, val registered: Boolean = false, credits: Int = 0) {

}

// and to compare above in main

// the KEY takeaway here is that we can use default parameters to manipulate constructor parameters to shorten code
// and same thing with functions