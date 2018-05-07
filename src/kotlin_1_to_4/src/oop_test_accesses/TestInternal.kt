package oop_test_accesses


fun main(args: Array<String>)
{
    // I can't do this ... the class is declared as an internal access level only works if imported ...
    // val tryInter: InternalClassYo = InternalClassYo()

    // Also can't do this because the access level is private , you cannot import "private access"
    // val tryPriv: PrivateClassYo = PrivateClassYo()
}