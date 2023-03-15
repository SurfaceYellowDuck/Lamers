interface TreeInterface {
    fun <K: Comparable<K>, V> insert(key: K, value: V)
    fun <K: Comparable<K>, V> remove(key: K, value: V)
    fun <K: Comparable<K>, V> find(key: K): V
    fun clear()
}

