package data_structures.arrays.medium

/**
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that
 * objects of the same color are adjacent, with the colors in the order red, white, and blue.
 *
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 *
 * You must solve this problem without using the library's sort function.
 *
 * [URL](https://leetcode.com/problems/sort-colors/)
 */
object SortColors {
    fun sortColors(nums: IntArray) {
        if (nums.size < 2) return

        var i = 0
        var start = 0
        var end = nums.size - 1
        while (i <= end) {
            if (nums[i] == 0) {
                nums[i++] = 1
                nums[start++] = 0
            } else if (nums[i] == 2) {
                nums[i] = nums[end]
                nums[end--] = 2
            } else {
                i++
            }
        }
    }
}
