package hard

/**
 * Given an integer array nums and an integer k, return the number of good subarrays of nums.
 *
 * A good array is an array where the number of different integers in that array is exactly k.
 *
 * For example, `[1,2,3,1,2]` has 3 different integers: 1, 2, and 3.
 * A subarray is a contiguous part of an array.
 *
 * [URL](https://leetcode.com/problems/subarrays-with-k-different-integers/)
 */
object SubarraysWithKDifferentIntegers {
    fun subarraysWithKDistinct(nums: IntArray, k: Int): Int {
        val distinctCount = IntArray(nums.size + 1)

        var k = k
        var totalCount = 0
        var left = 0
        var currCount = 0

        for (right in nums.indices) {
            if (distinctCount[nums[right]]++ == 0) {
                k--
            }

            // If K becomes negative, adjust the window from the left
            if (k < 0) {
                // Move the left pointer until the count of distinct elements becomes valid again
                --distinctCount[nums[left++]]
                k++
                currCount = 0
            }

            if (k == 0) {
                while (distinctCount[nums[left]] > 1) {
                    --distinctCount[nums[left++]]
                    currCount++
                }
                totalCount += (currCount + 1)
            }
        }
        return totalCount
    }
}
