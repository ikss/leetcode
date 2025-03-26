package arrays.medium

/**
 * A peak element is an element that is strictly greater than its neighbors.
 *
 * Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks,
 * return the index to any of the peaks.
 *
 * You may imagine that nums[-1] = nums[n] = -∞.
 *
 * You must write an algorithm that runs in O(log n) time.
 *
 * [URL](https://leetcode.com/problems/find-peak-element/)
 */
object FindPeakElement {
    fun findPeakElementLinearScan(nums: IntArray): Int {
        for (i in 0 until nums.size - 1) {
            if (nums[i] > nums[i + 1]) {
                return i
            }
        }
        return nums.size - 1
    }

    fun findPeakElementBinarySearch(nums: IntArray): Int {
        var left = 0
        var right = nums.size - 1

        while (left < right) {
            val mid = (right - left) / 2 + left
            if (nums[mid] > nums[mid + 1]) {
                right = mid
            } else {
                left = mid + 1
            }
        }
        return left
    }
}
