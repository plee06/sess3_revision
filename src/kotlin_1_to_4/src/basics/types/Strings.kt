package basics.types

/*
* Just like in Java, the Strings are immutable in Kotlin
*
* String literals in Kotlin can be built up either with " " or triple quotes """ which are multi-line spanning
* */

var justAString: String = "I'm a String yo!"


// Mutli-line raw String
// Remember that in a Raw string that the "spacing" is preserved, i.e. the format of how it looks is what we get!
var rawString: String = """
I'm a Raw string spanning
multiple
fucking
lines.

        """"

fun main(args: Array<String>)
{
    println(justAString)
    println(rawString)
}