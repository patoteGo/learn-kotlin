package org.gonzalez.patricio.week0202

fun main() {
    val x = 10
    val y = 20
    var z = x + y

    z = x + 10
    z += 10 // same as z = z + 10, *, /, -, +, %

    val list = listOf("A", "B", "C")

    for(item in list) {
        println(item)
    }

    for(n in list.indices) {
        println(list[n])
    }

    println("---------------")
    for ( n in 0..10) {
        println(n)
    }


    for ( n in 0 until 10) {
        println(n)
    }

    println("---------------")
    for ( n in 0..10 step 2) {
        println(n)
    }


    for ( n in 0 until 10 step 2) {
        println(n)
    }

    println("---------------")
    for ( n in 10 downTo 0 step 2) {
        println(n)
    }

    println("---------------")
    var n = 0
    while (n < 10) {
        println(n)
        n++
    }
    println("---------------")
    n = 0
    do {
        println(n)
        n++
    } while (n < 10)

    println("---------------")
    // to print to 10
    n = -1
    do {
        n++
        println(n)
    } while (n < 10)

    println("---------------")
    n = 0
    while(true){
        if( n == 10) {
            break
        }
        println(n)
        n++
    }

    println("---------------")
    n = 0
    while(true){
        if( n == 3) {
            n++
            continue
        }
        if( n == 10) {
            break
        }
        println(n)
        n++
    }

    rows@ for(i in 0 until 10) {
        cols@ for ( j in 0 until 10) {
            if(i == j) {
                continue
            }
            if(i == 5 && j == 6) {
//                continue@rows
                break@cols
            }
            println("$i, $j")
        }
    }



}