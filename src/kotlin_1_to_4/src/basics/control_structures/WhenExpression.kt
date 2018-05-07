package basics.control_structures

// The when expression in Kotlin is the same construct as the "switch" statement

/*
* In Kotlin there are two flavors of "when".
*
* 1 -> passes in a value and with a series of conditions, each is checked against that value
* 2 -> without argument and has a series of conditionals
*
* */


// 1 -> with value

// Print out the number I just passed in with a when statement
fun whatNumber(x: Int): Unit
{
    when (x)
    {
        0 -> println("It's a zero.")
        1 -> println("It's a one.")
        2 -> println("It's a two.")
        3 -> println("It's a three.")
        else -> println("I'm kinda basic. Sorry.")
    }

}


// You can also separate based on constants so when (x) { 0,1,2,3 -> println("Between 0 to 3") ... }

// Also, similar to how conditional blocks are expressions the when statement can return a value!


fun returnAValue(x: Any): Any
{
    var a: Any = when (x) {
        x is String -> "hey it's a string"
        x is Int -> 42
        else -> "uh.... couldn't figure it out."
    }

    return a
}

// when is very flexible in Kotlin, experiment with it!



fun main(args: Array<String>)
{
//    whatNumber(5)
//
//
//    var whatAmI = returnAValue(100) // returns 42 because of type Int
//    println(whatAmI)

    whenWithoutArgs(5,6) // Should print out "y is greater than x"

}

/*
* The second format is when without argument, this is for "conditionals", it can be seen as a drop-in replacement for
* if/else clauses!
*
* */
fun whenWithoutArgs(x: Int, y: Int): Unit
{
    when
    {
        x > y -> println("x is greater than y")
        y > x -> println("y is greater than x")
        else -> println("x and y are equal")
    }
}

