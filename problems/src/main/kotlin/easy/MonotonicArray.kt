package easy

/**
 * An array is monotonic if it is either monotone increasing or monotone decreasing.
 *
 * An array nums is monotone increasing if for all i <= j, `nums[i] <= nums[j]`. An array nums is monotone decreasing
 * if for all i <= j, `nums[i] >= nums[j]`.
 *
 * Given an integer array nums, return true if the given array is monotonic, or false otherwise.
 *
 * [URL](https://leetcode.com/problems/monotonic-array/)
 */
object MonotonicArray {
    fun isMonotonic(nums: IntArray): Boolean {
        if (nums.size < 3) return true

        var sign = nums[0].compareTo(nums[1])

        for (i in 0 until nums.size - 1) {
            val nextSign = nums[i].compareTo(nums[i + 1])

            if (sign == 0) {
                sign = nextSign
            } else if (nextSign != 0 && nextSign != sign) {
                return false
            }
        }

        return true
    }
}
