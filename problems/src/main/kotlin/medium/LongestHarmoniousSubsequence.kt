package medium

/**
 * We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.
 *
 * Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.
 *
 * [URL](https://leetcode.com/problems/longest-harmonious-subsequence/)
 */
object LongestHarmoniousSubsequence {
    fun findLHS(nums: IntArray): Int {
        val map = HashMap<Int, Int>()

        for (n in nums) {
            map[n] = map.getOrDefault(n, 0) + 1
        }

        var result = 0

        for ((k, v) in map) {
            val prev = map[k - 1]?.let { it + v } ?: 0
            val next = map[k + 1]?.let { it + v } ?: 0
            result = maxOf(result, prev, next)
        }

        return result
    }
}
