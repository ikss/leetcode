package data_structures.arrays.hard

import java.util.*

/**
 * You are given an integer array nums and an integer goal.
 *
 *You want to choose a subsequence of nums such that the sum of its elements is the closest possible to goal.
 *That is, if the sum of the subsequence's elements is sum,
 *then you want to minimize the absolute difference abs(sum - goal).
 *
 *Return the minimum possible value of abs(sum - goal).
 *
 *Note that a subsequence of an array is an array formed by removing some elements (possibly all or none)
 *of the original array.
 *
 * [URL](https://leetcode.com/problems/closest-subsequence-sum/submissions/)
 */
object ClosestSubsequenceSum {
    fun minAbsDifference(nums: IntArray, goal: Int): Int {
        val n = nums.size

        val first = mutableListOf<Int>()
        val second = mutableListOf<Int>()

        // generate all sums for first half
        generate(nums, 0, n / 2, 0, first)
        // generate all sums for second half
        generate(nums, n / 2, n, 0, second)

        first.sort()
        var ans = Int.MAX_VALUE

        for (secondSetSum in second) {
            val diff = goal - secondSetSum
            // all subset sums from first half are too big => Choose the smallest
            if (first[0] > diff) {
                ans = minOf(ans, Math.abs(first[0] - diff))
                continue
            }
            // all subset sums from first half are too small => Choose the largest
            if (first[first.size - 1] < diff) {
                ans = minOf(ans, Math.abs(first[first.size - 1] - diff))
                continue
            }
            val pos = Collections.binarySearch(first, diff)

            // found exact match
            if (pos >= 0) {
                return 0
            }
            val highPos = -1 * (pos + 1)
            val lowPos = highPos - 1
            // Checking for the floor value (largest sum < goal)
            ans = minOf(ans, Math.abs(secondSetSum + first[lowPos] - goal))
            //Checking for the ceiling value (smallest sum > goal)
            ans = minOf(ans, Math.abs(secondSetSum + first[highPos] - goal))
        }
        return ans
    }

    private fun generate(nums: IntArray, i: Int, end: Int, sum: Int, list: MutableList<Int>) {
        if (i == end) {
            list.add(sum) //add
            return
        }
        generate(nums, i + 1, end, sum + nums[i], list)
        generate(nums, i + 1, end, sum, list)
    }
}
