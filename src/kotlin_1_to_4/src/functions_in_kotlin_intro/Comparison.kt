package functions_in_kotlin_intro

/**
 * the comparison operators, less-than, greater-than, less than equals etc. are all overloadeable...
 *
 * it must conform to the Comparator and can be overloaded with *compareTo
 *
 * if we want < -> - number
 * if we want > -> + number ...
 *
 *
 * */

// consider

class BingoNumber(val name: String, val age: Int) {
    operator fun compareTo(other: BingoNumber): Int {
        return when {
            age < other.age -> -1 // return greater than if age we're comparing to is less than what we pas sin "right"
            age > other.age -> 1 // return less than if age we're comparing to is greater than "left > right"
            else -> 0 // represents the equal
        }
    }
}

// we can now compare bingo number instances with > < ! which normally can't be done ... hello overloading

fun main(args: Array<String>) {
    val a = BingoNumber("KEY", 21)
    val b = BingoNumber("HELLO", 58)

    println(a > b) // returns false
    println(a < b) // returns true
}