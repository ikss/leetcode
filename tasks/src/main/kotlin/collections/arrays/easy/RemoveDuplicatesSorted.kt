package collections.arrays.easy

/**
 * Given an integer array nums sorted in non-decreasing order,
 * remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 *
 * URL: [https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/]
 */
object RemoveDuplicatesSorted {
    fun removeDuplicates(nums: IntArray): Int {
        var curr = 0
        nums.forEach {
            if (nums[curr] != it) {
                nums[++curr] = it
            }
        }

        return curr + 1
    }
}
