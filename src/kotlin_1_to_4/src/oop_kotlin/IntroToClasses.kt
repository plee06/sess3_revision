package oop_kotlin


/**
 * Use the keyword class to declare a Class in Kotlin!
 *
 *
 * */
class MyClass {

}

// Declaring multiple classes ... hooray!
class MyClass2 {

}


// An Object is a runtime instance of a class ... consider this Person, if constructor empty, it's default otherwise
// declare it!

// This here is what we call the "primary constructor"


class Person constructor(val firstName: String, val age: Int) {}

// Main function
fun main(args: Array<String>)
{
    // Created at runtime
    val paul = Person("Paul", 27)
}


