package hard


/**
 * There is an undirected tree with n nodes labeled from 1 to n, rooted at node 1.
 * The tree is represented by a 2D integer array edges of length n - 1,
 * where `edges[i] = [ui, vi]` indicates that there is an edge between nodes ui and vi.
 *
 * Initially, all edges have a weight of 0. You must assign each edge a weight of either 1 or 2.
 *
 * The cost of a path between any two nodes u and v is the total weight of all edges in the path connecting them.
 *
 * You are given a 2D integer array queries. For each `queries[i] = [ui, vi]`, determine the number of ways to assign
 * weights to edges in the path such that the cost of the path between ui and vi is odd.
 *
 * Return an array answer, where `answer[i]` is the number of valid assignments for `queries[i]`.
 *
 * Since the answer may be large, apply modulo 10^9 + 7 to each `answer[i]`.
 *
 * Note: For each query, disregard all edges not in the path between node ui and vi.
 *
 * [URL](https://leetcode.com/problems/number-of-ways-to-assign-edge-weights-ii/)
 */
object NumberOfWaysToAssignEdgeWeightsII {
    fun assignEdgeWeights(edges: Array<IntArray>, queries: Array<IntArray>): IntArray {
        val tree = HashMap<Int, HashSet<Int>>()
        var n = 1

        for ((f, t) in edges) {
            tree.computeIfAbsent(f) { HashSet() }.add(t)
            tree.computeIfAbsent(t) { HashSet() }.add(f)
            n = maxOf(n, f, t)
        }

        val parents = computeParents(n, tree)

        val result = IntArray(queries.size)

        for (i in queries.indices) {
            val (q, v) = queries[i]
            val length = getRouteLength(q, v, parents)

            result[i] = if (length < 2) length else qpow(2, length - 1)
        }

        return result
    }

    private fun getRouteLength(q: Int, v: Int, parents: IntArray): Int {
        if (q == v) return 0
        val parentsq = HashMap<Int, Int>()
        parentsq[q] = 0
        var q = q

        while (parents[q] != q) {
            val len =  parentsq[q]!!
            q = parents[q]
            parentsq[q] = len + 1
        }

        var v = v

        var steps = 0
        while (v !in parentsq) {
            v = parents[v]
            steps++
        }

        return steps + parentsq[v]!!
    }

    private fun computeParents(n: Int, tree: HashMap<Int, HashSet<Int>>): IntArray {
        val result = IntArray(n + 1)
        result[1] = 1

        val queue = java.util.ArrayDeque<Int>()
        queue.offer(1)
        val visited = HashSet<Int>()
        visited.add(1)

        while (queue.isNotEmpty()) {
            val q = queue.poll()

            for (child in tree[q] ?: continue) {
                if (!visited.add(child)) continue
                result[child] = q
                queue.offer(child)
            }
        }

        return result
    }

    private fun qpow(x: Int, y: Int): Int {
        var y = y
        var res: Long = 1
        var base = x.toLong()
        while (y > 0) {
            if ((y and 1) == 1) {
                res = (res * base) % 1_000_000_007
            }
            base = (base * base) % 1_000_000_007
            y = y shr 1
        }
        return res.toInt()
    }
}
