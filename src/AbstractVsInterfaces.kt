

/**
 * Abstract: <abstract> keyword.
 *
 * Cannot be instantiated, can be subclassed. You are able to implement methods and abstract methods aka.
 * non-implemented functions can be marked with an abstract keyword.
 *
 * If we are to allow overriding of a non-abstract method they must be marked with <open>
 * Abstract classes must be instantiated.
 *
 *
 * Interfaces in Kotlin can:
 * have method implementations
 * can have abstract methods
 *
 * But different to abstract classes they can't have state. i.e. val / var = someState
 * But, you can have properties that something must declare. Such as val prop: Int
 *
 * */



abstract class Cook {


    // non-abstract method that is non-overridable
    fun mustHavePepper() {
        println("Pepper is life.")
    }

    // abstract method that must be implemented.
    abstract fun implementMeCook()
}


class Paul(val type: String) : Cook() {

    override fun implementMeCook() {
        println("I implemented you!")
    }
}
