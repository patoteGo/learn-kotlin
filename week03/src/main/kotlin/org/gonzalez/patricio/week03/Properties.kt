package week03.org.gonzalez.patricio.week03

class Person1 {
    var name: String = "" // backing field holds value
        get () {
            return field
        }
        set(value) {
            field = value
        }
    var age: Int = 0
}

class Person2( // primary constructor - inline in the class def
    // must do it this way if you want to override get/set for properties
    name: String,
    age: Int,
) {
    var name: String = ""
    var age: Int = 0

    init {   // has access to all primary constructor parameters
        this.name = name
        this.age = age
    }
}

class Person3 ( // define properties in primary constructor
    // cannot override get/set functions
    var name: String,
    var age: Int,
)

class Person4 (
    var name: String,
    var age: Int = 0,
)

class Location1 (
    val lat: Double,
    val lon: Double,
    val street: String,
    val city: String,
    val state: String,
    val zip: String,
) {
    // secondary constructors to define subsets that must be specified together
    constructor (
        lat: Double,
        lon: Double,
    ): this(lat, lon, "", "","", "")

    constructor (
        street: String,
        city: String,
        state: String,
        zip: String,
    ): this(0.0,0.0,street, city, state, zip)
}

class Location2 private constructor (
    val lat: Double,
    val lon: Double,
    val street: String,
    val city: String,
    val state: String,
    val zip: String,
) {
    // secondary constructors to define subsets that must be specified together
    constructor (
        lat: Double,
        lon: Double,
    ): this(lat, lon, "", "","", "")

    constructor (
        street: String,
        city: String,
        state: String,
        zip: String,
    ): this(0.0,0.0,street, city, state, zip)
}


fun main() {
    val person1 = Person1()
    person1.name = "Scott" // call set
    person1.age = 57  // call set

    println(person1.name) // call get

    val person2 = Person2("Scott", 57)
    println(person2.name)
    println(person2.age)

    val person3 = Person3("Mike", 25)
    println(person3.name)
    println(person3.age)

    var person4a = Person4("Mike", 22)
    println(person4a.name)
    println(person4a.age)

    var person4b = Person4("Mike")
    println(person4b.name)
    println(person4b.age)

    val location1 = Location1(1.0, 2.0, "a", "b", "c", "d")
    val location2 = Location1(1.0, 2.0)
    val location3 = Location1("a", "b", "c", "d")

    //    val location1b = Location2(1.0, 2.0, "a", "b", "c", "d") // won't work
    val location2b = Location2(1.0, 2.0)
    val location3b = Location2("a", "b", "c", "d")
}

