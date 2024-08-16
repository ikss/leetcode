package arrays.easy

/**
 * You are given a 0-indexed m x n integer matrix grid. The width of a column is the maximum length of its integers.
 * * For example, if `grid = [[-10], [3], [12]]`, the width of the only column is 3 since -10 is of length 3.
 *
 * Return an integer array ans of size n where `ans[i]` is the width of the ith column.
 *
 * The length of an integer x with len digits is equal to len if x is non-negative, and len + 1 otherwise.
 *
 * [URL](https://leetcode.com/problems/find-the-width-of-columns-of-a-grid/)
 */
object FindTheWidthOfColumnsOfGrid {
    fun findColumnWidth(grid: Array<IntArray>): IntArray {
        val result = IntArray(grid[0].size) { 1 }

        for (r in grid.indices) {
            for (c in grid[0].indices) {
                var n = grid[r][c]
                var l = if (n < 0) 1 else 0
                while (n != 0) {
                    n /= 10
                    l++
                }
                result[c] = maxOf(result[c], l)
            }
        }
        return result
    }
}
