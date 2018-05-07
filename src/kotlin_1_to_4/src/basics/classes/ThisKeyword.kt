package basics.classes

class Person(name: String)
{
    val name = name

    fun whoThis() = println(this.name)

    fun printThis() = println(this) // Will print out the Object
}

/*
* In Kotlin the 'this' keyword refers to the enclosing instance, same thing as in Java!
*
* One thing to be careful about is the Scope. Consider an inner class and how that works... you can label
* the this with @ and the Outer class name to make it accurate. More in Chapter 3.
*
* this@SomeClass.thatProperty
*
* */

fun main(args: Array<String>)
{
    val paul = Person("Paul")

    paul.whoThis()
    paul.printThis()
}