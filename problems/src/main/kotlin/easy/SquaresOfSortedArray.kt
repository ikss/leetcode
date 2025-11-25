package easy

/**
 * Given an integer array nums sorted in non-decreasing order,
 * return an array of the squares of each number sorted in non-decreasing order.
 *
 * [URL](https://leetcode.com/problems/squares-of-a-sorted-array/)
 */
object SquaresOfSortedArray {
    fun sortedSquares(nums: IntArray): IntArray {
        var lo = 0
        var hi = nums.size - 1
        val result = IntArray(nums.size)
        for (i in nums.size - 1 downTo 0) {
            result[i] = if (Math.abs(nums[lo]) >= Math.abs(nums[hi])) {
                nums[lo] * nums[lo++]
            } else {
                nums[hi] * nums[hi--]
            }
        }
        return result
    }
}
