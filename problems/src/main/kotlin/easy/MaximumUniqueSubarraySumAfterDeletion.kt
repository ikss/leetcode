package easy

/**
 * You are given an integer array nums.
 *
 * You are allowed to delete any number of elements from nums without making it empty.
 * After performing the deletions, select a subarray of nums such that:
 *
 * 1. All elements in the subarray are unique.
 * 2. The sum of the elements in the subarray is maximized.
 *
 * Return the maximum sum of such a subarray.
 *
 * [URL](https://leetcode.com/problems/maximum-unique-subarray-sum-after-deletion/)
 */
object MaximumUniqueSubarraySumAfterDeletion {
    fun maxSum(nums: IntArray): Int {
        val seen = BooleanArray(101)

        var sum = 0
        var max = Int.MIN_VALUE
        var hasSeen = false
        for (n in nums) {
            max = maxOf(max, n)
            if (n <= 0 || seen[n]) continue
            seen[n] = true
            sum += n
            hasSeen = true
        }

        return if (hasSeen) sum else max
    }
}
