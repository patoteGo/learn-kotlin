package org.gonzalez.patricio.week0204

// CONCEPTS
// Template Method and Strategy Patterns
//    template method - algorithm with replaceable steps
//    strategy - passing in something to replace step with


fun printNames(vararg names: String) {
    for (name in names) { //redundant
        println( //redundant
            name // DIFFERENT
        ) //redundant
    } //redundant
}

fun printDoctors(vararg names: String) {
    for (name in names) { //redundant
        println( //redundant
            "Dr. $name" // DIFFERENT
        ) //redundant
    } //redundant
}

// GOAL: create a function that can keep all the commodality and take ANOTHER function to decide what to print

// NEED FUNCTIONAL TYPES to define parameters

fun printStuff( // this is a template method
    vararg names: String,
    getThingToPrint: (String) -> String//TODO-FUNCTION // this is Strategy
) {
    for (name in names) {
        println(
            getThingToPrint(name)
        )
    }
}

fun justPrintName(name: String) = name
fun printDoctorName(name: String) = "Dr. $name"

// in math we can compose functions:
//  f(g(10))
//  f(n) = f(g(n))
//  f(n,g) = g(n)

// HIGHER-ORDER FUNCTIONS
//   1 - pass functions as parameters, AND/OR
//   2 - return function as result


fun printStuff2(  // this is a template method
    vararg names: String,
    getThingToPrint: (String) -> String, // this is a Strategy function
    doBefore: (String) -> Unit = {},  // same as ( name -> /* do nothing /* }
    doAfter: (String) -> Unit = {}, // same as ( name -> /* do nothing /* }
) {
    for (name in names) { // redundant
        doBefore(name)
        println( // redundant
            getThingToPrint(name)
        )
        doAfter(name)
    } // redundant
}

fun main() {
    printStuff(
        "Scott", "Mary", "Steve", "Sue",
        getThingToPrint = ::justPrintName
    )

    printStuff(
          "Scott", "Mary", "Steve", "Sue",
          getThingToPrint = ::printDoctorName
    )

    // if we're only ever using the functions justPrintName and printDoctor ONCE,
    // this is good bit extra to define, we can shorten this!

    printStuff(
        "Scott", "Mary", "Steve", "Sue",
        getThingToPrint = {  name: String -> "Dr. $name" } // define a function INLINE
        // AKA "lambda" - unnamed function
    )

    // also we can do something more complex
    printStuff(
        "Scott", "Mary", "Steve", "Sue",
        getThingToPrint = {
            name: String ->
                val doctorName = "Dr. $name"
                println("DEBUG: $doctorName")
                doctorName // lambda

        } // define a function INLINE
        // AKA "lambda" - unnamed function
    )

    // IF we only have a SINGLE argument, we don't have to specify its name - can just call it "it"

    printStuff(
        "Scott", "Mary", "Steve", "Sue",
        getThingToPrint = {"$it is just a person"} //can infer type names = single arg as "it"
    )

    printStuff2(
        "Scott", "Mary", "Steve", "Sue",
        getThingToPrint =  { it },
        doBefore = { print("   ")},
        doAfter = { println()}
    )

//    printStuff2("Scott", "Mary", "Steve", "Sue") { it }


}