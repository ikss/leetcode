package arrays.medium

/**
 * You are given an array of positive integers arr. Perform some operations (possibly none) on arr so that it satisfies
 * these conditions:
 * * The value of the first element in arr must be 1.
 * * The absolute difference between any 2 adjacent elements must be less than or equal to 1.
 * In other words, `abs(arr[i] - arr[i - 1]) <= 1` for each i where 1 <= i < arr.length (0-indexed).
 * abs(x) is the absolute value of x.
 *
 * There are 2 types of operations that you can perform any number of times:
 * * Decrease the value of any element of arr to a smaller positive integer.
 * * Rearrange the elements of arr to be in any order.
 *
 * Return the maximum possible value of an element in arr after performing the operations to satisfy the conditions.
 *
 * [URL](https://leetcode.com/problems/maximum-element-after-decreasing-and-rearranging/)
 */
object MaximumElementAfterDecreasingAndRearranging {
    fun maximumElementAfterDecrementingAndRearranging(arr: IntArray): Int {
        arr.sort()

        arr[0] = 1
        var result = 1
        for (i in 1 until arr.size) {
            if (arr[i] == arr[i - 1]) continue
            result++
        }
        return result
    }
}