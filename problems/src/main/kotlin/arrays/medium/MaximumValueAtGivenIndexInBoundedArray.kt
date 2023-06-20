package arrays.medium

import java.util.*

/**
 * You are given three positive integers: n, index, and maxSum. You want to construct an array nums (0-indexed)
 * that satisfies the following conditions:
 * * nums.length == n
 * * `nums[i]` is a positive integer where 0 <= i < n.
 * * `abs(nums[i] - nums[i+1]) <= 1` where 0 <= i < n-1.
 * * The sum of all the elements of nums does not exceed maxSum.
 * * `nums[index]` is maximized.
 *
 * Return `nums[index]` of the constructed array.
 *
 * Note that abs(x) equals x if x >= 0, and -x otherwise.
 *
 * [URL](https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/)
 */
object MaximumValueAtGivenIndexInBoundedArray {

    fun maxValue(n: Int, index: Int, maxSum: Int): Int {
        var left = 1
        var right = maxSum
        while (left < right) {
            val mid = (left + right + 1) / 2
            if (getSum(index, mid, n) <= maxSum) {
                left = mid
            } else {
                right = mid - 1
            }
        }
        return left
    }

    private fun getSum(index: Int, value: Int, n: Int): Long {
        var sum = 0L

        // On index's left:
        // If value > index, there are index + 1 numbers in the arithmetic sequence:
        // [value - index, ..., value - 1, value].
        // Otherwise, there are value numbers in the arithmetic sequence:
        // [1, 2, ..., value - 1, value], plus a sequence of length (index - value + 1) of 1s.
        sum += if (value > index) {
            (value + value - index).toLong() * (index + 1) / 2
        } else {
            (value + 1).toLong() * value / 2 + index - value + 1
        }
        // On index's right:
        // If value >= n - index, there are n - index numbers in the arithmetic sequence:
        // [value, value - 1, ..., value - n + 1 + index].
        // Otherwise, there are value numbers in the arithmetic sequence:
        // [value, value - 1, ..., 1], plus a sequence of length (n - index - value) of 1s.
        sum += if (value >= n - index) {
            (value + value - n + 1 + index).toLong() * (n - index) / 2
        } else {
            (value + 1).toLong() * value / 2 + n - index - value
        }
        return sum - value
    }
}