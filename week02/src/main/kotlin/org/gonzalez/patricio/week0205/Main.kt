package org.gonzalez.patricio.week0205


fun doStuff(
    x: Int,
    y: Int,
    doSomething: (x: Int, y: Int) -> Unit,
) {
    println("---------")
    println("x=$x , y=$y")
    doSomething(x,y)
    println("---------")
}
var z = 0
// Kotlin has closure, Java has not


fun main() {

    // what is happening here with z?
    doStuff(10,20) {
        x,y -> println(x + y + z) // lambda has to know about z
        z = 100
        // In Java - z would treated as "effectively final"
        //    -- can't modify after anon inner class set up that uses it
        //    -- makes a copy of the value z, and won't let you modify after
    }
}
