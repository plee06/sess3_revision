package basics.types

// Kotlin supports the basic Boolean types ... && || == ... etc.

fun someBooleanStuff()
{
    var magicNumber: Int = 42

    if (99 == magicNumber)
    {
        println("99 is the Magic Number")
    } else if (102 < magicNumber)
    {
        println("102 is less than the Magic Number ... ")
    } else if (99 == magicNumber || 100 == magicNumber)
    {
        println("Ok, either 99 or 100 is the Magic Number")
    }
}

// Basic easy peasy!