package week402

// Nullability
// THIS
// IS
// AWESOME

data class Person(var name: String, var father: Person? = null)

class Nullability {
    var person1: Person = Person("")
    var person2: Person? = null // ? means nullable
}

fun main() {
    val nullability = Nullability()
    // nullability.person1 = null // won't work
    nullability.person2 = null

    println(nullability.person1.name)
    println(nullability.person2?.name)
        // person2 might not be valid, null-safe accessor
        // if left side is null, STOP and return null
        // otherwise, keep going

    println(nullability.person2?.father?.name)
    // similar to:
    //    if (nullability.person2 != null) {
    //       if(nullability.person2!!.father != null) {
    //           println(nullability.person2!!.father.name)
    //       }
    //    }

    // but really is similar to:
    val person2 = nullability.person2 // grab a snapshot
    if (person2 != null) {
        val father = person2.father // snapthos
        if(father != null) {
           println(father.name)
       }
    }

    // ?: is the "Elvis" operator
    //      if left hand side is NOT null, use that value
    //      otherwise, use the right side
    println(nullability.person2?.father?.name ?: "no father name avalaible")

    val person3 = getSomeValueFromSomewhere() ?: throw IllegalStateException("cannot get the value")
    println(person3.name)
}

fun getSomeValueFromSomewhere(): Person? { return null }

class BinaryTree3 {

    fun printValue(value: Int) { // member function of BinaryTree3
        println(value)
    }

    private var root: Node? = null

    private inner class Node(
        val value: Int,
        var left: Node? = null,
        var right: Node? = null,
    ) {
        // inner classes have a implicit pointer to the containing instance
        fun inorder() {
            left?.inorder()
            printValue(value)
            right?.inorder()

        }
//        fun insert(node: Node) {
//            if(node.value < value ) {
//                if (left != null) {
//                    left.insert(node)
//                } else {
//                    left = node
//                }
//            } else {
//                if(right != null) {
//                    right.insert(node)
//                } else  {
//                    right = node
//                }
//            }
//        }

        fun insert(node: Node) {
            if(node.value < value ) {
                left?.insert(node) ?: run { left = node}
            } else {
                right?.insert(Node(value)) ?: run { right = node}
            }
        }


    }

    fun inorder() {
        root?.inorder()
    }

    fun insert(value: Int) {
        root?.insert(Node(value)) ?: { root = Node(value) }
    }
//    fun insert(value: Int) {
//        if(root == null) {
//            root = Node(value)
//        } else {
//            root.insert(Node(value))
//        }
//    }
}
