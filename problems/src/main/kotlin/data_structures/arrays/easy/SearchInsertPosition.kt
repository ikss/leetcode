package data_structures.arrays.easy

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * [URL](https://leetcode.com/problems/search-insert-position/)
 */
object SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var min = 0
        var max = nums.size - 1

        while (min <= max) {
            val index = (max - min) / 2 + min
            if (target == nums[index]) return index
            else if (target > nums[index]) min = index + 1
            else max = index - 1
        }
        return min
    }
}
