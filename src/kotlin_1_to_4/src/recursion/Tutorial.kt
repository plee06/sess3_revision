package kotlin_1_to_4.src.recursion



/**
 * Tutorial.
 *
 * Step 1: Write "if" because there must be at least two cases: recursive and base case (i.e. not recursive)
 * Step 2: Handle the simplest case -> meaning no recursion, base case. Work on the base case!
 * Step 3: Write the recursive call(s) -> Handle simplest case i.e. factorial is n - 1 needs to be called repeatedly
 *
 * Ask ourselves how does the simpler recursive call helps us?
 *
 *
 * */

/*
* Write Factorial recursively
*
* */

fun factorial(n: Int): Int {
    // Precondition is that n >= 0
    // Factorial is 4! 4 * 3 * 2 * 1 ...
    if (n == 0 || n == 1) return 1

    return n * factorial(n - 1)
    // 4 * factorial(3) * factorial(2) * factorial(1)
    // at 1 its base case so now we have 4 * factorial(3) * factorial(2) * 1
    // factorial(2) is 2 * 1 and so now 2 can be returned
    // 4 * factorial(3) * 2 * 1  where factorial(3) is 3 * factorial(2) which can be returned because facotiral(2)
    // was determined to be 2 so now 4 * 3 * 2 = 24!


    // just remember recursion just goes down until it hits a base case and then comes back up while
    // calculating necessary steps.
}


// Test
fun main(args: Array<String>) {
    println(factorial(4))
}