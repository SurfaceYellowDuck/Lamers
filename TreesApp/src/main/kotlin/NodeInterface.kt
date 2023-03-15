interface NodeInterface<K : Comparable<K>, V>{
    val key: K
    val value: V
    var left: NodeInterface<K, V>?
    var right: NodeInterface<K, V>?
}
