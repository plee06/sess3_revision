package basics.control_structures

// We can see a range in Kotlin as "from this thing A to this thing B" where A / B can be numbers or the alphabet


// Consider ...

val aRangeFromAtoZ = "a".."z"

val oneToTen = 1..10

// the *in operator in Kotlin can be used to test for: "is this within the range"?

fun main(args: Array<String>)
{
    if (11 in oneToTen)
    {
        println("Yup, 11 is in the range of one to ten.")
    } else
    {
        println("Nope, 11 is not in the range of one to ten. Duh? Come on man.")
    }
}

// * Key point is that there are many ways to manipulate ranges in Kotlin, refer to the documentation for more information

