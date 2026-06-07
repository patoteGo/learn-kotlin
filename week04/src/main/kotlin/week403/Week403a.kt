package week403

interface BinaryTree {
    fun insert(value: Int)
    fun inorder()
}
// traditional OO-style template method/strategy pattern
open class BinaryTree2: BinaryTree {
    var processValue: (Int) -> Unit = { println(it)}


    private var root: Node? = null

    private inner class Node(
        val value: Int,
        var left: Node? = null,
        var right: Node? = null,
    ) {
        // inner classes have a implicit pointer to the containing instance
        fun inorder() {  // TEMPLATE METHOD - algorithm with replaceable steps
            left?.inorder()
            processValue(value) // REPLACEABLE STEPS = "hooks"
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
    override fun insert(value: Int) {
        root?.insert(Node(value)) ?: run { root = Node(value) }
    }
    
    override fun inorder() {
        root?.inorder()
    }


}

data class Person(var name: String, var father: Person? = null)

// NOT IDEAL -- need a whole new copy of the data structure to do different action
//class BinaryTree1a: BinaryTree2() {
//    // override the hook to change replaceable behavior in template method
//    override fun processValue(value: Int) {
//        println("X${value}X")
//    }
//}

fun main() {
    var tree2 = BinaryTree2()
    tree2.insert(42)
    tree2.insert(100)
    tree2.insert(10)
    tree2.insert(60)
    tree2.insert(4)
    tree2.insert(12)

    tree2.inorder()

//    var tree1a = BinaryTree2()
//    insertValues(tree1a)
//    tree1a.inorder()

    var tree2a = BinaryTree2()
    insertValues(tree2a)
    tree2a.inorder()
    tree2a.processValue = { println("Y${it}Y")}
    tree2a.inorder()




}

fun insertValues(binaryTree: BinaryTree) {
    binaryTree.insert(42)
    binaryTree.insert(100)
    binaryTree.insert(10)
    binaryTree.insert(60)
    binaryTree.insert(4)
    binaryTree.insert(12)

    binaryTree.inorder()
}