package hard

/**
 * Given an integer array nums, return the number of all the arithmetic subsequences of nums.
 *
 * A sequence of numbers is called arithmetic if it consists of at least three elements and if the difference between
 * any two consecutive elements is the same.
 *
 * For example, `[1, 3, 5, 7, 9]`, `[7, 7, 7, 7]`, and `[3, -1, -5, -9]` are arithmetic sequences.
 * For example, `[1, 1, 2, 5, 7]` is not an arithmetic sequence.
 * A subsequence of an array is a sequence that can be formed by removing some elements (possibly none) of the array.
 *
 * For example, `[2, 5, 10]` is a subsequence of `[1, 2, 1, 2, 4, 1, 5, 10]`.
 * The test cases are generated so that the answer fits in 32-bit integer.
 *
 * [URL](https://leetcode.com/problems/arithmetic-slices-ii-subsequence/)
 */
object UniquePathsIII {
    fun uniquePathsIII(grid: Array<IntArray>): Int {
        var zero = 0
        var startX = 0
        var startY = 0
        for (r in grid.indices) {
            for (c in grid[0].indices) {
                if (grid[r][c] == 0) {
                    zero++
                } else if (grid[r][c] == 1) {
                    startX = r
                    startY = c
                }
            }
        }
        return path(grid, startX, startY, zero)
    }

    private fun path(grid: Array<IntArray>, x: Int, y: Int, zero: Int): Int {
        if (x < 0 || y < 0 || x >= grid.size || y >= grid[0].size || grid[x][y] == -1) {
            return 0
        }
        if (grid[x][y] == 2) {
            return if (zero == -1) 1 else 0
        }
        grid[x][y] = -1
        val zero = zero - 1
        val totalCount = path(grid, x + 1, y, zero) + path(grid, x, y + 1, zero) +
                path(grid, x - 1, y, zero) + path(grid, x, y - 1, zero)
        grid[x][y] = 0
        return totalCount
    }
}
