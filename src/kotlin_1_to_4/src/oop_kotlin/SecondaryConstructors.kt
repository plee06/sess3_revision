package oop_kotlin

// This is a primary constructor

// The ? represents "this can be null..."
class PersonAgain(val firstName: String, val lastName: String, val age: Int?) {
    // This is a secondary constructor ..

    /*
    * The syntax of the secondary constructor follows the following, you must declare a super to the original
    * constructor and passdown the original parameters.
    *
    * */
    constructor(firstName: String, lastName: String): this(firstName, lastName, null)

}

// Just to note* in Kotlin the access levels are also the same more or less as in Java