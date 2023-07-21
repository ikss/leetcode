package arrays.medium

/**
 * You are given an array of integers nums and an integer target.
 *
 * Return the number of non-empty subsequences of nums such that the sum of the minimum and maximum element on it is
 * less or equal to target. Since the answer may be too large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/)
 */
object NumberOfSubsequencesThatSatisfyTheGivenSumCondition {
    fun numSubseq(nums: IntArray, target: Int): Int {
        val n = nums.size
        val mod = 1_000_000_007
        nums.sort()

        // Precompute the value of 2 to the power of each value.
        val power = IntArray(n)
        power[0] = 1
        for (i in 1 until n) {
            power[i] = power[i - 1] * 2 % mod
        }
        var result = 0
        var left = 0
        var right = n - 1
        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                result += power[right - left]
                result %= mod
                left++
            } else {
                right--
            }
        }
        return result
    }
}
