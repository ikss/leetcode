package data_structures.arrays.easy

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * [URL](https://leetcode.com/problems/search-insert-position/)
 */
object SquaresOfSortedArray {
    fun sortedSquares(nums: IntArray): IntArray {
        var lo = 0
        var hi = nums.size - 1
        val result = IntArray(nums.size)
        for (i in nums.size - 1 downTo 0) {
            if (Math.abs(nums[lo]) >= Math.abs(nums[hi])) {
                result[i] = nums[lo] * nums[lo++]
            } else {
                result[i] = nums[hi] * nums[hi--]
            }
        }
        return result
    }
}
