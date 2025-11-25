package medium

/**
 * Given a binary array nums, you should delete one element from it.
 *
 * Return the size of the longest non-empty subarray containing only 1's in the resulting array.
 * Return 0 if there is no such subarray.
 *
 * [URL](https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/)
 */
object LongestSubarrayOf1AfterDeletingOneElement {
    fun longestSubarray(nums: IntArray): Int {
        var lastZero = -1
        var left = 0
        var result = 0

        for (right in nums.indices) {
            if (nums[right] == 0) {
                left = lastZero + 1
                lastZero = right
            }
            result = maxOf(result, right - left)
        }

        return result
    }
}