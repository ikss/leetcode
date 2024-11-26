package arrays.hard

import java.util.*
import kotlin.collections.HashMap

/**
 * You are given an m x n integer matrix grid containing distinct positive integers.
 *
 * You have to replace each integer in the matrix with a positive integer satisfying the following conditions:
 * * The relative order of every two elements that are in the same row or column should stay the same
 * after the replacements.
 * * The maximum number in the matrix after the replacements should be as small as possible.
 *
 * The relative order stays the same if for all pairs of elements in the original matrix such that
 * `grid[r1][c1] > grid[r2][c2]` where either r1 == r2 or c1 == c2, then it must be true that
 * `grid[r1][c1] > grid[r2][c2]` after the replacements.
 *
 * For example, if `grid = [[2, 4, 5], [7, 3, 9]]` then a good replacement could be either
 * `grid = [[1, 2, 3], [2, 1, 4]]` or `grid = [[1, 2, 3], [3, 1, 4]]`.
 *
 * Return the resulting matrix. If there are multiple answers, return any of them.
 *
 * [URL](https://leetcode.com/problems/minimize-maximum-value-in-a-grid/)
 */
object MinimizeMaximumValueInGrid {
    fun minScore(grid: Array<IntArray>): Array<IntArray> {
        val queue = PriorityQueue<IntArray> { a1, a2 -> a1[0] - a2[0] }

        val rowMap = HashMap<Int, Int>()
        val colMap = HashMap<Int, Int>()

        for (r in grid.indices) {
            for (c in grid[0].indices) {
                queue.offer(intArrayOf(grid[r][c], r, c))
            }
        }

        while (queue.isNotEmpty()) {
            val (_, r, c) = queue.poll()

            val next = maxOf(rowMap.getOrDefault(r, 0), colMap.getOrDefault(c, 0)) + 1
            grid[r][c] = next
            rowMap[r] = next
            colMap[c] = next
        }

        return grid
    }
}
