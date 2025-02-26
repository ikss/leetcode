package arrays.medium

import kotlin.math.abs

/**
 * You are given an integer array nums. The absolute sum of a subarray `[numsl, numsl+1, ..., numsr-1, numsr]`
 * is abs(numsl + numsl+1 + ... + numsr-1 + numsr).
 *
 * Return the maximum absolute sum of any (possibly empty) subarray of nums.
 *
 * Note that abs(x) is defined as follows:
 * * If x is a negative integer, then abs(x) = -x.
 * * If x is a non-negative integer, then abs(x) = x.
 *
 * [URL](https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/)
 */
object MaximumAbsoluteSumOfAnySubarray {
    fun maxAbsoluteSum(nums: IntArray): Int {
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE
        var cur = 0
        var res = 0

        for (n in nums) {
            cur += n
            min = minOf(min, cur)
            max = maxOf(max, cur)
            res = if (cur >= 0) {
                maxOf(res, cur, cur - min)
            } else {
                maxOf(res, abs(cur), abs(cur - max))
            }
        }

        return res
    }
}