package oop_kotlin

// Of course, inheritance is fundamental to OOP
// Allows us to create new classes that reuse, extend / modify behaviour of preexisting classes
// Preexisting class = super class
// Brand new classes "inheriting" = derived classes

// Inheritance Example Kotlin

// Enum class of CardType, allows for easy enumeration among the types
enum class CardType {
    VISA, MASTERCARD, AMEX
}

// "open" class
// The "open" class means that this class is open to inheritance otherwise, it's "final" as in it can't be inherited
open class Payment(val amount: Int)

// Our class of CardPayment which extends Payment
// The definition here of CardPayment is extending or "inheriting" the class of Payment through the :
class CardPayment(amount: Int, val number: String, val expiryDate: Int, val type: CardType): Payment(amount)


/**
 * The CardPayment class above defines a Primary Constructor .
 *
 *
 * */

// Extending the Class hierarchy here
class ChequePayment : Payment { // Class of ChequePayment which also extends Payment like Card...
    constructor(amount: Int, name: String, bankId: String) : super(amount) // call of super which is required in Kotlin
    {
        this.name = name
        this.bankId = bankId
    }
    var name: String
        get() = this.name
    var bankId: String
        get() = this.bankId
}

// In both cases of the classes they call super, for CardPayment it's done in Payment(amount) and Cheque it's done by
// super(amount)


// In Kotlin like Java, we cannot have "multiple" inheritance, we must rely on abstractions instead like interfaces
