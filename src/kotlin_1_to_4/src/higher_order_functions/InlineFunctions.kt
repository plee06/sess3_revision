package higher_order_functions

/**
 * In Kotlin functions are instances of objects, and so we can say that each function needs to be allocated
 * within the heap.
 *
 * Basically, using functions introduce overhead.
 *
 * Kotlin allows us to avoid this overhead by using what are known as inline functions notified by the
 * *inline keyword.
 *
 *
 * Basically a bit advanced, but the whole purpose is to weight the performance between allocating memory space
 * vs. more lines of code that are generated.
 *
 *
 * */