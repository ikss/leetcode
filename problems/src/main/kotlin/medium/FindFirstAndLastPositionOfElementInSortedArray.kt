package medium

/**
 * Given an array of integers nums sorted in non-decreasing order,
 * find the starting and ending position of a given target value.
 *
 * If target is not found in the array, return `[-1, -1]`.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * [URL](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
 */
object FindFirstAndLastPositionOfElementInSortedArray {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        val left = find(nums, target, first = true)
        if (left == -1) {
            return intArrayOf(-1, -1)
        }
        val right = find(nums, target, first = false)
        return intArrayOf(left, right)
    }

    private fun find(nums: IntArray, target: Int, first: Boolean): Int {
        var idx = -1
        var start = 0
        var end = nums.size - 1
        while (start <= end) {
            val mid = (start + end) / 2
            if (nums[mid] == target) {
                idx = mid
                if (first) {
                    end = mid - 1
                } else {
                    start = mid + 1
                }
            } else if (nums[mid] > target) {
                end = mid - 1
            } else {
                start = mid + 1
            }
        }
        return idx
    }
}
