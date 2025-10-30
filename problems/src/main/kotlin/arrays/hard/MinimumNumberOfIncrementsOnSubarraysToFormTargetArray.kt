package arrays.hard

import java.util.ArrayDeque

/**
 * You are given an integer array target.
 * You have an integer array initial of the same size as target with all elements initially zeros.
 *
 * In one operation you can choose any subarray from initial and increment each value by one.
 *
 * Return the minimum number of operations to form a target array from initial.
 *
 * The test cases are generated so that the answer fits in a 32-bit integer.
 *
 * [URL](https://leetcode.com/problems/minimum-number-of-increments-on-subarrays-to-form-a-target-array/)
 */
object MinimumNumberOfIncrementsOnSubarraysToFormTargetArray {
    fun minNumberOperations(target: IntArray): Int {
        var result = 0

        for (i in 0 until target.size) {
            val n = target[i]
            val prev = if (i == 0) 0 else target[i - 1]

            if (prev < n) {
                result += n - prev
            }
        }

        return result
    }
}
