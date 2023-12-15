package arrays.medium

/**
 * Given an integer array nums and an integer k, return true if nums has a continuous subarray of size
 * at least two whose elements sum up to a multiple of k, or false otherwise.
 *
 * An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.
 *
 * [URL](https://leetcode.com/problems/continuous-subarray-sum/)
 */
object ContinuousSubarraySum {
    fun checkSubarraySum(nums: IntArray, k: Int): Boolean {
        // initialize the hash map with index 0 for sum 0
        val map = hashMapOf(0 to 0)
        var sum = 0
        for (i in nums.indices) {
            sum += nums[i]
            // if the remainder sum % k occurs for the first time
            val element = map[sum % k]
            if (element == null) {
                map[sum % k] = i + 1
            } else if (element < i) {
                return true
            }
        }
        return false
    }
}