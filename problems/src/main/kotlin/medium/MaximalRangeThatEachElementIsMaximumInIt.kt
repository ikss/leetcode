package medium

import java.util.*

/**
 * You are given a 0-indexed array nums of distinct integers.
 *
 * Let us define a 0-indexed array ans of the same length as nums in the following way:
 * * `ans[i]` is the maximum length of a subarray `nums[l..r]`,
 * such that the maximum element in that subarray is equal to `nums[i]`.
 * 
 * Return the array ans.
 *
 * Note that a subarray is a contiguous part of the array.
 *
 * [URL](https://leetcode.com/problems/maximal-range-that-each-element-is-maximum-in-it/)
 */
object MaximalRangeThatEachElementIsMaximumInIt {
    fun maximumLengthOfRanges(nums: IntArray): IntArray {
        val n = nums.size
        val left = IntArray(n)
        val right = IntArray(n)
        val stack = Stack<Int>()

        for (i in 0 until n) {
            val num = nums[i]
            while (stack.isNotEmpty() && nums[stack.peek()] < num){
                stack.pop()
            }
            left[i] = if (stack.isEmpty()) -1 else stack.peek()
            stack.push(i)
        }
        stack.clear()
        for (i in n - 1 downTo 0) {
            val num = nums[i]
            while (stack.isNotEmpty() && nums[stack.peek()] < num){
                stack.pop()
            }
            right[i] = if (stack.isEmpty()) n else stack.peek()
            stack.push(i)
        }
        val result = IntArray(n)

        for (i in result.indices) {
            result[i] = right[i] - left[i] - 1
        }

        return result
    }
}
