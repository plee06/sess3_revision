package oop_kotlin

// An Example of the Usage of Sealed Classes in Kotlin ...

// We havbe one abstract sealed class called Operation (y default Sealed classes are abstract)
// A Sealed class is basically like an enum with various types of this particular class.
// i.e. a Class that has multiple subclass types that are "sealed" i.e. can't be changed later.
sealed class Operation {
    // Two possible instantations of Add and Subtract both which extend from our abstract Operation
    class Add(val value: Int): Operation()
    class Subtract(val value: Int): Operation()
}

// So then we can have a function that works on our Sealed class with a when statement
// So if object passed in is of a certain type do the corresponding operation.
fun exec(x: Int, op: Operation) = when (op) {
    is Operation.Add -> x + op.value
    is Operation.Subtract -> x - op.value
}

fun main(args: Array<String>) {
    // So here we instantiate from our "Super Enum Sealed Class" of possible Operation Concrete classes the
    // Add operation with a value of 5.
    val addOp: Operation = Operation.Add(5)

    // We then have an Exec function which takes in an integer and gets passed in some Operation
    // and this function will take care of the operation by using a when statement to match cases
    // on that sealed class

    // The benefit? Instead of having different functions, just one function on a sealed class type
    // that will switch based on the class type!
    exec(5, addOp)
}