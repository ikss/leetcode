package medium

/**
 * You are given an integer array nums and a positive integer k.
 *
 * Return the number of subarrays where the maximum element of nums appears at least k times in that subarray.
 *
 * A subarray is a contiguous sequence of elements within an array.
 *
 * [URL](https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/)
 */
object CountSubarraysWhereMaxElementAppearsAtLeastKTimes {
    fun countSubarrays(nums: IntArray, k: Int): Long {
        val max = nums.max()

        var result = 0L
        var count = 0
        var left = 0

        for (right in nums.indices) {
            if (nums[right] == max) {
                count++
            }
            while (count == k) {
                if (nums[left++] == max) {
                    count--
                }
            }
            result += left
        }

        return result
    }
}