package week03.org.gonzalez.patricio.week03

import kotlin.math.min

// three tenets of OO programming

// Encapsulation
// inheritance
//      - creating more specific classes based on existing classes, possibly adding properties/functions
//      - liskov substitutability
//        it means wherever you are using the subclass can you use the existing class
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


// ENCAPSULATION
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

// inheritance
// kingdom/philim/class/order/family/genus/species

// Kotlin design flaw, everything is final/closed by default

open class Animal {
    var name: String = "Batman"
    fun run() {
        println("running")
    }

    // you have to add open if you want to override un sub classes
    open fun bloodTempRange(): IntRange {
        return 0 .. 110
    }
}

//open class Mammal: Animal() // the classes by default are closed
abstract class Mammal: Animal() {

    // without override you cannot change behaviour of the superclass
    override fun bloodTempRange(): IntRange { // polymorphism - override superclass function/properties
        return 80 .. 110
    }

    // override vs overload
    //    overload - different signatures with same name - only parameters
    //          - reducing namespace/surface area of the type
    //    override - same name and parameters
    //          - changing behavior
}
  // abstract - cannot create it

class Cat: Mammal()

class Dog: Mammal()



fun main() {
//    var jar = PbJar() // create a instance of PbJar
//    println(jar.amountOfPb)
//    println(jar.removePb(10))
//    println(jar.amountOfPb)
//    println(jar.removePb(10))
//    println(jar.amountOfPb)
//    println(jar.removePb(10))
//    println(jar.amountOfPb)
//    println(jar.removePb(10))
//    println(jar.amountOfPb)
//    println(jar.removePb(10))
//    println(jar.amountOfPb)

    var animal: Animal = Cat()
    println(animal.name)
    val cat: Cat = Cat()
    println(cat.name)
    goAnimal(Cat())
    goAnimal(Dog())
//    goAnimal(Mammal()) // cannot instanceate or create Mammal
}

fun goAnimal(animal: Animal) {
    println(animal.name)
    animal.run()
}