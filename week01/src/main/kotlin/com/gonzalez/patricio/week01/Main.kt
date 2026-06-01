package org.gonzalez.patricio.com.gonzalez.patricio.week01

 var redundantProperty: Int = 10
     get() {   // default getter
         return field
     }
     set(value) {   // default setter
         field = value
     }

 val simpleGetterProperty1: Int // no backing field, so 10 does not meke sense
     get() {   // IMMUTABLE
         return 10
     }

 // ---------------------

 val simpleGetterProperty2: Int // no backing field, so 10 does not meke sense
     get() {   // READ ONLY, NOT IMMUTABLE,  might not be idempotent
         return getValue()
     }

 fun getValue(): Int {
     // this value could chante
     return behindTheScenes
 }

 var behindTheScenes: Int = 10

 // difference between read-only and immutable
 // ---------------------


 var nameToLog: String = ""
     get() {
         println("reading nameToLog")
         return field
     }
     set(value) {
         println("writing nameToLog")
         field = value
     }


 var nameInDatabase: String
     get() {
         return "value from database" // pretend there was a database call here
     }
     set(value) {
         // store in the database
     }


 open class Mammal
 class Cat: Mammal()
 class Dog: Mammal()

 fun main() {
     println(nameToLog)

     nameToLog = "Scott"
     println(nameToLog)



     var x: Int = 42 // property declaration that we can change it, of type Integer
     x = 10
     println("Hello world! $x")

     val y: Int = 10 // property declaration -- CANNOT WRITE
//     y = 100 cannot do THIS!!!!
     println("Hello world inmuntable! $y")


     var z = 300 // Katlin can infer that z is a Int based on the value!

     var mammal1 = Cat() // type of mammal1 is Cat
     var mammal2: Mammal = Cat()  // type of mammal2 is Mammal

//     mammal1 = Dog() <- fail
//     mammal2 = Cat() <- works
 }

