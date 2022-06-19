package data_structures.arrays.easy

/**
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function
 * to search target in nums. If target exists, then return its index. Otherwise, return -1.
 * You must write an algorithm with O(log n) runtime complexity.
 *
 * [URL](https://leetcode.com/problems/binary-search/)
 */
object BinarySearch {
    fun search(nums: IntArray, target: Int): Int {
        if (nums[0] > target || nums[nums.size - 1] < target) return -1

        var l = 0
        var r = nums.size - 1

        while (l <= r) {
            val tmp = (r - l) / 2 + l
            when {
                nums[tmp] == target -> return tmp
                nums[tmp] > target -> r = tmp - 1
                else -> l = tmp + 1
            }
        }

        return -1
    }
}
