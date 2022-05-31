package collections.arrays.easy

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 * [URL](https://leetcode.com/problems/move-zeroes/)
 */
object MoveZeroes {
    fun moveZeroes(nums: IntArray): Unit {
        var realIndex = 0
        for (i in nums.indices) {
            if (nums[i] != 0) {
                if (i != realIndex) {
                    nums[realIndex] = nums[i]
                    nums[i] = 0
                }
                realIndex++
            }
        }
    }
}
