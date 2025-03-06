package arrays.medium

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
    fun findMissingAndRepeatedValues(grid: Array<IntArray>): IntArray {
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
}