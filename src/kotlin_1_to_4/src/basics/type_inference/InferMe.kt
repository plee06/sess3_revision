package basics.type_inference

fun main(args: Array<String>)
{
    // In Kotlin, the types can be inferred.

    /*
    * Note the difference in comparison with Java where with variable initializations, the type has to be
    * explicitly declared.
    *
    **/

    // Consider ...
    var someNumber: Int = 42
    // vs.
    var otherNumber = 99

    // Type inference hello!

    // This allows for reduction of "boilerplate" while keeping type safety

    // The Kotlin compiler figures out the type of an expression from the information given in the expression

    /*
    * i.e. this expression has the number 42, I'm going to say it's of type Int and give it to this variable
    * of someNumber 42 (in the case that we didn't explicitly declare Int ...)
    *
    * */
}

/**
 * Type inference can also happen in functions!
 *
 * Here, instead of giving an explicit return type, the compiler again "infers" the return type to be Int
 *
 */

fun addOne(x: Int) = x + 1

// Or ...

fun addTwo(y: Int): Int = y + 2 // Explicitly declare that the return type is Int