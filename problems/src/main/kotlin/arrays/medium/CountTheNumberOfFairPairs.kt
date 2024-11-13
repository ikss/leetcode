package arrays.medium

import java.util.*

/**
 * Given a 0-indexed integer array nums of size n and two integers lower and upper, return the number of fair pairs.
 *
 * A pair (i, j) is fair if:
 * * 0 <= i < j < n, and
 * * lower <= nums[i] + nums[j] <= upper
 *
 * [URL](https://leetcode.com/problems/count-the-number-of-fair-pairs/)
 */
object CountTheNumberOfFairPairs {
    fun countFairPairsTreeMap(nums: IntArray, lower: Int, upper: Int): Long {
        nums.sort()
        val map = TreeMap<Int, Int>()
        var curr = 1
        for (n in nums) {
            map[n] = curr++
        }

        var result = 0L

        for (n in nums) {
            var left = map.floorEntry(lower - n - 1)?.value ?: 0
            if (n <= lower - n - 1) {
                left--
            }
            var right = map.floorEntry(upper - n)?.value ?: 0
            if (n <= upper - n) {
                right--
            }
            result += right - left
        }

        return result / 2
    }

    fun countFairPairsTwoPointers(nums: IntArray, lower: Int, upper: Int): Long {
        nums.sort()
        return lowerBound(nums, upper + 1) - lowerBound(nums, lower)
    }

    private fun lowerBound(nums: IntArray, value: Int): Long {
        var left = 0
        var right = nums.size - 1
        var result = 0L
        
        while (left < right) {
            val sum = nums[left] + nums[right]
            if (sum < value) {
                result += right - left
                left++
            } else {
                right--
            }
        }

        return result
    }
}
