package arrays.easy

/**
 * Given an integer array nums containing distinct positive integers, find and return any number from the array that is
 * neither the minimum nor the maximum value in the array, or -1 if there is no such number.
 *
 * Return the selected integer.
 *
 * [URL](https://leetcode.com/problems/neither-minimum-nor-maximum/)
 */
object NeitherMinimumNorMaximum {
    fun findNonMinOrMax(nums: IntArray): Int {
        if (nums.size < 3) return -1

        var sum = 0
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE
        for (i in 0 until 3) {
            val num = nums[i]
            sum += num
            if (num < min) {
                min = num
            }
            if (num > max) {
                max = num
            }
        }

        return sum - min - max
    }
}
