package functions_in_kotlin_intro

/**
 * just like how the operator overloading is avaialble on in and contains (only member / extension functions)
 * we can also do this on Get/Set
 *
 * such as the bracket access on arrays
 *
 *
 * */

// consider ...

private val list = listOf(1,2,3,4)
val start = list[0] // gets us the value 1

// now let's overload this operator for our own class!!!

enum class Pizza {
    Pepperoni, Sausage, Mozarella, Tomato
}

class PizzaMenu() {
    // create a menu with Array of type Pizza, size 12 and all with starting value of Pizza.Pepperoni from enum class
    private val menu = Array<String>(12, { Pizza.Pepperoni.toString() })

    // set our operator overloads for get and set
    operator fun get(index: Int): String {
        println("running from overloaded operator ")
        menu[index] // get pizza accordingly in our menu ..
        return menu[index]
    }

    operator fun set(index: Int, s: String): String {
        println("RUNNING FROM OVERLOADED OPERATOR ")
        menu[index] = s
        return s
    }
}

fun main(args: Array<String>) {
    var menu: PizzaMenu = PizzaMenu()

    println(menu[1]) // returns Pepperoni this is our overloaded method workign!!!

    // now set
    menu[1] = "NOPE NOT PEPPERONI ANYMORE!!!!"
    println(menu[1])

}