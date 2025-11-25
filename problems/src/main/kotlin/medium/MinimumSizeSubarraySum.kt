package medium

/**
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray
 * whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 *
 * [URL](https://leetcode.com/problems/minimum-size-subarray-sum/)
 */
object MinimumSizeSubarraySum {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var start = 0
        var result = Int.MAX_VALUE
        var sum = 0

        for (i in nums.indices) {
            sum += nums[i]
            while (sum >= target) {
                result = minOf(result, i - start + 1)
                sum -= nums[start++]
            }
        }

        return if (result == Int.MAX_VALUE) 0 else result
    }
}
