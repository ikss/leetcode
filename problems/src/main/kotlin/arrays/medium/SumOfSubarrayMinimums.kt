package arrays.medium

import java.util.*


/**
 * Given an array of integers arr, find the sum of min(b), where b ranges over every (contiguous) subarray of arr.
 * Since the answer may be large, return the answer modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/sum-of-subarray-minimums/)
 */
object SumOfSubarrayMinimums {
    private val MOD = 1_000_000_007

    fun sumSubarrayMinsNaive(arr: IntArray): Int {
        var sum = 0L
        for (size in 1..arr.size) {
            var i = 0
            while (i + size <= arr.size) {
                var min = MOD
                for (j in i until i + size) {
                    min = minOf(min, arr[j])
                }
                i++
                sum += min
            }
        }
        return (sum % MOD).toInt()
    }


    fun sumSubarrayMinsMonotonicStack(arr: IntArray): Int {
        val stack = Stack<Int>()
        var sumOfMinimums = 0L

        // building monotonically increasing stack
        for (i in 0..arr.size) {
            // when i reaches the array length, it is an indication that
            // all the elements have been processed, and the remaining
            // elements in the stack should now be popped out.
            while (!stack.empty() && (i == arr.size || arr[stack.peek()] >= arr[i])) {

                // Notice the sign ">=", This ensures that no contribution
                // is counted twice. rightBoundary takes equal or smaller
                // elements into account while leftBoundary takes only the
                // strictly smaller elements into account
                val mid = stack.pop()
                val leftBoundary = if (stack.empty()) -1 else stack.peek()

                // count of subarrays where mid is the minimum element
                val count = ((mid - leftBoundary) * (i - mid)).toLong()
                sumOfMinimums += count * arr[mid]
            }
            stack.push(i)
        }
        return (sumOfMinimums % MOD).toInt()
    }

    fun sumSubarrayMinsDp(arr: IntArray): Int {
        val stack = Stack<Int>()

        // make a dp array of the same size as the input array `arr`
        val dp = IntArray(arr.size)

        // making a monotonic increasing stack
        for (i in arr.indices) {
            // pop the stack until it is empty or
            // the top of the stack is greater than or equal to
            // the current element
            while (!stack.empty() && arr[stack.peek()] >= arr[i]) {
                stack.pop()
            }

            // either the previousSmaller element exists
            if (stack.size > 0) {
                val previousSmaller = stack.peek()
                dp[i] = dp[previousSmaller] + (i - previousSmaller) * arr[i]
            } else {
                // or it doesn't exist, in this case the current element
                // contributes with all subarrays ending at i
                dp[i] = (i + 1) * arr[i]
            }
            // push the current index
            stack.push(i)
        }

        // Add all elements of the dp to get the answer
        var sumOfMinimums = 0L
        for (count in dp) {
            sumOfMinimums += count
        }
        return (sumOfMinimums % MOD).toInt()
    }
}