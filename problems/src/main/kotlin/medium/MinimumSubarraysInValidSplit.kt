package medium

/**
 * You are given an integer array nums.
 *
 * Splitting of an integer array nums into subarrays is valid if:
 *
 * the greatest common divisor of the first and last elements of each subarray is greater than 1, and
 * each element of nums belongs to exactly one subarray.
 * Return the minimum number of subarrays in a valid subarray splitting of nums. If a valid subarray splitting is not possible, return -1.
 *
 * Note that:
 * * The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
 * * A subarray is a contiguous non-empty part of an array.
 *
 * [URL](https://leetcode.com/problems/minimum-subarrays-in-a-valid-split/)
 */
object MinimumSubarraysInValidSplit {
    fun validSubarraySplit(nums: IntArray): Int {
        val dp = IntArray(nums.size + 1) { nums.size + 1 }
        dp[0] = 0

        for (i in 1..nums.size) {
            for (j in 1..i) {
                if (gcd(nums[j - 1], nums[i - 1]) > 1) {
                    dp[i] = minOf(dp[i], dp[j - 1] + 1)
                }
            }
        }
        return if (dp[nums.size] == nums.size + 1) -1 else dp[nums.size]
    }

    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}
