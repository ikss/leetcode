package arrays.medium

/**
 * You are given the array nums consisting of n positive integers. You computed the sum of all non-empty continuous
 * subarrays from the array and then sorted them in non-decreasing order, creating a new array of n * (n + 1) / 2 numbers.
 *
 * Return the sum of the numbers from index left to index right (indexed from 1), inclusive, in the new array.
 * Since the answer can be a huge number return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/range-sum-of-sorted-subarray-sums//)
 */
object RangeSumOfSortedSubarraySums {
    fun rangeSum(nums: IntArray, n: Int, left: Int, right: Int): Int {
        val subs = IntArray(n * (n + 1) / 2)

        var index = 0
        for (i in 0 until n) {
            subs[index++] = nums[i]
            for (j in i + 1 until n) {
                subs[index] = subs[index - 1] + nums[j]
                index++
            }
        }
        subs.sort()

        var result = 0
        for (i in left .. right) {
            result = (result + subs[i - 1]) % 1_000_000_007
        }
        return result
    }
}
