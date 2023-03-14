// сделал ноду для себя, чтобы удобнее было объявлять методы
data class Node<K : Comparable<K>, V>(
    val key: K,
    // хз как хранить несколько value
    val value: V,
    var left: Node<K, V>? = null,
    var right: Node<K, V>? = null,
    var parent: Node<K, V>? = null,

    // тут можно как Никита предлагал и enum'ом воспользоваться, но пока оставлю так
    // red == true, black == false
    var color: Boolean = true
)

class RBTree<K : Comparable<K>, V> {

    // возможно еще нужен search, но он вроде как один для всех

    fun insert(node: Node<K, V>) {
        TODO()
    }

    fun delete(node: Node<K, V>) {
        TODO()
    }

    fun rotateRight(node: Node<K, V>) {
        TODO()
    }

    fun rotateLeft(node: Node<K, V>) {
        TODO()
    }
    fun balance(node: Node<K, V>) {
        TODO()
    }
}