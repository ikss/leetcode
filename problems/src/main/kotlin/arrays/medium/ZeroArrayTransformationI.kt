package arrays.medium

import java.util.*

/**
 * ou are given an integer array nums of length n and a 2D array queries, where `queries[i] = [li, ri]`.
 *
 * For each `queries[i]`:
 * * Select a subset of indices within the range [li, ri] in nums.
 * * Decrement the values at the selected indices by 1.
 *
 * A Zero Array is an array where all elements are equal to 0.
 *
 * Return true if it is possible to transform nums into a Zero Array after processing all the queries sequentially,
 * otherwise return false.
 *
 * [URL](https://leetcode.com/problems/zero-array-transformation-i/)
 */
object ZeroArrayTransformationI {
    fun isZeroArray(nums: IntArray, queries: Array<IntArray>): Boolean {
        val n = nums.size
        var sum = 0
        var k = 0
        val differenceArray = IntArray(n + 1)

        for (index in 0..<n) {
            while (sum + differenceArray[index] < nums[index]) {
                k++
                if (k > queries.size) {
                    return false
                }
                val (left, right) = queries[k - 1]

                if (right >= index) {
                    differenceArray[maxOf(left, index)] += 1
                    differenceArray[right + 1] -= 1
                }
            }
            sum += differenceArray[index]
        }
        return true
    }
}
