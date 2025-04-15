package data_structures

data class FenwickTree(val size: Int) {
    private val tree = IntArray(size + 1)

    fun update(index: Int, delta: Int) {
        var index = index + 1
        while (index < tree.size) {
            tree[index] += delta
            index += index and -index
        }
    }

    fun query(index: Int): Int {
        var index = index + 1
        var res = 0
        while (index > 0) {
            res += tree[index]
            index -= index and -index
        }
        return res
    }
}