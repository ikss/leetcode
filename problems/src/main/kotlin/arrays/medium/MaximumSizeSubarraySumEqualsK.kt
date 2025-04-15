package arrays.medium

/**
 * Given an integer array nums and an integer k, return the maximum length of a subarray that sums to k.
 * If there is not one, return 0 instead.
 *
 * [URL](https://leetcode.com/problems/maximum-size-subarray-sum-equals-k/)
 */
object MaximumSizeSubarraySumEqualsK {
    fun maxSubArrayLen(nums: IntArray, k: Int): Int {
        var prefixSum = 0
        val indexOfSeen = HashMap<Int, Int>()

        var result = 0
        for (i in nums.indices) {
            val n = nums[i]
            prefixSum += n

            if (prefixSum == k) {
                result = i + 1
            }

            if (prefixSum - k in indexOfSeen) {
                result = maxOf(result, i - indexOfSeen[prefixSum - k]!!)
            }
            if (prefixSum !in indexOfSeen) {
                indexOfSeen[prefixSum] = i
            }
        }

        return result
    }
}
