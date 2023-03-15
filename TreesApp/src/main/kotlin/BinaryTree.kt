class BinarySearchTree<K: Comparable<K>, V>: TreeInterface<K, V> {
    var rootNode: BinaryNode<K, V>? = null
    override fun insert(key: K, value: V) {
        //add element
        //make element as a root, if root is null
        //if root is not null it adds element to left or right branch
        //if left or right is not null - it checks it, and adds it if right or left is null
        TODO("Not yet implemented")
    }

    override fun remove(key: K, value: V) {
        //remove node by key
        TODO("Not yet implemented")
    }

    override fun find(key: K): V {
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
) : NodeInterface<K, V>{
    override var left: NodeInterface<K, V>? = null
    override var right: NodeInterface<K, V>? = null
}

fun main(){
    val test_tree = BinarySearchTree<Int, String>()
    test_tree.rootNode = BinaryNode(123, "erefe")
    val test_1 = mutableListOf<Int>(12341, 324)
    test_tree.rootNode!!.left = BinaryNode(123, "world_0")
    test_tree.rootNode!!.right = BinaryNode(123, "world_1")
}
