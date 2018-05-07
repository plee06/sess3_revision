package higher_order_functions

/**
 * In Functional Programming ...
 * a closure is a function that has access to variables and parameters defined in outer scopes.
 *
 * These functions are said to "close over" these variables, hence "closure."
 *
 * i.e. some inner function will "close over" some outer scope variables.
 *
 *
 *
 * */


// Define a Student Class. Represents a DB
class Student(val firstName: String, val lastName: String)

// Our Load function that returns a List of Student
fun loadStudents(): List<Student> = listOf(Student("Paul", "Lee"))

/*
* Here we can say that the students function is "closing over" loadStudents() because it's accessing the
* Student variable being returned from loadStudents(), i.e. accessing some scope that it is outside it's own.
*
* The actual "closure" happens in the filter function literal. It's access is "outside" of it's own scope.
*
*
* */
fun students(nameToMatch: String): List<Student> {
    return loadStudents().filter {
        it.lastName == nameToMatch
    }
}

/*
* And just a note, in Kotlin when using "closure", closing over outer scope variables (accessing them)
* we can also mutate them! So be careful.
*
*
* */

// Consider the closure mutation below

fun main(args: Array<String>) {
    var toCloseOverAndMutate: Boolean = false

    val ints = listOf(1,2,3,4,5)

    // Mutates the "closed over" variable
    ints.forEach { if (it < 0) toCloseOverAndMutate = true else false }
}