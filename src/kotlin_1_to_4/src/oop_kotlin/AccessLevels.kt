package oop_kotlin

/*
* Just like in Java, Kotlin also has access levels which of course, like Java constrains where we can access the types and
* members !!
*
* Not providing an access level defaults to public in Kotlin just like in Java
*
* */


// Kotlin comes with three different access levels: Internal, Private, Protected + Public

// internal: new instance of class from anywhere WITHIN module , think of like -> package in java
// private: more restrictive than internal, only class visible in scope of file defining it
// protected: only for use of direct subclasses

// Public class with public methods
public class PublicClassYo
{
    init {
        println("I'm a public class yo!")
    }
}

internal class InternalClassYo {
    init {
        println("I'm an Internal Class Yo!")
        println("I can be accessed from within the same module, i.e. think package.")
    }
}

// This is only accessible here because it is private
private class PrivateClassYo {
    init {
        println("I'm a private class yo ... only can do this within same file or class.")
    }
}

// Protected, which is only available for subclasses

fun main(args: Array<String>)
{
    // Can do this because it's the same file
    val priv: PrivateClassYo = PrivateClassYo()


}