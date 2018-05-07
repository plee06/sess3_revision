package basics.control_structures

// Kotlin, obviously, supports the usual duo of loop constructs
// i.e. the for loop and the while loop

fun foreverTrue()
{
    while (true)
    {
        println("Doing this thing ... ")
    }
}

fun anotherLoop()
{
    val list = listOf(1,2,3,4)

    for (item in list)
    {
        println(item) // ... uh, yup.
    }

    for (i in 1..10)
    {
        println("Do this 10 times...")
    }
}

// Important to note that in Kotlin there is no for (int i = 0; i < ... ) type syntax, every for loop is used with *in

// As with Java, Kotlin allows any object that implements the iterator function