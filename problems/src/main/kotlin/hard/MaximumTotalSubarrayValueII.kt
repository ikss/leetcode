package hard

import java.util.*

/**
 * You are given an integer array nums of length n and an integer k.
 *
 * You must select exactly k distinct non-empty subarrays `nums[l..r]` of nums.
 * Subarrays may overlap, but the exact same subarray (same l and r) cannot be chosen more than once.
 *
 * The value of a subarray `nums[l..r]` is defined as: `max(nums[l..r]) - min(nums[l..r])`.
 *
 * The total value is the sum of the values of all chosen subarrays.
 *
 * Return the maximum possible total value you can achieve.
 *
 * [URL](https://leetcode.com/problems/maximum-total-subarray-value-ii/)
 */
object MaximumTotalSubarrayValueII {

    fun maxTotalValue(nums: IntArray, k: Int): Long {
        var k = k
        val n = nums.size
        val logn = 32 - Integer.numberOfLeadingZeros(n)
        val stMax = Array(n) { IntArray(logn) }
        val stMin = Array(n) { IntArray(logn) }
        for (i in 0..<n) {
            stMin[i][0] = nums[i]
            stMax[i][0] = stMin[i][0]
        }
        for (j in 1..<logn) {
            var i = 0
            while (i + (1 shl j) <= n) {
                stMax[i][j] = maxOf(
                    stMax[i][j - 1],
                    stMax[i + (1 shl (j - 1))][j - 1]
                )
                stMin[i][j] = minOf(
                    stMin[i][j - 1],
                    stMin[i + (1 shl (j - 1))][j - 1]
                )
                i++
            }
        }
        val pq = PriorityQueue { a: IntArray, b: IntArray -> b[0] - a[0] }
        for (l in 0..<n) {
            val j = 31 - Integer.numberOfLeadingZeros(n - 1 - l + 1)
            val mx = maxOf(stMax[l][j], stMax[n - 1 - (1 shl j) + 1][j])
            val mn = minOf(stMin[l][j], stMin[n - 1 - (1 shl j) + 1][j])
            pq.offer(intArrayOf(mx - mn, l, n - 1))
        }
        var result: Long = 0L
        while (k-- > 0) {
            val top = pq.poll()
            result += top[0].toLong()
            val l = top[1]
            val r = top[2]
            if (r > l) {
                val j = 31 - Integer.numberOfLeadingZeros(r - 1 - l + 1)
                val mx = maxOf(stMax[l][j], stMax[r - 1 - (1 shl j) + 1][j])
                val mn = minOf(stMin[l][j], stMin[r - 1 - (1 shl j) + 1][j])
                pq.offer(intArrayOf(mx - mn, l, r - 1))
            }
        }
        return result
    }
}