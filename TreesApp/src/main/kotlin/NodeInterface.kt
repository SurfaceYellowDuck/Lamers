interface Node<K : Comparable<K>, V>{
    val key: K
    val value: V
    var left: Node<K, V>?
    var right: Node<K, V>?
}