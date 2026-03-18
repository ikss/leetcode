package medium

import data_structures.TreeNode

/**
 * You are given a 0-indexed integer matrix grid and an integer k.
 *
 * Return the number of submatrices that contain the top-left element of the grid,
 * and have a sum less than or equal to k.
 *
 * [URL](https://leetcode.com/problems/count-submatrices-with-top-left-element-and-sum-less-than-k/)
 */
object CountSubmatricesWithTopLeftElementAndSumLessThanK {
    fun countSubmatrices(grid: Array<IntArray>, k: Int): Int {
        val r = grid.size
        val c = grid[0].size
        val sums = Array(r) { IntArray(c) }

        for (r in grid.indices) {
            for (c in grid[0].indices) {
                val prevRow = if (r == 0) 0 else sums[r - 1][c]
                val prevCol = if (c == 0) 0 else sums[r][c - 1]
                val prevRowCol = if (r == 0 || c == 0) 0 else sums[r - 1][c - 1]
                sums[r][c] = grid[r][c] + prevRow + prevCol - prevRowCol
            }
        }

        var result = 0

        var startRow = 0
        var startCol = findCol(sums, startRow, k, sums[0].size - 1)
        while (startCol >= 0) {
            result += startCol + 1
            startRow++
            if (startRow >= grid.size) break
            startCol = findCol(sums, startRow, k, startCol)
        }

        return result
    }

    private fun findCol(arr: Array<IntArray>, row: Int, maxSum: Int, maxIndex: Int): Int {
        var result = -1
        var left = 0
        var right = maxIndex

        while (left <= right) {
            val mid = left + (right - left) / 2

            if (arr[row][mid] <= maxSum) {
                left = mid + 1
                result = mid
            } else {
                right = mid - 1
            }
        }

        return result
    }
}