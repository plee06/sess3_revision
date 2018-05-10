package adt.sr_sumType_pm.sr_productType_poly

/**
 * Structural Recursion Example with Product Type.
 *
 * "A has-a B and C"
 *
 *
 * */


// Product Type "A has-a B and C"
class B
class C

// POLYMORPHISM PATTERN STRUCTURAL RECURSION THROUGH THE PRODUCT TYPE A(B,C)
data class A(val b: B, val c: C) {

    fun decomposeProduct(whatType: A): Pair<B, C> {
        println("I'm returning a ${whatType.b} and ${whatType.c}")
        return whatType.b to whatType.c
    }


}