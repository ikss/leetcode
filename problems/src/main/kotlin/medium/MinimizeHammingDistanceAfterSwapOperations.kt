package medium

/**
 * You are given two integer arrays, source and target, both of length n.
 * You are also given an array allowedSwaps where each `allowedSwaps[i] = [ai, bi]`
 * indicates that you are allowed to swap the elements at index ai and index bi (0-indexed) of array source.
 * Note that you can swap elements at a specific pair of indices multiple times and in any order.
 *
 * The Hamming distance of two arrays of the same length, source and target, is the number of positions where
 * the elements are different. Formally, it is the number of indices i for 0 <= i <= n-1 where
 * `source[i] != target[i]` (0-indexed).
 *
 * Return the minimum Hamming distance of source and target after performing any amount of swap operations on array source.
 *
 * [URL](https://leetcode.com/problems/minimize-hamming-distance-after-swap-operations/)
 */
object MinimizeHammingDistanceAfterSwapOperations {
    fun minimumHammingDistance(source: IntArray, target: IntArray, allowedSwaps: Array<IntArray>): Int {
        val uf = UnionFind(source.size)
        for ((from, to) in allowedSwaps) {
            uf.union(from, to)
        }

        val sets = HashMap<Int, HashMap<Int, Int>>()
        for (i in source.indices) {
            val f = uf.find(i)
            val cnt = sets.computeIfAbsent(f) { HashMap() }
            cnt[source[i]] = cnt.getOrDefault(source[i], 0) + 1
        }

        var result = 0

        for (i in target.indices) {
            val f = uf.find(i)
            val cnt = sets[f]!!

            if (cnt.getOrDefault(target[i], 0) > 0) {
                cnt[target[i]] = cnt[target[i]]!! - 1
            } else {
                result++
            }
        }

        return result
    }

    private class UnionFind(size: Int) {
        val parent = IntArray(size) { it }
        val rank = IntArray(size) { 1 }

        fun union(first: Int, second: Int): Boolean {
            val p1 = find(first)
            val p2 = find(second)

            if (p1 == p2) return false

            val (p, c) = if (rank[p1] >= rank[p2]) p1 to p2 else p2 to p1

            rank[p] += rank[c]
            parent[c] = p

            return true
        }

        fun find(num: Int): Int {
            if (parent[num] != num) {
                parent[num] = find(parent[num])
            }
            return parent[num]
        }
    }
}
