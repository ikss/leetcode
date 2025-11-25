package medium

/**
 * Given an array of integers nums sorted in non-decreasing order,
 * find the starting and ending position of a given target value.
 * G
 * GIf target is not found in the array, return `[-1, -1]`.
 * G
 * GYou must write an algorithm with O(log n) runtime complexity.
 *
 * [URL](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
 */
object FindFirstAndLastPositionInSortedArray {
    fun searchRangeFullPass(nums: IntArray, target: Int): IntArray {
        var min = -1
        var max = -1

        for (i in nums.indices) {
            if (nums[i] == target) {
                if (i < min || min == -1) {
                    min = i
                }
                if (i > max) {
                    max = i
                }
            }
        }
        return intArrayOf(min, max)
    }

    fun searchRangeBinary(nums: IntArray, target: Int): IntArray {
        val result = IntArray(2)
        result[0] = findFirst(nums, target)
        result[1] = findLast(nums, target)
        return result
    }

    private fun findFirst(nums: IntArray, target: Int): Int {
        var idx = -1
        var start = 0
        var end = nums.size - 1
        while (start <= end) {
            val mid = start + (end - start) / 2
            if (nums[mid] >= target) {
                end = mid - 1
            } else {
                start = mid + 1
            }
            if (nums[mid] == target) idx = mid
        }
        return idx
    }

    private fun findLast(nums: IntArray, target: Int): Int {
        var idx = -1
        var start = 0
        var end = nums.size - 1
        while (start <= end) {
            val mid = start + (end - start) / 2
            if (nums[mid] > target) {
                end = mid - 1
            } else {
                start = mid + 1
            }
            if (nums[mid] == target) idx = mid
        }
        return idx
    }
}
