package week0501

data class Person(
    var name: String,
    var age: Int,
)

fun main() {
    val x = listOf("a","b")
    println(x)

    val y = x + "c" // shallow copy of x - just copies the pointer to items
    println(y)

    val list1 = listOf<String>() // empty immutable List<String>
    val z = y + list1
    println(z)

    val personList1 = listOf(
        Person("Dmitry", 30),
        Person("Dmitry", 10),
    )

    println(personList1)

    val personList2 = personList1 + Person("Dmitry", 10)
    println(personList2)

    personList1[0].name = "Humunkununun"
    println(personList1)
    println(personList2)

    var personList3 = listOf(
        personList1[0],  // pointer to person at first pos in personList1
        personList1[1],  // pointer to person at second pos in personList1
        Person("Sue", 30),
    )

    println(personList3)
    personList2[1].name = "Dude"
    println(personList3)

    var personList4 = listOf(
        personList1[0].copy(),
        personList1[1].copy(),
        Person("Sue", 30),
    )
    println(personList4)
    personList2[1].name = "Casper"
    println("------")
    println(personList2)
    println(personList4)

    var personList5 = listOf(
        personList1[0].copy(age = 0),
        personList1[1].copy(),
        Person("Sue", 30),
    )

}