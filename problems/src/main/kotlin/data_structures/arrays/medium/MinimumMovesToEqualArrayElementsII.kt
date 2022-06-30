package data_structures.arrays.medium

/**
 * Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.
 *
 * In one move, you can increment or decrement an element of the array by 1.
 *
 * Test cases are designed so that the answer will fit in a 32-bit integer.
 *
 * [URL](https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/)
 */
object MinimumMovesToEqualArrayElementsII {
    fun minMoves2(nums: IntArray): Int {
        if (nums.size == 1) return 0
        nums.sort()

        var l = 0
        var r = nums.size - 1
        var result = 0
        while (l < r) {
            result += nums[r--] - nums[l++]
        }

        return result
    }
}
