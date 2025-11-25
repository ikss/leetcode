package medium

import java.util.*

/**
 * You are given an array nums of size n, consisting of non-negative integers.
 * Your task is to apply some (possibly zero) operations on the array so that all elements become 0.
 *
 * In one operation, you can select a subarray `[i, j]` (where 0 <= i <= j < n) and set all occurrences
 * of the minimum non-negative integer in that subarray to 0.
 *
 * Return the minimum number of operations required to make all elements in the array 0.
 *
 * [URL](https://leetcode.com/problems/minimum-operations-to-convert-all-elements-to-zero/)
 */
object MinimumOperationsToConvertAllElementsToZero {
    fun minOperations(nums: IntArray): Int {
        val s = Stack<Int>()

        var result = 0
        for (n in nums) {
            while (s.isNotEmpty() && s.peek() > n) {
                s.pop()
            }
            if (n == 0) continue
            if (s.isEmpty() || s.peek() < n) {
                result++
                s.push(n)
            }
        }

        return result
    }
}
