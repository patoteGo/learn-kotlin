package week403

// traditional OO-style template method/strategy pattern
open class BinaryTree1 {
//    var printValue: (Int) -> Unit = { println(it)}
    open fun processValue(value: Int) { // member function of BinaryTree3
        println(value)
    }

    private var root: Node? = null

    private inner class Node(
        val value: Int,
        var left: Node? = null,
        var right: Node? = null,
    ) {
        // inner classes have a implicit pointer to the containing instance
        fun inorder() {  // TEMPLATE METHOD - algorithm with replaceable steps
            left?.inorder()
            processValue(value) // REPLACEABLE STEPS = "hooks" process
            right?.inorder()

        }

        fun insert(node: Node) {
            if(node.value < value ) {
                left?.insert(node) ?: run { left = node}
            } else {
                right?.insert(Node(value)) ?: run { right = node}
            }
        }


    }
    fun insert(value: Int) {
        root?.insert(Node(value)) ?: run { root = Node(value) }
    }

    fun inorder() {
        root?.inorder()
    }


}


open class BinaryTree3 {
    //    var printValue: (Int) -> Unit = { println(it)}
    open fun processValue(value: Int) { // member function of BinaryTree3
        println(value)
    }

    private var root: Node? = null

    private inner class Node(
        val value: Int,
        var left: Node? = null,
        var right: Node? = null,
    ) {
        // inner classes have a implicit pointer to the containing instance
        fun inorder(processValue: (Int) -> Unit = { println(it)}) {  // TEMPLATE METHOD - algorithm with replaceable steps
            left?.inorder(processValue)
            processValue(value) // REPLACEABLE STEPS = "hooks" parameters
            right?.inorder(processValue)

        }

        fun insert(node: Node) {
            if(node.value < value ) {
                left?.insert(node) ?: run { left = node}
            } else {
                right?.insert(Node(value)) ?: run { right = node}
            }
        }


    }
    fun insert(value: Int) {
        root?.insert(Node(value)) ?: run { root = Node(value) }
    }

    fun inorder(processValue: (Int) -> Unit = { println(it)}) {
        root?.inorder(processValue)
    }


}


// NOT IDEAL -- need a whole new copy of the data structure to do different action
class BinaryTree1a: BinaryTree1() {
    // override the hook to change replaceable behavior in template method
    override fun processValue(value: Int) {
        println("X${value}X")
    }
}

fun main() {
    var tree1 = BinaryTree2()
    tree1.insert(42)
    tree1.insert(100)
    tree1.insert(10)
    tree1.insert(60)
    tree1.insert(4)
    tree1.insert(12)

    tree1.inorder()

//    var tree3 = BinaryTree3()
//    insertValues(tree3)
//    tree3.inorder({println("Y${it}Y")})

}

