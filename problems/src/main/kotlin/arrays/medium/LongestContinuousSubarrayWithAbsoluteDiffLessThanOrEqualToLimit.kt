package arrays.medium

import java.util.*

/**
 * Given an array of integers nums and an integer limit, return the size of the longest non-empty subarray
 * such that the absolute difference between any two elements of this subarray is less than or equal to limit.
 *
 * [URL](https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/)
 */
object LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit {
    fun longestSubarray(nums: IntArray, limit: Int): Int {
        val map = TreeMap<Int, Int>()
        var result = 0
        var start = 0

        for (i in nums.indices) {
            val n = nums[i]
            map.merge(n, 1, Int::plus)

            while (map.lastKey() - map.firstKey() > limit) {
                val prev = nums[start++]
                val v = map.merge(prev, 1, Int::minus)
                if (v == 0) {
                    map.remove(prev)
                }
            }
            result = maxOf(result, i - start + 1)
        }

        return result
    }
}
