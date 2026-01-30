package hard

/**
 * You are given two 0-indexed strings source and target, both of length n and consisting of lowercase English
 * characters. You are also given two 0-indexed string arrays original and changed, and an integer array cost,
 * where `cost[i]` represents the cost of converting the string `original[i]` to the string `changed[i]`.
 *
 * You start with the string source. In one operation, you can pick a substring x from the string,
 * and change it to y at a cost of z if there exists any index j such that `cost[j] == z`, `original[j] == x`,
 * and `changed[j] == y`. You are allowed to do any number of operations,
 * but any pair of operations must satisfy either of these two conditions:
 *
 * * The substrings picked in the operations are `source[a..b]` and `source[c..d]` with either b < c or d < a.
 * In other words, the indices picked in both operations are disjoint.
 * * The substrings picked in the operations are `source[a..b]` and `source[c..d]` with a == c and b == d.
 * In other words, the indices picked in both operations are identical.
 *
 * Return the minimum cost to convert the string source to the string target using any number of operations.
 * If it is impossible to convert source to target, return -1.
 *
 *
 * Note that there may exist indices i, j such that `original[j] == original[i]` and `changed[j] == changed[i]`.
 *
 * [URL](https://leetcode.com/problems/minimum-cost-to-convert-string-ii/)
 */
object MinimumCostToConvertStringII {
    class Trie {
        var child: Array<Trie?> = arrayOfNulls<Trie>(26)
        var id: Int = -1
    }

    val INF: Int = Int.MAX_VALUE / 2

    private fun add(node: Trie, word: String, index: IntArray): Int {
        var node = node
        for (ch in word.toCharArray()) {
            val i = ch - 'a'
            if (node.child[i] == null) {
                node.child[i] = Trie()
            }
            node = node.child[i]!!
        }
        if (node.id == -1) {
            node.id = ++index[0]
        }
        return node.id
    }

    fun minimumCost(
        source: String,
        target: String,
        original: Array<String>,
        changed: Array<String>,
        cost: IntArray,
    ): Long {
        val n = source.length
        val m = original.size
        val root = Trie()

        val p = intArrayOf(-1)
        val g = Array(m * 2) { IntArray(m * 2) { INF } }

        for (i in 0..<m * 2) {
            g[i][i] = 0
        }

        for (i in 0..<m) {
            val x = add(root, original[i], p)
            val y = add(root, changed[i], p)
            g[x][y] = minOf(g[x][y], cost[i])
        }

        val size = p[0] + 1
        for (k in 0..<size) {
            for (i in 0..<size) {
                for (j in 0..<size) {
                    g[i][j] = minOf(g[i][j], g[i][k] + g[k][j])
                }
            }
        }

        val f = LongArray(n) { -1 }
        for (j in 0..<n) {
            if (j > 0 && f[j - 1] == -1L) {
                continue
            }
            val base = (if (j == 0) 0 else f[j - 1])
            if (source[j] == target[j]) {
                f[j] = if (f[j] == -1L) base else minOf(f[j], base)
            }

            var u: Trie? = root
            var v: Trie? = root
            for (i in j..<n) {
                u = u!!.child[source[i] - 'a']
                v = v!!.child[target[i] - 'a']
                if (u == null || v == null) {
                    break
                }
                if (u.id != -1 && v.id != -1 && g[u.id][v.id] != INF) {
                    val newVal = base + g[u.id][v.id]
                    if (f[i] == -1L || newVal < f[i]) {
                        f[i] = newVal
                    }
                }
            }
        }

        return f[n - 1]
    }
}
