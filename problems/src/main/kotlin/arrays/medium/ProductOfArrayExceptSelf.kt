package arrays.medium

import java.util.*

/**
 * Given an integer array nums, return an array answer such that `answer[i]` is equal to the product of
 * all the elements of nums except nums[i].
 *
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 * [URL](https://leetcode.com/problems/product-of-array-except-self/)
 */
object ProductOfArrayExceptSelf {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val prefixMul = IntArray(n) { nums[it] }
        val suffixMul = IntArray(n) { nums[it] }

        for (i in 1 until n) {
            prefixMul[i] *= prefixMul[i - 1]
            suffixMul[n - i - 1] *= suffixMul[n - i]
        }

        val result = IntArray(n)
        for (i in 0 until n) {
            val prev = if (i > 0) prefixMul[i - 1] else 1
            val next = if (i < n - 1) suffixMul[i + 1] else 1
            result[i] = prev * next
        }

        return result
    }
}