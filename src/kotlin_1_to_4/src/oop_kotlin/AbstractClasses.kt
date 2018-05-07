package oop_kotlin

// abstract keyword in Kotlin defines an abstract class


abstract class MyAbstractClass {}


// In Interfaces we just write out the function definitions to be impemented in implementing concrete classes
// but in abstract classes all functions must be declared with the abstract keyword unless implemented within the
// abstract class. If no abstract keyword is given it's just treated as a function that's already implemented
// and will be given as so in classes extending the abstract class
abstract class MustDefineFunctions {
    abstract fun doSomething()
}