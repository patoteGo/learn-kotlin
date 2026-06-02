package org.gonzalez.patricio.week0201

val x = 10
val y = 20

fun main() {

    val result = if(x < 10) {
        "Low"
    } else if ( y < 10) {
        "Medium"
    } else {
        "whatevs"
    }

    // THIS IS THE SAME AS THE PREVIOUS CODE, BUT WITH MORE REDUNDANCY
    var resultA = ""
    if(x < 10) {
        resultA = "Low"
    } else if (y < 10) {
        resultA = "Medium"
    } else {
        resultA = "whatevs"
    }

    if(x < 10) {
        "Low"
    } else if ( y < 10) {
        "Medium"
    } else {
        "whatevs"
    }

    // expression
    var result2 = when {
        x < 10 -> "Low"
        y < 20 -> "Medium"
        else -> "whatevs"
    }

    // statement
    when {
        x < 10 -> println("Low")
        y < 10 -> println("Medium")
    }

    val result3 = when (x + y) {
        20 -> {
           println("value was 20")
        "foo"
        }
        25 -> "fee"
        30 -> "fie"
        else -> "bye" // what if we want print the value?
    }

    val result4 = when (val z = x + y) {
        20 -> "foo"
        25 -> "fee"
        30 -> "fie $z"
        else -> "bye: value is $z"
    }

    println(result4)

}

