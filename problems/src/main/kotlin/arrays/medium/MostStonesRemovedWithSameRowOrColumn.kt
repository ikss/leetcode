package arrays.medium

import data_structures.UnionFind

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
    private const val MAX_VALUE = 10001

    fun removeStones(stones: Array<IntArray>): Int {
        val set = HashSet<Int>()
        val uf = UnionFind(MAX_VALUE * 2)
        var components = 0
        for ((row, col) in stones) {
            if (set.add(row)) {
                components++
            }
            val newCol = col + MAX_VALUE
            if (set.add(newCol)) {
                components++
            }
            if (uf.union(row, col + MAX_VALUE) == 1) {
                components--
            }
        }
        return stones.size - components
    }
}
