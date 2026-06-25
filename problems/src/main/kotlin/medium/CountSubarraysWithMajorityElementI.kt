package medium

/**
 * You are given an integer array nums and an integer target.
 *
 * Return the number of subarrays of nums in which target is the majority element.
 *
 * The majority element of a subarray is the element that appears strictly more than half of the times in that subarray.
 *
 * [URL](https://leetcode.com/problems/count-subarrays-with-majority-element-i/)
 */
object CountSubarraysWithMajorityElementI {
    fun countMajoritySubarrays(nums: IntArray, target: Int): Int {
        var targetCount = 0
        var result = 0

        for (i in nums.indices) {
            val n = nums[i]
            if (n == target) {
                targetCount++
            }

            result += countArrays(nums, i, target, targetCount)
        }
        return result
    }

    private fun countArrays(nums: IntArray, end: Int, target: Int, targetCount: Int): Int {
        var count = 0
        var targetCount = targetCount

        for (i in 0 .. end) {
            if (targetCount > (end - i + 1) / 2) {
                count++
            }
            if (nums[i] == target) {
                targetCount--
            }
        }

        return count
    }
}
