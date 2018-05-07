package functions_in_kotlin_intro

/**
 * Kotlin comes with require / assert / check
 *
 * adds a limited amount of formal specifications to our program
 *
 * i.e. an assertion that should always hold true / false at the location when assertion is executed
 *
 * require -> throws exception and used to ensure arguments match input conditions
 * assert -> ensures internal state is consistent, assert some result
 * check -> throws IllegalStateException also used like assert
 *
 *  all very similar, key differences are the keywords
 *
 *  assert can be disabled at runtime. check and require cannot. makes sense, check and require will let us know
 *  at runtime if there are problems. assert is better done at compile time
 *
 * */


