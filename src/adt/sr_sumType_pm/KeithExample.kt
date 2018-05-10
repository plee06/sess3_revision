package adt.sr_sumType_pm


/**
 *
 * Keith's example. Is it Structural Recursion?
 *
 * This uses the Pattern Matching technique with Structural Recursion.
 *
 * We have a case for every possible subtype and it extracts the appropriate fields that we are interested in.
 *
 * */


// Here the Algebraic Data Type is of a "A is-a b or c" i.e. "IntList can be a Singleton End, or a data class Node"
// So it is utilizing the Sum Type Pattern
sealed class IntList
object End : IntList()
data class Node(val head: Int, val tail: IntList) : IntList()


// We declare multiple methods "f" which accepts a type of A, i.e. IntList and utilizes B and C to return an F.

/**
 * Here the length function is taking a type of "A" which is IntList.
 * It then uses Pattern Matching which in Kotlin is <when> and then decomposes by the different subtypes.
 * So when it is of Type B return this result F.
 * When it is of Type C return this result F.
 *
 * Type B can here be seen as End, and Type C can be seen as Node.
 *
 * Multiple decomposition functions are defined to return the appropriate F result that we want.
 *
 * All these methods call themselves recursively until it reaches a base case which in here is "End".
 *
 * They all calculate a different version of the head value.
 *
 * The result that we want i.e. F is utilizing A through the decomposed B and C Types.
 *
 *
 * */
fun length(l: IntList): Int = when (l) {
    End -> 0
    is Node -> 1 + length(l.tail)
}
fun double(l: IntList): IntList = when (l) {
    End -> End
    is Node -> Node(l.head * 2, double(l.tail))
}

fun product(l: IntList): Int = when (l) {
    End -> 1
    is Node -> l.head * product(l.tail)
}

fun sum(l: IntList): Int = when (l) {
    End -> 0
    is Node -> l.head + sum(l.tail)
}

fun main(args: Array<String>){

    // Create a Node object which takes in an Int and an IntList type. Node works because it's a subtype of IntList.
    // It's nested and "End" is the Singleton Object which is also of a type IntList
    val l = Node(3,Node(4,Node(5,End)))
    println(l)
    println("length = ${length(l)}") // Return the length of the current Node object
    println("double = ${double(l)}") // Return a Node that has been doubled
    println("product = ${product(l)}") // Return a Product of the Node, multiples each head value until base case
    println("sum = ${sum(l)}") // Returns a sum of the Node head values
}
