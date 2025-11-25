package medium

/**
 * Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.
 *
 * A subarray is a contiguous part of an array.
 *
 * [URL](https://leetcode.com/problems/subarray-sums-divisible-by-k/)
 */
object SubarraySumsDivisibleByK {
    var result = 0

    fun subarraysDivByKNaive(nums: IntArray, k: Int): Int {
        result = 0

        for (i in nums.indices) {
            traverse(i, k, nums[i], nums)
        }

        return result
    }

    private fun traverse(index: Int, goal: Int, currSum: Int, nums: IntArray) {
        if (currSum % goal == 0) {
            result++
        }
        if (index >= nums.size - 1) {
            return
        }
        traverse(index + 1, goal, currSum + nums[index + 1], nums)
    }

    fun subarraysDivByKPrefixSum(nums: IntArray, k: Int): Int {
        var prefixMod = 0
        var result = 0

        // There are k mod groups 0...k-1.
        val modGroups = IntArray(k)
        modGroups[0] = 1
        for (num in nums) {
            // Take modulo twice to avoid negative remainders.
            prefixMod = (prefixMod + num % k + k) % k
            // Add the count of subarrays that have the same remainder as the current
            // one to cancel out the remainders.
            result += modGroups[prefixMod]
            modGroups[prefixMod]++
        }
        return result
    }
}
