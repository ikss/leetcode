package data_structures

class UnionFind(n: Int) {
    val root = IntArray(n + 1) { it }
    val rank = IntArray(n + 1) { 1 }
    var maxRank = 0
    var components = n

    fun find(x: Int): Int {
        if (root[x] != x) {
            root[x] = find(root[x])
        }
        return root[x]
    }

    fun union(x: Int, y: Int): Int {
        var rootX = find(x)
        var rootY = find(y)
        if (rootX == rootY) return 0
        if (rank[rootX] > rank[rootY]) {
            val tmp = rootX
            rootX = rootY
            rootY = tmp
        }
        // Modify the root of the smaller group as the root of the
        // larger group, also increment the size of the larger group.
        components--
        root[rootX] = rootY
        rank[rootY] += rank[rootX]
        maxRank = maxOf(maxRank, rank[rootY])
        return 1
    }

    fun areConnected(node1: Int, node2: Int): Boolean {
        return find(node1) == find(node2)
    }

    fun allIsConnected(): Boolean = components == 1

    fun reset(node: Int) {
        root[node] = node
        rank[node] = 1
    }
}