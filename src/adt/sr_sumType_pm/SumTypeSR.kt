package adt.sr_sumType_pm



// Sum Type Structural Recursion


// "A is-a B or C"

/**
 *
 * Sum Type Polymorphic Structural Recursion = just fucking override the methods in subtypes
 *
 *
 * */



sealed class A1 {



    open fun someFunction() {
        println("some functioanlity .... ")
    }
}



data class B1(val name: String) : A1() {

    override fun someFunction() {
        println("I AM POLYMORPHING STRUCTURAL RECURSIONING THIS THING ")
    }
}
data class C1(val name: String) : A1() {


    override fun someFunction() {
        println("ALSO POLYMORPHING STRUCTURAL RECURSIONING THIS THING .... ")
    }
}





fun main(args: Array<String>) {
    val a: A1 = B1("some name ")


    // call decomposition
    a.someFunction() // should print i am polymorphing .....
}