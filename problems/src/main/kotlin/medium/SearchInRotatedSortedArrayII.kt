package medium

/**
 * There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).
 *
 * Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].
 *
 * Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.
 *
 * You must decrease the overall operation steps as much as possible.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * [URL](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/)
 */
object SearchInRotatedSortedArrayII {
    fun search(nums: IntArray, target: Int): Boolean {
        val n = nums.size
        if (n == 0) return false
        var right = n - 1
        var left = 0
        while (left <= right) {
            val mid = left + (right - left) / 2
            if (nums[mid] == target) {
                return true
            }
            if (nums[left] == nums[mid]) {
                left++
                continue
            }
            // which array does pivot belong to.
            val pivotArray = nums[left] <= nums[mid]

            // which array does target belong to.
            val targetArray = nums[left] <= target
            if (pivotArray != targetArray) { // If pivot and target exist in different sorted arrays
                if (pivotArray) {
                    left = mid + 1 // pivot in the first, target in the second
                } else {
                    right = mid - 1 // target in the first, pivot in the second
                }
            } else { // If pivot and target exist in same sorted array
                if (nums[mid] < target) {
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            }
        }
        return false
    }

}
