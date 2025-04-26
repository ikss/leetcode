package arrays.easy

/**
 * You are given an array of integers nums. Return the length of the longest subarray of nums which is either strictly
 * increasing or strictly decreasing
 *
 * [URL](https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/)
 */
object LongestStrictlyIncreasingOrStrictlyDecreasingSubarray {
    fun longestMonotonicSubarray(nums: IntArray): Int {
        var result = 1
        var direction = 0
        var curr = 0

        for (i in 1 until nums.size) {
            val newDirection = nums[i].compareTo(nums[i - 1])

            if (newDirection == 0) {
                curr = 1
            } else if (direction == newDirection) {
                curr++
            } else {
                curr = 2
            }
            direction = newDirection
            result = maxOf(result, curr)
        }


        return result
    }
}
