package arrays.medium

/**
 * There is an integer array nums sorted in ascending order (with distinct values).
 *
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
 * such that the resulting array is `[nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]`] (0-indexed).
 * For example, `[0,1,2,4,5,6,7]` might be rotated at pivot index 3 and become `[4,5,6,7,0,1,2]`.
 *
 * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums,
 * or -1 if it is not in nums.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * [URL](https://leetcode.com/problems/01-matrix/)
 */
object SearchInRotatedSortedArray {
    fun search(nums: IntArray, target: Int): Int {
        val n = nums.size
        var lo = 0
        var hi = n - 1

        while (lo < hi) {
            val mid = (hi - lo) / 2 + lo
            if (nums[mid] > nums[hi]) {
                lo = mid + 1
            } else {
                hi = mid
            }
        }

        val rotation = hi
        lo = 0
        hi = nums.size - 1

        while (lo <= hi) {
            val mid = (hi - lo) / 2 + lo
            val realMid = (mid + rotation) % n
            val value = nums[realMid]

            when {
                value == target -> return realMid
                value < target -> lo = mid + 1
                else -> hi = mid - 1
            }
        }
        return -1
    }
}
