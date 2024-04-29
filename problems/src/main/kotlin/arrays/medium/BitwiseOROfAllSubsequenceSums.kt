package arrays.medium

/**
 * Given an integer array nums, return the value of the bitwise OR of the sum of all possible subsequences in the array.
 *
 * A subsequence is a sequence that can be derived from another sequence by removing zero or more elements without
 * changing the order of the remaining elements.
 *
 * [URL](https://leetcode.com/problems/bitwise-or-of-all-subsequence-sums)
 */
object BitwiseOROfAllSubsequenceSums {
    fun subsequenceSumOr(nums: IntArray): Long {
        var result = 0L
        var prefixSum = 0L
        for (n in nums) {
            prefixSum += n
            result = result or prefixSum or n.toLong()
        }

        return result
    }
}
