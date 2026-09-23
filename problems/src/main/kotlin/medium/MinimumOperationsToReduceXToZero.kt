package medium

import java.util.*

/**
 * You are given an integer array nums and an integer x. In one operation,
 * you can either remove the leftmost or the rightmost element from the array nums and subtract its value from x.
 * Note that this modifies the array for future operations.
 *
 * Return the minimum number of operations to reduce x to exactly 0 if it is possible,
 * otherwise, return -1.
 *
 * [URL](https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/)
 */
object MinimumOperationsToReduceXToZero {
    fun minOperations(nums: IntArray, x: Int): Int {
        val n = nums.size

        var dp = IntArray(n + 1)
        var result = n + 1
        for (l in 0 .. n) {
            val newDp = IntArray(n + 1)
            for (r in 0 .. n - l) {
                if (l == 0 && r == 0) continue

                if (l == 0) {
                    newDp[r] = newDp[r - 1] + nums[n - r]
                    if (newDp[r] == x) {
                        result = minOf(result, r)
                    }
                    continue
                }

                newDp[r] = dp[r] + nums[l - 1]
                if (newDp[r] == x) {
                    result = minOf(result, l + r)
                }
            }
            dp = newDp
        }

        return if (result == n + 1) -1 else result
    }
}