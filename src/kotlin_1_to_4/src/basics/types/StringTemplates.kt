package basics.types

// Hooray for String templates! Kotlin offers up String templates.


/*
* If you're asking the question, what exactly are String templates?
*
* The answer is: String templates are a simple and effective way of embedding values, variables and expressions
* in Strings!
*
* */

// Consider ...

val name: String = "Paul"

var someSentence: String = "My name is " + name // Old way of doing things

// New with String templating!

var otherSentence: String = "My name is $name" // So much easier ...

// Arbitrary expressions can also be used with ${someobject.property}

