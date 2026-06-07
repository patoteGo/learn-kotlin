package week406

// more expressions

data class Person(val name: String)


class Stuff {
    private var person: Person? = Person("")

    fun foo() {
        if( person != null ) {
            println(person!!.name)  // trusted but verified at runtime
            // ALMOST NEVER USE THIS!!! Use ?. instead
        }

        // This is better alternative to !!, you can add a error message
        println(requireNotNull(person).name)
        println(requireNotNull(person, {"oops - person not set"}).name)
    }
}



