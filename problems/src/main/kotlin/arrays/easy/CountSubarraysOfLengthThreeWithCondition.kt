package arrays.easy

/**
 * Given an integer array nums, return the number of subarrays of length 3 such that
 * the sum of the first and third numbers equals exactly half of the second number.
 *
 * [URL](https://leetcode.com/problems/count-subarrays-of-length-three-with-a-condition/)
 */
object CountSubarraysOfLengthThreeWithCondition {
    fun countSubarrays(nums: IntArray): Int {
        var result = 0

        for (i in 0 until nums.size - 2) {
            if ((nums[i] + nums[i + 2]) * 2 == nums[i + 1]) {
                result++
            }
        }

        return result
    }
}
