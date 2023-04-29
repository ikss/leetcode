package data_structures

class UnionFind(n: Int) {
    private val root = IntArray(n)
    private val rank = IntArray(n)

    init {
        for (i in 0 until n) {
            this.root[i] = i
        }
    }

    fun find(x: Int): Int {
        if (root[x] != x) {
            root[x] = find(root[x])
        }
        return root[x]
    }

    fun union(x: Int, y: Int) {
        var rootX = find(x)
        var rootY = find(y)
        if (rootX == rootY) return
        if (rank[rootX] > rank[rootY]) {
            val tmp = rootX
            rootX = rootY
            rootY = tmp
        }
        // Modify the root of the smaller group as the root of the
        // larger group, also increment the size of the larger group.
        root[rootX] = rootY
        rank[rootY] += rank[rootX]
    }

    fun areConnected(node1: Int, node2: Int): Boolean {
        return find(node1) == find(node2)
    }
}