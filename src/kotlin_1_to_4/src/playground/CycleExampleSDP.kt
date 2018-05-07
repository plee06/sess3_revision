package playground


fun add1(x: Int) = x + 1
fun times2(x: Int) = x * 2
fun add3(x: Int) = x + 3


typealias IntFunction = (Int) -> Int

fun cycle(f1: IntFunction, f2: IntFunction, f3: IntFunction): IntFunction {
    return { x -> f1(x) }
}


fun main(args: Array<String>) {


}

/*
* Example functions:
*
* fun add1(x: Int) = x + 1
* fun times2(x: Int) = x * 2
* fun add3(x: Int) = x + 3
*
*
*
* **/