package functions_in_kotlin_intro

import java.util.*

/**
 * we also have the ability to run operator overloading on () invoke ... awesome?
 *
 *
 * */

// example

// declare class RandomLongs, takes in a Long
class RandomLongs(seed: Long) {
    // declare private val of a random which is an instantiated Random object with passed in number
    private val random = Random(seed)
    // when we invoke this operator overload we will generate a random number
    operator fun invoke(): Long = random.nextLong()
}

// with invoke we can overload with many different parameters ,,, no limit!
// consider a Min class with a bunch of invoke() overloads that take a multitude of integers ... instead of your
// original 1,2 arguments

fun main(args: Array<String>) {
    var r: RandomLongs  = RandomLongs(123091L)

    println(r()) // operator overloading, invokes random number long
}