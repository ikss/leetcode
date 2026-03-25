package medium

/**
 * You are given an m x n matrix grid of positive integers.
 * Your task is to determine if it is possible to make either one horizontal or one vertical cut on the grid such that:
 *
 * * Each of the two resulting sections formed by the cut is non-empty.
 * * The sum of the elements in both sections is equal.
 *
 * Return true if such a partition exists; otherwise return false.
 *
 * [URL](https://leetcode.com/problems/equal-sum-grid-partition-i/)
 */
object EqualSumGridPartitionI {
    fun canPartitionGrid(grid: Array<IntArray>): Boolean {
        val rows = grid.size
        val cols = grid[0].size


        val rowsSums = LongArray(rows)
        val colsSums = LongArray(cols)
        var totalSum = 0L

        for (r in 0 until rows) {
            for (c in 0 until cols) {
                val num = grid[r][c]
                rowsSums[r] += num
                colsSums[c] += num
                totalSum += num
            }
        }

        var runningSum = 0L
        for (r in rowsSums) {
            runningSum += r

            if (runningSum == totalSum - runningSum) {
                return true
            }
        }

        runningSum = 0L
        for (c in colsSums) {
            runningSum += c

            if (runningSum == totalSum - runningSum) {
                return true
            }
        }

        return false
    }
}
