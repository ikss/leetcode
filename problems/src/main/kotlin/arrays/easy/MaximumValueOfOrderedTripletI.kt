package arrays.easy

/**
 * You are given a 0-indexed integer array nums.
 *
 * Return the maximum value over all triplets of indices (i, j, k) such that i < j < k.
 * If all such triplets have a negative value, return 0.
 *
 * The value of a triplet of indices (i, j, k) is equal to `(nums[i] - nums[j]) * nums[k]`.
 *
 * [URL](https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-i/)
 */
object MaximumValueOfOrderedTripletI {

    fun maximumTripletValue(nums: IntArray): Long {
        var result = 0L
        var maxI = 0L
        var maxDiff = 0L
        
        for (k in nums.indices) {
            val numk = nums[k]
            result = maxOf(result, (maxDiff * numk))
            maxDiff = maxOf(maxDiff, maxI - numk)
            maxI = maxOf(maxI, numk.toLong())
        }
        return result
    }
}
