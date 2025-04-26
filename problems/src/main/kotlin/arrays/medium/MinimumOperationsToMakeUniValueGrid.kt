package arrays.medium

import java.util.*
import kotlin.math.abs

/**
 * You are given a 2D integer grid of size m x n and an integer x. In one operation,
 * you can add x to or subtract x from any element in the grid.
 *
 * A uni-value grid is a grid where all the elements of it are equal.
 *
 * Return the minimum number of operations to make the grid uni-value. If it is not possible, return -1.
 *
 * [URL](https://leetcode.com/problems/minimum-operations-to-make-a-uni-value-grid/)
 */
object MinimumOperationsToMakeUniValueGrid {

    fun minOperations(grid: Array<IntArray>, x: Int): Int {
        val numsArray = ArrayList<Int>()
        val rem = grid[0][0] % x
        for (row in grid) {
            for (num in row) {
                if (num % x != rem) {
                    return -1
                }
                numsArray.add(num)
            }
        }

        numsArray.sort()

        val finalCommonNumber = numsArray[numsArray.size / 2]

        var result = 0
        for (number in numsArray) {
            result += Math.abs(finalCommonNumber - number) / x 
        }

        return result
    }
}
