package arrays.medium

import java.util.*

/**
 * You are given a 0-indexed integer array nums and an integer p.
 * Find p pairs of indices of nums such that the maximum difference amongst all the pairs is minimized.
 * Also, ensure no index appears more than once amongst the p pairs.
 *
 * Note that for a pair of elements at the index i and j, the difference of this pair is `|nums[i] - nums[j]|`,
 * where |x| represents the absolute value of x.
 *
 * Return the minimum maximum difference among all p pairs. We define the maximum of an empty set to be zero.
 *
 * [URL](https://leetcode.com/problems/bag-of-tokens/)
 */
object MinimizeTheMaximumDifferenceOfPairs {
    fun minimizeMax(nums: IntArray, p: Int): Int {
        if (p == 0) return 0
        nums.sort()

        var left = 0
        var right = nums[nums.size - 1] - nums[0]

        var result = Int.MAX_VALUE
        while (left <= right) {
            val mid = left + (right - left) / 2

            if (enoughPairs(nums, p, mid)) {
                result = mid
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return result
    }

    private fun enoughPairs(nums: IntArray, p: Int, goal: Int): Boolean {
        var count = 0
        var i = 0
        while (i < nums.size - 1) {
            if (nums[i + 1] - nums[i] <= goal) {
                count++
                if (count >= p) return true
                i++
            }
            i++
        }
        return false
    }
}