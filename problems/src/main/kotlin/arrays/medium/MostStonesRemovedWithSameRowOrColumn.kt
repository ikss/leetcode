package arrays.medium

/**
 * On a 2D plane, we place n stones at some integer coordinate points. Each coordinate point may have at most one stone.
 *
 * A stone can be removed if it shares either the same row or the same column as another stone that has not been removed.
 *
 * Given an array stones of length n where `stones[i] = [xi, yi]` represents the location of the ith stone,
 * return the largest possible number of stones that can be removed.
 *
 * [URL](https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/)
 */
object MostStonesRemovedWithSameRowOrColumn {
    private var f = mutableMapOf<Int, Int?>()
    private var islands = 0

    fun removeStones(stones: Array<IntArray>): Int {
        f.clear()
        islands = 0
        for (i in stones.indices) {
            union(stones[i][0], stones[i][1].inv())
        }
        return stones.size - islands
    }

    private fun find(x: Int): Int {
        if (f.putIfAbsent(x, x) == null) {
            islands++
        }
        if (x != f[x]) {
            f[x] = find(f[x]!!)
        }
        return f[x]!!
    }

    private fun union(x: Int, y: Int) {
        val x = find(x)
        val y = find(y)
        if (x != y) {
            f[x] = y
            islands--
        }
    }
}
