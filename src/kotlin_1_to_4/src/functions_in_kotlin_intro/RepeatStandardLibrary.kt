package functions_in_kotlin_intro

// this library function Repeat * is used to invoke some function literal k number of times



fun printSomething() = println("Printing something")


fun main(args: Array<String>) {
    repeat(10, { printSomething() })
}