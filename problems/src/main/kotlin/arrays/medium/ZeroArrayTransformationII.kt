package arrays.medium

import java.util.*

/**
 * You are given an integer array nums of length n and a 2D array queries where `z`queries[i] = [li, ri, vali]`.
 *
 * Each `queries[i]` represents the following action on nums:
 * * Decrement the value at each index in the range [li, ri] in nums by at most vali.
 * * The amount by which each value is decremented can be chosen independently for each index.
 *
 * A Zero Array is an array with all its elements equal to 0.
 *
 * Return the minimum possible non-negative value of k, such that after processing the first k queries in sequence,
 * nums becomes a Zero Array. If no such k exists, return -1.
 *
 * [URL](https://leetcode.com/problems/zero-array-transformation-ii/)
 */
object ZeroArrayTransformationII {
    fun minZeroArray(nums: IntArray, queries: Array<IntArray>): Int {
        val n = nums.size
        var sum = 0
        var k = 0
        val differenceArray = IntArray(n + 1)

        for (index in 0..<n) {
            while (sum + differenceArray[index] < nums[index]) {
                k++
                if (k > queries.size) {
                    return -1
                }
                val (left, right, value) = queries[k - 1]

                if (right >= index) {
                    differenceArray[maxOf(left, index)] += value
                    differenceArray[right + 1] -= value
                }
            }
            sum += differenceArray[index]
        }
        return k
    }
}
