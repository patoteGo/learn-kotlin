package org.gonzalez.patricio.com.gonzalez.patricio.week11


const val name3 = "Scott"

fun main() {
    val name1: String = "Scott"
    var name2: String = "Scott"

    val first = "Hello"
    val last = "World"
    val helloWorld = first + ", " + last // basic string concatenation

    print(helloWorld)

    val helloWorldUsingTemplate1 = "$first, $last"
    val helloWorldUsingTemplate2 = "${first.substring(0,2)}, ${last.substring(0,2)}"

    val typeOfThings = "animal"
    val numberOfThings = 10
    val onlyOne = 1

    println(helloWorldUsingTemplate1)
    println(helloWorldUsingTemplate2)

    val message1 = "There are $numberOfThings ${typeOfThings}s"
    val message2 = "There is $onlyOne $typeOfThings"

    println(message1)
    println(message2)

    // RAW String
    val message3 = """
        Copyright 2024 Scott Stanchfield
        All Right Reserved
        
        Some other license text here
    """.trimIndent()

    val message4 = """
        |Copyright 2024 Scott Stanchfield
        |         All Right Reserved
        |
        |Some other license text here
    """.trimMargin()

    print(message4)
}