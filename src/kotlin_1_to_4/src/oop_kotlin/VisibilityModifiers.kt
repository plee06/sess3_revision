package oop_kotlin

// The four visibility modifiers for methods, members etc. are public, private, internal, protected

/*
* If a parent class declares itself as open, derived classes can modify visibility level of the members
*
* */

open class Container {
    protected val fieldA: String = "Some Value"
}
class DerivedContainer : Container() {
    // This now allows us to write out the fieldA value ... when it wasn't open, the protected would've
    // just limited it to itself and the subclasses and not be able to run in main
    // public override val fieldA: String = "Different value"
    fun someFun(): Unit {
        println(this.fieldA)
    }
}


fun main(args: Array<String>) {
    val derived: DerivedContainer = DerivedContainer()

    // Possible to do when override to public visiblity modifier is done, otherwise no
    // println(derived.fieldA)


}