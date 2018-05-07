package oop_kotlin

class PersonTwo constructor(val firstName: String, val age: Int)
{
    init {
        println("Validate here that the first name is greater than length of three.")

        require(firstName.length > 3) {
            "Invalid first name."
        }
    }
}


fun main(args: Array<String>)
{
    // Throw an error because my name is less than length. of 3
    val paul = PersonTwo("Lee", 27)
}