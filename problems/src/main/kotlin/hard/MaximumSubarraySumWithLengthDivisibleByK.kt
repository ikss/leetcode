package hard

/**
 * You are given an array of integers nums and an integer k.
 *
 * Return the maximum sum of a subarray of nums, such that the size of the subarray is divisible by k.
 *
 * [URL](https://leetcode.com/problems/maximum-subarray-sum-with-length-divisible-by-k/)
 */
object MaximumSubarraySumWithLengthDivisibleByK {
    fun maxSubarraySum(nums: IntArray, k: Int): Long {
        val prefSum = LongArray(nums.size + 1)
        prefSum[0] = 0

        for (i in 1 until prefSum.size) {
            prefSum[i] = prefSum[i - 1] + nums[i - 1]
        }

        val sums = LongArray(prefSum.size)
        var result = Long.MIN_VALUE

        for (i in k until prefSum.size) {
            val prevInt = prefSum[i] - prefSum[i - k]
            val totalMax = sums[i - k] + prevInt

            sums[i] = maxOf(totalMax, prevInt)
            result = maxOf(result, sums[i])
        }

        return result
    }
}
