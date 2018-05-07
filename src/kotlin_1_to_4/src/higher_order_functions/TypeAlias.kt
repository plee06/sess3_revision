package higher_order_functions

/**
 * What is typealias?
 *
 * typealias in Kotlin is just a way declare a new type that is an "alias" of an existing type.
 *
 * For example, renaming a HashMap to "Cache" or something like that.
 *
 *
 * */

typealias Cache = HashMap<Int, Boolean>


// and use it here
fun useCache(): Cache {

    // etc ...
    return HashMap<Int, Boolean>()
}

