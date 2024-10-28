package arrays.medium

/**
 * You are given an integer array nums. A subsequence of nums is called a square streak if:
 * * The length of the subsequence is at least 2, and
 * after sorting the subsequence, each element (except the first element) is the square of the previous number.
 * * Return the length of the longest square streak in nums, or return -1 if there is no square streak.
 *
 * A subsequence is an array that can be derived from another array by deleting
 * some or no elements without changing the order of the remaining elements.
 *
 * [URL](https://leetcode.com/problems/longest-square-streak-in-an-array/)
 */
object LongestSquareStreakInAnArray {
    fun longestSquareStreak(nums: IntArray): Int {
        nums.sort()
        val streaks = HashMap<Int, Int>()
        var longestStreak = 0
        for (i in nums.size - 1 downTo 0) {
            val n = nums[i]
            val square = n * n
            val count = streaks.getOrDefault(square, 0)
            streaks[n] = count + 1
            longestStreak = maxOf(longestStreak, count + 1)
        }

        return if (longestStreak > 1) longestStreak else -1
    }
}
