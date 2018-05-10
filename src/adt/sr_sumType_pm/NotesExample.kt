package adt.sr_sumType_pm



/*
* Description of data
*
* */


/**
 *
 * Declare a method that takes in a Type A and then returns some result F based on the decomposition of Type A.
 *
 * This is using Structural Recursion with Pattern Matching on a Sum Type where Type A (Feline) is-a
 * Type B (Lion), Type C (Tiger) etc ....
 *
 *
 * */
fun getDinner(feline: Feline): Food = when (feline) {
    is Lion -> Anteloupe
    is Tiger -> TigerFood
    is Panther -> Humans
    is Cat -> CatFood
    else -> UnknownFood
}

// Type A
interface Feline {

    /*
    * Below we introduce the decomposing Structural Recursion method on Feline thus everything of TypeA
    * can now utilize this method.
    *
    * */
    // Utilize the Sum Type Pattern Matching Structural Recursion to decompose A
    // by creating a function f to return a result of Food.
    fun dinner(): Food
    // Method to say favourite food
    fun sayFood()
}


// Type B, C .... D, E
data class Lion(val favouriteFood: String) : Feline {
    override fun dinner() = Anteloupe
    override fun sayFood() = println(this.favouriteFood)
}
data class Tiger(val favouriteFood: String) : Feline {
    override fun dinner() = TigerFood
    override fun sayFood() = println(this.favouriteFood)

}
data class Panther(val favouriteFood: String) : Feline {
    override fun dinner() = Humans
    override fun sayFood() = println(this.favouriteFood)

}
data class Cat(val favouriteFood: String) : Feline {
    override fun dinner() = CatFood
    override fun sayFood() = println(this.favouriteFood)

}

// The relationship here is represented by "A is-a B, or C, or D, or E" it is of a Sum Type relationship


// Declare Food Type
interface Food

object Anteloupe : Food
object TigerFood : Food
object Humans : Food
object CatFood : Food
object UnknownFood : Food

fun main(args: Array<String>) {

    // Get something of Type A
    val p = Panther("I like Humans.")

    // Pass it into a function to decompose and return a result F, i.e. the type of Food it likes.
    println(getDinner(p)::class)
}