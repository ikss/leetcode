package arrays.medium

/**
 * Given an integer array nums, return the number of subarrays filled with 0.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 * [URL](https://leetcode.com/problems/number-of-zero-filled-subarrays/)
 */
object NumberOfZeroFilledSubarrays {
    fun zeroFilledSubarrayNaive(nums: IntArray): Long {
        var count = 0L
        var result = 0L
        for (n in nums) {
            if (n == 0) {
                count++
            } else {
                result += count * (count + 1) / 2
                count = 0
            }
        }
        if (count > 0) {
            result += count * (count + 1) / 2
        }
        return result
    }

    fun zeroFilledSubarrayNaiveOfficial(nums: IntArray): Long {
        var ans = 0L
        var numSubarray = 0L

        for (num in nums) {
            if (num == 0) {
                numSubarray++
                ans += numSubarray
            } else {
                numSubarray = 0
            }
        }
        return ans
    }
}
