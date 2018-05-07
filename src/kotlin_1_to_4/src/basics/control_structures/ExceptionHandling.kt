package basics.control_structures

// The Handling of Exceptions in Kotlin is the exact same as in Java except in Kotlin, all exceptions are unchecked


// Checked Exceptions are those Exceptions that must be declared as part of a signature

fun doSomething()
{

    try
    {
        println("Try something.")
        throw Exception()
    } catch(e: Exception)
    {
        println("Do something else.")
    }
}


fun main(args: Array<String>) {
    // Prints out both Try something and Do something else because of the Exception thrown in try block

    doSomething()
}