package functions_in_kotlin_intro

/**
 * IMPORTANT! Extension Functions in Kotlin CANNOT override existing functions in a class or interface,
 *
 * if we do write one, they aren't ever invoked ...
 *
 *
 * When the compiler of Kotlin runs it says:
 *
 * 1. look in possible member functions of this instance
 * 2. if I can't find one, THEN consider extension functions
 * 3. otherwise, one of those member functions is bound
 *
 *
 * But, if you have two of the same functions with different parameters, then the binding to that Extension function
 * will work ...
 *
 * */


// Consider this Submarine Example

class Submarine {

    fun fire() {
        println("firing torpedoes sir!")
    }
    fun submerge() {
        println("submerging the submarine ... ")
    }

}

// and consider these top level extensions

// these won't run because the Kotlin compiler will bind the member functions
fun Submarine.fire() {
    println("firing torpedoes from top level extnesion functions sir")
}
fun Submarine.submerge() {
    println("submerging from the extension function sir ... ")
}

fun main(args: Array<String>) {
    val submarine: Submarine = Submarine()

    submarine.fire() // regular ones are run
    submarine.submerge()


    // run the extension with diff parameter
    submarine.fire("091237BALLISTIC######")
}

// but consider this top level extension that has a diff parameter, then this works even though the
// method names are the same, the parameters are different
fun Submarine.fire(name: String) = println("FIRING THIS TORPEDO FROM AN EXTENSION FUNCTION $name")