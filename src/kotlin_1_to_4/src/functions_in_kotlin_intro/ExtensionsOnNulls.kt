package functions_in_kotlin_intro

/**
 * In Kotlin you can also create Extension functions for possible null values as well, consider some equals
 * function to check if both values are null or not
 *
 * */


fun Any?.safeEqualsForNull(other: Any?): Boolean = if (this == null && other == null) true else false

// consider this function below from book that "safe checks" i.e. if null compare those null values
// otherwise just run the regular equals on some instance which can be any subtype of Any? -> possible null

fun Any?.safeEquals(other: Any?): Boolean {
    if (this == null && other == null) return true
    if (this == null) return false
    return this.equals(other)
}