package basics.equality

/*
* As you know, when working with OO languages, there are two types of equality.
*
* Structural equality and Referential Equality.
*
* */

// Referential Equality is ===, which tests whether two references point to the same object
var obj1: Any = Any()

var obj2: Any = Any()

fun testEquality()
{
    if (obj1 === obj2)
    {
        println("Same location in Heap.")
    }

    println("Different Locations in Heap.")
}

// * Look into this for peculiarities ...