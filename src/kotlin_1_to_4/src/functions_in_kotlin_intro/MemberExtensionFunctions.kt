package functions_in_kotlin_intro

/**
 * More often than not, member functions are declared at the top level, but we can also declare them within classes
 * as member functions as well!
 *
 * This can be utilized for the limiting of scope of extension functions
 *
 *
 * */

// consider this example from the book

// a Mappings class is defined
class Mappings {
    // within the Mappings class we define a new hashMap that is of type Int and String
    private val map = hashMapOf<Int, String>()

    // we then define a function that extends the String class called .stringAdd which puts a hashCode()
    // value into the map along with this particular String instance

    // add this string to our hashmap in our mappings instance along with its hashCode
    // this function is called the dispatch receiver i.e. when some other function, namely our add function
    // runs it'll dispatch to this extension function to run
    private fun String.stringAdd(): Unit {
        println("THIS IS THE @THIS QUALIFER HASHCODE REFERRING TO THIS INSTANCE OF MAPPINGS ${this@Mappings.hashCode()}")
        // this hashCode() here can either run on this String passed in or it can work on the mappings object
        // but because of the way Kotlin works
        map.put(hashCode(), this)
    }

    // we then define an add function which takes a String and then calls the .stringAdd() on the passed in
    // String
    // this is our extension reciever, it "recieves" the extension by calling it.
    // get it? This function receives our extension function!

    fun add(str: String): Unit {
        println(str.hashCode())
        str.stringAdd()
    }

    /*
    * when we have this name shadowing i.e. the dispatch receiver and the extension receiver, the Kotlin compiler
    * defaults to the extension function i.e. add and so the hashCode() is called on "str" in add and not on the
    * function of .stringAdd() where the hashCode() would be that specific function object.
    *
    * SO our hashCode() returns the hashCode of the specific String instance we pass in.
    *
    * If we want to use the dispatch receiver i.e. the .stringAdd() use qualifier of this@Mappings.hashCode()
    * which returns the hashCode of the mappings instance
    *
    * */
    fun show(): Unit = println(map.toString())
}


// runner
fun main(args: Array<String>) {
    var mappings: Mappings = Mappings()

    var s: String = "Hello"
    mappings.add(s)
    mappings.show()
    println("THIS IS OUR MAPPINGS HASHCODE IT'LL CORRESPOND TO OUR @THIS QUALIFER! ${mappings.hashCode()}")

    // so now instead of our extension function on String being global to every String instance
    // this extension function will only work on all Strings only if they get passed into our instance
    // this is limiting the scope of the extension function to only work as a "member" function!!


}


