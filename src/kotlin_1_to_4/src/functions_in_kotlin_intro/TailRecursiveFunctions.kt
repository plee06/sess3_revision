package functions_in_kotlin_intro

/**
 * this is a big one! Tail recursion ...
 *
 *
 * */

// Recursion what is it? It's just a function that invokes itself duh!

// best recursion example? Let's try fibonacci.


// this recursive version is succint. But not the best. Why? It's recursive meaning it takes up a whole
// bunch of memory space on the stack when we run it with very high inputs. Runtime must keep existing
// stack to remember the previous value to then add to it
// this is not tail recursive because the very last line that is recursive must do an operation after
// it returns out which means it must remember the right hand side. "remembering" means staying on the stack.
fun fib(k: Int): Int =
    when (k) {
        0,1 -> 1 // when k is 0 or 1 return 1 otherwise ...
        else -> fib(k - 1) + fib(k - 2)  // sum of the previous two numbers of this number ...
        /**
         * HOW THIS FIBONACCI RUNS BY COMPILER -->
         *
         * invoke fib with k:
         * if k == 0 then return 1
         * if k == 1 then return 1
         * let temp1 = invoke fib with k-1
         * let temp2 = invoke fib with k-2
         * return temp1 + temp 2
         *
         * as we can see, after recursive calls have completed we then add the two values to return.
         * the compiler must keep stack frame alive i.e. remember (temp1 and temp2) to then return
         * the overall value.
         *
         * for small values its okay. but imagine larger values, if each function has to remember a variable
         * to then add it, that's adding to the stack frame on every call!
         * every call must add a call to the stack frame. fact(3) -> 3 frames
         * fact(100) -> 100 frames ... etc. Each recursive call adds a frame to the stack!!!
         *
         *
         * */

        /**
         * here our base cases are 0 and 1, meaning when it hits 0 or 1 the value of 1 is returned.
         *
         * when we call our function on lets say fib(3) it'll run like this:
         *
         * fib(3) k is not 0,1 so run fib(3 - 1) + fib(3 - 2) which is fib(2) + fib(1)
         *
         * so now we have fib(2) + fib(1) and because we run functions right to left we first start with fib(1)
         *
         * fib(1) starst and because its a base case we return 1.
         *
         * so we have the value of 1 now so its fib(2) + 1 and we have to finish running fib(2) for fib(3) to finish
         * and so fib(2) runs and because 2 isn't a base case it runs fib(1) + fib(0) <-- both are base cases which
         * returns 1 + 1 = 2
         *
         * so fib(2) is done running and returns its value of 2, which gets added to our value of 1 which is the
         * right hand side so 2 + 1 -> 3
         *
         * and so 3 is then returned to fib(3) which at this point is done and popped off the stack!
         *
         * so fib of (3) in the way we wrote this function is 3!
         *
         * in this case the sequence is like this -> 1, 1, 2, 3 and so the fibonacci of 3 is 3.
         *
         * please note that the number we pass in as a parameter has nothing to do with the "index" of the sequence
         * instead we are asking the fibonacci function to calculate what the 3rd sum is i.e. run fibonacci twice
         * and give me the answer of the sum of fibonacci 3. here it is 1 -> (1 + 1)
         *
         * fib(3)
         * fib(2) + fib(1)
         *             --> 1 --> 1
         * fib(1) + fib(0) --> 1 + 1 -- > 2
         *
         * with this function here both 0,1 lead to 1. we could have written it 0 -> 0, 1 -> 1
         * * do this later
         *
         * fib(5) = 1 1 2 3 5 8  // (1) -> (1+1) -> (1+2) -> (2+3) -> (3+5) = 8
         * */

}

// if we instead make a recursive function which is the last operation in a particular function
/*
* that means that the last operation is just returning a value. If it's just returning a value
* there is nothing to "remember", the system doesn't need the previous stack frame to do anything additional.
*
* This technique of not having to "remember" a value for recursive functions is known as TAIL RECURSION!
*
* Allows us to write recursive functions that would otherwise result in stack overflow errors.
*
*
* in Kotlin we tell Kotlin about tail recursion through @tailrec annotation
*
* */

// consider factorial: Recursive
fun fact(k: Int): Int {
    if (k == 0) return 1
    else return k * fact(k - 1) // recursive version, not tail recursive because here we must remember
    // fact(k - 1) to operate with it with k. k * ... this value of fact(k-1). i.e. the return
    // value cannot be calculated until fact(k-1) gives me a value which it can't give me a value
    // until it runs recursively till the base case which is why larger inputs on recursive functions
    // means high possibility of stack overflow ...
}
// rewriting the function for tail recursion ...
// * the whole point of tail recursion is to NOT add frames to the stack by IMMEDIATELY returning a value
// out and COMPUTING AS WE GO! SO tail recursion is just a specialized type of recursion where there is a gurantee
// that nothing is left to compute and so it just returns the value ...

/**
 * the tail recursive version passes around the computed data as an extra parameter
 *
 * */
fun fact2(k: Int): Int {
    // inner helper function
    // here n is the accumulator, i.e. the final value we want. As this function goes, it will continue
    // to compute the factorial for every iteration i.e. m...decremented.
    tailrec fun factTail(m: Int, n: Int): Int {
        // m == 0 is the base case and returns the accumulated value of n.
        if (m == 0) return n
        // this is what does the magic, here we compute the "iterator" m - 1, and then "compute" the value
        // we want which is current iterator multipled by n which is 1. this results in the factorial.
        // i.e. consider
        /*
        * factTail(3-1,3*1) = just computes data and passes it back in as the parameter and so no "remembering" of
        * values involved.
        * factTail(2,3*1) <-- starting of that factorial multiplication...
        * factTail(1,2*3*1) <-- again computing, just passed the parameters back into the function
        * factTail(0,2*3*1) <-- base case hit and so it just returns the value of n which is (2*3*1) = 6!
        *
        * then this value of 6 is returned by fact(2).
        *
        * */
        else return factTail(m - 1, m * n)
    }
    return factTail(k, 1) // this is tail recursive, doesn't need to remember anything, it just returns a value
}

fun main(args: Array<String>) {
    println(fact(3)) // calls fact 3 times
    println(fact2(3)) // calls fact2() once ... calls the tailrecursive function once
    var f = fact2(3)
}


