class BinaryTree<K: Comparable<K>, V>: TreeInterface {
    var rootNode: BinaryNode<K, V>? = null
    override fun insert() {
        //add element
        //make element as a root, if root is null
        //if root is not null it adds element to left or right branch
        //if left or right is not null - it check it, and add if right or left is null
        TODO("Not yet implemented")
    }

    override fun remove() {
        //remove node by key
        TODO("Not yet implemented")
    }

    override fun find() {
        //this method gives element by key
        TODO("Not yet implemented")
    }

    override fun clear() {
        //clear tree
        TODO("Not yet implemented")
    }

    fun symmetricalTreeTraversal(){

    }
}

class BinaryNode<K : Comparable<K>, V>(
    override val key: K,
    override val value: V,
) : Node<K, V>{
    override var left: Node<K, V>? = null
    override var right: Node<K, V>? = null
}

fun main(){
    val test_tree = BinaryTree<Int, String>()
    test_tree.rootNode = BinaryNode(123, "erefe")
    val test_1 = mutableListOf<Int>(12341, 324)
    test_tree.rootNode!!.left = BinaryNode(123, "world_0")
    test_tree.rootNode!!.right = BinaryNode(123, "world_1")
}
