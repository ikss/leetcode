package arrays.medium

import java.util.*

/**
 * You are given a 0-indexed array nums consisting of positive integers. You can choose two indices i and j,
 * such that i != j, and the sum of digits of the number `nums[i]` is equal to that of `nums[j]`.
 *
 * Return the maximum value of `nums[i] + nums[j]` that you can obtain over all possible indices
 * i and j that satisfy the conditions.
 *
 * [URL](https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits/)
 */
object MaxSumOfPairWithEqualSumOfDigits {
    fun maximumSum(nums: IntArray): Int {
        val map = IntArray(82) { -1 }
        var result = -1

        for (n in nums) {
            val sum = sumOf(n)
            val stored = map[sum]
            if (stored != -1) {
                result = maxOf(result, stored + n)
            }
            map[sum] = maxOf(n, stored)
        }

        return result
    }

    private fun sumOf(n: Int): Int {
        var sum = 0
        var n = n

        while (n > 0) {
            sum += n % 10
            n /= 10
        }
        return sum
    }
}