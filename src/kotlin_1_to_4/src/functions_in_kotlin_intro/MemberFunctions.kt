package functions_in_kotlin_intro

/**
 * The first type of functions in Kotlin are known as "member functions"
 *
 *
 *
 * */

// Member functions => functions defined inside a class, object or interface


// And of course, invoked in same manner ... objectName.function
val s = "Hello"


// Same as in Java, member functions within same object / class can refer to itself no problem
object Rectangle {
    fun printArea(width: Int, height: Int): Unit {
        val area = calcArea(width, height)
        println("This is the area $area")
    }

    fun calcArea(width: Int, height: Int): Int {
        return width * height
    }
}


fun main(args: Array<String>) {
    println(s.length)
}