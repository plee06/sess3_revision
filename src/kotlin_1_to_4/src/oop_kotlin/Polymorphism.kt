package oop_kotlin

/*
* Polymorphism decouples "what" from "how" think about how you define what in some Super type and the how
* can be changed based on different objects that are instantiated at run time ..
*
* */

// Here in OOP Kotlin Ch3 we talk about late binding / dynamic binding ...

/*
* what exactly is late binding / dynamic binding?
*
* Well just think about some Super type let's say Coffee.
*
* And this Coffee super type has a method called "Give Coffee." where it just gives you plain old ugly Coffee.
*
* Now imagine you have DarkRoast, MediumRoast, LightRoast all extending from Coffee that inherit the same method.
*
* But you override these methods with the appropriate coffee types.
*
* At runtime when the objects are created, the method is overridden and you get offered a different behaviour
* based on the type! That in essence is the "dynamic binding" / polymorphism benefits ...
*
*
* */


// Imagine that I am working on a big drawing application that must support the rendering of variety of shapes ...
// Program must keep track of all shapes on the screen changing multiple props.
// When compiling code, i.e. before running it no way in hell we will know all about what's to come ...
// and the last thing we want is a billion lines of code in one file covering every possible case known to man
/*
* So polymorphism helps here.
* Treat all our GUI as a shape
*
* */