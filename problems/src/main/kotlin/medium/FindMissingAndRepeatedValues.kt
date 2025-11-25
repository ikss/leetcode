package medium

/**
 * You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range `[1, n2]`.
 * Each integer appears exactly once except a which appears twice and b which is missing.
 * The task is to find the repeating and missing numbers a and b.
 *
 * Return a 0-indexed integer array ans of size 2 where `ans[0]` equals to a and `ans[1]` equals to b.
 *
 * [URL](https://leetcode.com/problems/find-missing-and-repeated-values/)
 */
object FindMissingAndRepeatedValues {
    fun findMissingAndRepeatedValuesArray(grid: Array<IntArray>): IntArray {
        val arr = BooleanArray(grid.size * grid.size)
        var dup = 0

        for (row in grid) {
            for (el in row) {
                if (arr[el - 1]) {
                    dup = el
                }
                arr[el - 1] = true
            }
        }

        return intArrayOf(dup, arr.indexOfFirst { !it } + 1)
    }

    fun findMissingAndRepeatedValuesMath(grid: Array<IntArray>): IntArray {
        var sum = 0L
        var sqrSum = 0L
        val n = grid.size
        val total = n.toLong() * n

        for (row in 0..<n) {
            for (col in 0..<n) {
                sum += grid[row][col]
                sqrSum += grid[row][col].toLong() * grid[row][col]
            }
        }

        // Calculate differences from expected sums
        // Expected sum: n(n+1)/2, Expected square sum: n(n+1)(2n+1)/6
        val sumDiff = sum - (total * (total + 1)) / 2
        val sqrDiff = sqrSum - (total * (total + 1) * (2 * total + 1)) / 6

        // Using math: If x is repeated and y is missing
        // sumDiff = x - y
        // sqrDiff = x² - y²
        val repeat = (sqrDiff / sumDiff + sumDiff) / 2
        val missing = (sqrDiff / sumDiff - sumDiff) / 2

        return intArrayOf(repeat.toInt(), missing.toInt())
    }
}