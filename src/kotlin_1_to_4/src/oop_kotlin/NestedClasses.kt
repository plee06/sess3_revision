package oop_kotlin

// Kotlin also supports nested classes just like in Java

// What is a nested class? Just creating a class within another class!

private class OuterClassName {
    // To allow for this inner block to be constructed outside in the module we have to label it with "internal"
    internal class InnerClassName {

    }
}


