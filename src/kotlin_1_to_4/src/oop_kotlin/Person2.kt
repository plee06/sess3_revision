package oop_kotlin

// In Kotlin, we do not have to preface our constructor arguments with val or var... see below

// Getter = val, Setter = var. Think about that! One you're always "getting" the other you're always "setting" ...
class Person2(firstName: String, lastName: String, howOld: Int?) {
    // Declaration of two instance variables
    private val name: String
    private val age: Int?


    // Use this init block to set the name and age to a tied constant val
    init {
        this.name = "$firstName, $lastName"
        this.age = howOld
    }

    // Declare getter and setter methods, unlike the original Person where we could directly access the constructor
    // parameters, here we access through getter and setter methods
    fun getName(): String = this.name

    // Remember you have to declare Int as nullable here for the return type because that is what it states in the
    // constructor!
    fun getAge(): Int? = this.age
}

fun main(args: Array<String>)
{
    val paul = Person2("Paul", "Lee", 27) // Creates instance of Person2

    println(paul.getAge())
    println(paul.getName())
}