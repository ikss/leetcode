package medium

import data_structures.TreeNode
import java.util.ArrayDeque

/**
 * You are given an array nums consisting of n prime integers.
 *
 * You need to construct an array ans of length n, such that, for each index i, the bitwise OR of `ans[i] and ans[i] + 1`
 * is equal to `nums[i]`, i.e. `ans[i] OR (ans[i] + 1) == nums[i]`.
 *
 * Additionally, you must minimize each value of `ans[i]` in the resulting array.
 *
 * If it is not possible to find such a value for `ans[i]` that satisfies the condition, then set `ans[i] = -1`.
 *
 * [URL](https://leetcode.com/problems/construct-the-minimum-bitwise-array-i/)
 */
object ConstructTheMinimumBitwiseArrayI {
    fun minBitwiseArray(nums: List<Int>): IntArray {
        val result = IntArray(nums.size)
        for (i in nums.indices) {
            val n = nums[i]
            result[i] = getAnswer(n)
        }

        return result
    }

    private fun getAnswer(n: Int): Int {
        for (i in 1 until n) {
            if (i or (i + 1) == n) {
                return i
            }
        }
        return -1
    }
}
