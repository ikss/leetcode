package medium

/**
 * You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
 *
 * Return the single element that appears only once.
 *
 * Your solution must run in O(log n) time and O(1) space.
 *
 * [URL](https://leetcode.com/problems/single-element-in-a-sorted-array/)
 */
object SingleElementInSortedArray {
    fun singleNonDuplicate(nums: IntArray): Int {
        var left = 0
        var right = nums.size - 1
        while (left < right) {
            val mid = left + (right - left) / 2
            if (mid % 2 == 0 && nums[mid] == nums[mid + 1] || mid % 2 == 1 && nums[mid] == nums[mid - 1]) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return nums[left]
    }
}