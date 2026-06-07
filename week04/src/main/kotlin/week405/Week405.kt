package week404

//fun main() {
//    val list = listOf(1,2,3,4,5)
//    list
//        .map { "X${it}X"}
//        .forEach {
//        println(it)
//    }
//}

fun main() {
    // in Kotlin's list class, we have the same type of template method w strategy parameter all over the place
    val list = listOf(1,2,3,4,5)
    list
        .forEach {
            println(it)
        }
}

