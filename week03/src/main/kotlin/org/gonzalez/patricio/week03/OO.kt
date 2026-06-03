package week03.org.gonzalez.patricio.week03

import kotlin.math.min

// three tenets of OO programming

// Encapsulation
// inheritance
// Polymorphism

// Encapsulation
//      - hiding data
//      - protecting data

private var amountOfPb = 32 // no control - could be a mistake anywhere in this file

fun removePb(amount: Int): Int {
    var removed = min(amount, amountOfPb)
    // problem - caller's responsibility
    amountOfPb -= removed
    return removed
}

class PbJar{
//    private var amountOfPb = 32 // control!!

    var amountOfPb = 32
        // default kotlin is PUBLIC
        private set
        // get is public
    fun removePb(amount: Int): Int {
        var removed = min(amount, amountOfPb)
        // problem - caller's responsibility
        amountOfPb -= removed
        return removed
    }

}

fun main() {
    var jar = PbJar() // create a instance of PbJar
    println(jar.amountOfPb)
    println(jar.removePb(10))
    println(jar.amountOfPb)
    println(jar.removePb(10))
    println(jar.amountOfPb)
    println(jar.removePb(10))
    println(jar.amountOfPb)
    println(jar.removePb(10))
    println(jar.amountOfPb)
    println(jar.removePb(10))
    println(jar.amountOfPb)

}