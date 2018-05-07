package higher_order_functions

/**
 * What is the Either Type in Kotlin?
 *
 * *Either type is a type that is used to represent a value that can have two possible types
 *
 * A lot of FP languages will support Either, Kotlin doesn't have a native support for it but we can
 * create one.
 *
 *
 * The Either type is a common idiom to manage errors!
 *
 * It is usually a class which is represented as Either<L, R> which represents two possibilities
 * Left<L> or Right<R> but can't be both. Traditionally the Left is an error, the Right is a correct
 * return.
 *
 *
 * */

// Example of the Either class in Kotlin

// * remember sealed = abstract class that restricts hierarchy, look into it in documentation

//sealed class Either<out L, out R> // and the *out keyword restricts these types to be JUST return types
//
//class Left<out L>(value: L) : Either<L, Nothing>()
//class Right<out R>(value: R) : Either<Nothing, R>()

// and so these can be used in some kind of function that either will return one of two types.

// if its Right continue and do something, otherwise if the value returned is Left, then do something else