package week405

class PersonWithouthConstructorParams {
    var name: String = ""
    var age: Int = 0
}

open class Person (
    var name: String = "",
    var age: Int = 0
)


class Stuff {
    var name: String? = null

//    val person = PersonWithouthConstructorParams()
    // won't work without init in the outer scope
    //    person.name = "Scott"
    //    person.age = 55

    // This works
//    init {
//        person.name = "Scott"
//        person.age = 55
//    }

    // but with apply also
    val person = PersonWithouthConstructorParams().apply {
        name = "Scott"
        age = 55
    }

    fun doStuff() {
        var length = name?.length ?: 0

        val nameSnapshot = name
        if(nameSnapshot != null) {
            val x = nameSnapshot + "aaaa"
            val y = nameSnapshot.length
            val z = "$x$y"
            println(z)
        }

        // let is a SCOPING function
        //    captures the current value of receiver as parameter to the lambda
        //    returns las expression in the lambda
        //    most often used for "if not null" capturing the value being tested

        var zLength = name?.let { name ->
            val x = name + "aaaa"
            val y = name.length
            val z = "$x$y"
            z
        }

        //-------------------------------

        // apply is a SCOPING function
        //    capture receiver as "this"
        //    return receiver
        //    mostly used for initialization
        val person = PersonWithouthConstructorParams()
        person.name = "Scott"
        person.age = 55

        //-------------------------------

        // run is a SCOPING function
        //    captures the current value of receiver as "this" in the lambda
        //    returns last expression in the lambda
        //    most often used for just do some stuff in an expression context

        val result = name?.run {
            if(first() == 'a') {
                42
            } else {
                length
            }
        } ?: 0

        //-------------------------------
        // also is a SCOPING function
        //    captures the current value of receiver as "it" in the lambda
        //    returns receiver for the lambda
        //    not used often; sometimes used to do "extra" things in the middle of the chain

        val thing = Person("Thing").also{
            // add data structure or database
            // THEN return this
        }

        //-------------------------------
        // with DOES NOT take receiver - passes value as "this" to labda
        with(thing) {
            if( name != "Thing") {

            } else {

            }
            name = "Hondo"
        }

    }
}