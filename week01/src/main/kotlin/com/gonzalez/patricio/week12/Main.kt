package org.gonzalez.patricio.com.gonzalez.patricio.week12

fun main() {
    val x = 10
    val y = 20
    println(x + y)

    val done = false
    val isPerson = true
    val result1a = done && isPerson // SHORT-CIRCUITING AND
    val result1b = done and isPerson // NON-SHORT-CIRCUITING AND
        // might be useful if side effect is necessary
    val result2a = done || isPerson // SHORT CIRCUITING OR
    val result2b = done or isPerson // NON-SHORT-CIRCUITING OR

    val xAndYAreEqual: Boolean = ( x == y)
    val xAndYAreNotEqual: Boolean = ( x != y)

    var n = 10
    val m1 = n++ // DO NOT DO THIS
        // m1 = 10, n = 11
    val m2 = ++n // DO NOT DO THIS
        // m2 = 12, n = 12

    n++  // USE LIKE A STATEMENT
    ++n  // USE LIKE A STATEMENT

    val m3 = n // m2 = 14
    n += 2

}

