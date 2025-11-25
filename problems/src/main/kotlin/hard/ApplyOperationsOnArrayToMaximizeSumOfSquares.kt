package hard

import java.util.*

/**
 * You are given a 0-indexed integer array nums and a positive integer k.
 *
 * You can do the following operation on the array any number of times:
 *
 * Choose any two distinct indices i and j and simultaneously update the values of
 * `nums[i] to (nums[i] AND nums[j])` and `nums[j] to (nums[i] OR nums[j])`.
 * Here, OR denotes the bitwise OR operation, and AND denotes the bitwise AND operation.
 * You have to choose k elements from the final array and calculate the sum of their squares.
 *
 * Return the maximum sum of squares you can achieve.
 *
 * Since the answer can be very large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/apply-operations-on-array-to-maximize-sum-of-squares/)
 */
object ApplyOperationsOnArrayToMaximizeSumOfSquares {
    fun maxSum(nums: List<Int>, k: Int): Int {
        val count = IntArray(32)
        for (n in nums) {
            for (bit in 0..31) {
                if ((n and (1 shl bit)) != 0) {
                    count[bit]++
                }
            }
        }
        
        var res = 0L
        val mod = 1_000_000_007
        for (pick in 0 until k) {
            var cur = 0L
            for (bit in 0..31) {
                if (count[bit] > 0) {
                    count[bit]--
                    cur += (1 shl bit).toLong()
                }
            }
            res = (res + cur * cur % mod) % mod
        }
        return res.toInt()
    }
}
