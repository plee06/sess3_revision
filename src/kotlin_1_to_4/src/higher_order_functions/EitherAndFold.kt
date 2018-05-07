package higher_order_functions

/**
 * What is the fold operation?
 *
 * Basically what fold does is that it will take an array of values and start with some initial
 * value that then will "fold over" each successive value and run an "accumulation" operation on each successive
 * value and at the end return the result of all that accumulation
 *
 * */



fun main(args: Array<String>) {
//    val ints = listOf(1,2,3,4,5)
//    println(ints.fold(0, { acc, int -> acc + int })) // this will result in 1 + 2 + 3 + 4 + 5 = 15

}

// example of Fold operation in an Either class type

//sealed class Either<out L, out R> {
//
//    //fold function within the class
//    fun <T> fold(lfn: (L) -> T, rfn: (R) -> T): T = when (this) {
//        is Left -> lfn(this.value)
//        is Right -> rfn(this.value)
//    }
//}
//
//class Left<out L>(value: L) : Either<L, Nothing>()
//class Right<out R>(value: R) : Either<Nothing, R>()


