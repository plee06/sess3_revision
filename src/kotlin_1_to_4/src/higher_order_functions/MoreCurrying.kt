package higher_order_functions

/**
 * Another Currying Example in Kotlin
 *
 * Partial application allows us to "fix" certain parameters to a function.
 * */


// This is an extension function defined on Function3 which is the compiled version for the JVM which are just instances
// of classes called Function1, Function2, Function3.

// i.e. whenever we define a function with the parameters the numbers here represent N number of parameters
// and so by extending these we are extending any general function with these numbers of parameters.

// Here the function takes in four generic types, three parameter types and one return type and we extend it on
// Function3.curried() within our Function3.curried() we return a series of functions that are called

// the return type part is essentially saying
// parameter type p1 returns a function that takes in parameter type p2, which takes in a function of
// paramter type p3 which returns the final result of R

// so at the end of the day we return p1, but p1 being returned is a function that is p2, then p2 returns p3, p3 -> R
fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.curried(): (P1) -> (P2) -> (P3) -> R = {

    // within the function we declare the following ....
    // first we call p1 which returns to us p2
    // then the p2 function returns to us p3 function  and we can look at p3 as our "base"
    // it returns to us that final result we want which in this case is whatever p3 is called with
    // all three arguments.

    // the chain works with first a p1 call, p2 awaits the p1 call, p3 awaits the p1 and p2 call
    // each pN call here "closes over" the outer scope values and thus why p3 can call with p1,p2,p3
    p1 -> {
        p2 -> {
            p3 -> this(p1,p2,p3)

        }
    }
}

fun dragon(name: String, size: String, power: String) {
    println("$name the $size dragon has the superpower of  $power!")
}

fun uncurriedDragon(name: String, size: String, power: String) {
    println("$name the $size dragon has the superpower of  $power!")
}

// For each level of currying we want to do, have to define a new FunctionN curry function ...
fun main(args: Array<String>) {
    // currying in action , the arguments are filled out based on first parameter to last
    val p1 = ::dragon.curried()("Fluffykins") // returns a function still of p2 which takes in the second parameter
    val p2 = ::dragon.curried()("Fluffykins")("tiny") // returns a function of p3 which awaits the last parameter
    val p3 = ::dragon.curried()("Fluffykins")("tiny")("ice") // we've now fulfilled all three parameter requirements

    val dragon = ::dragon.curried()("Fluffykins") ("tiny")

    // now we can run dragon with just one parameter!
    // the last one of power
    dragon("lightning power")

    // versus the following
    uncurriedDragon("Hobart", "large", "fire power")

}