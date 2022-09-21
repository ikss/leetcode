package arrays.medium

/**
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 *
 * [URL](https://leetcode.com/problems/rotate-array/)
 */
object RotateArray {
    fun rotate(nums: IntArray, k: Int) {
        val shift = k % nums.size
        if (shift == 0) return

        rotate(nums, 0, nums.size - 1)
        rotate(nums, 0, shift - 1)
        rotate(nums, shift, nums.size - 1)
    }

    private fun rotate(array: IntArray, startIndex: Int, endIndex: Int) {
        var start = startIndex
        var end = endIndex
        while (start < end) {
            val temp = array[start]
            array[start] = array[end]
            array[end] = temp
            start++
            end--
        }
    }
}
