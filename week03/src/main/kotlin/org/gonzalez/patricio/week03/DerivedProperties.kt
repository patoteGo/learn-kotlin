package week03.org.gonzalez.patricio.week03

class PersonDerived1(
    val firstName: String,
    val lastName: String,
    var age: Int,
) {
    fun getFullName() = "$firstName $lastName"

}

class PersonDerived2(
    val firstName: String,
    val lastName: String,
    var age: Int,
) {
    val fullName: String
        get() = "$firstName $lastName" // no backing field
            // string recreated every time

}

class PersonDerived3(
    var firstName: String,
    var lastName: String,
    var age: Int,
) {
    val fullName = "$firstName $lastName" // backing field
}

class PersonDerived4(
    val firstName: String,
    val lastName: String,
    var age: Int,
) {
    val fullName = "$firstName $lastName" // backing field - computed once. PROBLEM
        // if first or last name change, full name doesnt change
}

class PersonDerived5(
    val firstName: String,
    val lastName: String,
    var age: Int,
) {
    val fullName: String
        get() = "$firstName $lastName" // no backing field
    // string recreated every time - good b/c first or last name can change
}

fun main() {
    val personDerived1 = PersonDerived1("John", "Doe", 18)
    println(personDerived1.getFullName())
}