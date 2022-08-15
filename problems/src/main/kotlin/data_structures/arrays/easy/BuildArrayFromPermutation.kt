package data_structures.arrays.easy

/**
 * Given a zero-based permutation nums (0-indexed), build an array ans of the same length where `ans[i]` = `nums[nums[i]]`
 * for each 0 <= i < nums.length and return it.
 *
 * A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
 *
 * [URL](https://leetcode.com/problems/build-array-from-permutation/)
 */
object BuildArrayFromPermutation {
    fun buildArray(nums: IntArray): IntArray {
        val res = IntArray(nums.size)

        for (i in nums.indices) {
            res[i] = nums[nums[i]]
        }
        return res
    }
}
