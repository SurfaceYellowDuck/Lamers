import bst.AVLTree

fun main() {
    val avl = AVLTree<Int, Int>()
    (1..25).forEach { avl.insert(it, it) }
    avl.printTree()
}
