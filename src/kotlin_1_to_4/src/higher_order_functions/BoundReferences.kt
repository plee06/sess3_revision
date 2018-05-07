package higher_order_functions

/**
 * In Kotlin we can "bind" function references to a particular instance.
 *
 * Basically what this means is that we can place an expression before a function reference which will
 * "bind" itself to that function reference.
 *
 *
 * */

// First usage with unbound references

// Here this function takes in a String called other and compares it to the current String
// An Extension Function
fun String.equalsIgnoreCase(other: String) = this.toLowerCase() == other.toLowerCase()


fun main(args: Array<String>) {
    // Unbound usage
    val s = listOf("foo", "moo", "boo")

    // Because this takes in a parameter we have to pass it in after the function reference
    // So what's happening here is we run the filter with the function literal
    // and within the function literal we pass in the extension function on String through a function reference
    // but because this function reference takes in a parameter we must "bind" to it the parameter
    // and so we pass in the parameter of "bar" and use the it to refer to the bar. This is the way it must be
    // done for function references!
    val matches = s.filter { (String::equalsIgnoreCase)("bar", it)}
    println(matches) // Returns empty

    // Bound usage
    val boundMatches = s.filter("bar"::equalsIgnoreCase) // Here Kotlin will bind the parameter of
    // "bar" to our function reference of equalsIgnoreCase!
}