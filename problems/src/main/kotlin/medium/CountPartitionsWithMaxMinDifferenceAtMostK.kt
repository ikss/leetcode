package medium

import java.util.TreeMap

/**
 * You are given an integer array nums and an integer k.
 * Your task is to partition nums into one or more non-empty contiguous segments such that in each segment,
 * the difference between its maximum and minimum elements is at most k.
 *
 * Return the total number of ways to partition nums under this condition.
 *
 * Since the answer may be too large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/count-partitions-with-max-min-difference-at-most-k/)
 */
object CountPartitionsWithMaxMinDifferenceAtMostK {
    fun countPartitions(nums: IntArray, k: Int): Int {
        val n = nums.size
        val mod = 1e9.toLong() + 7
        val dp = LongArray(n + 1)
        val prefix = LongArray(n + 1)
        val cnt = TreeMap<Int, Int>()

        dp[0] = 1
        prefix[0] = 1
        var i = 0
        var j = 0
        while (i < n) {
            cnt[nums[i]] = cnt.getOrDefault(nums[i], 0) + 1
            // adjust window
            while (j <= i && cnt.lastKey()!! - cnt.firstKey()!! > k) {
                cnt[nums[j]] = cnt.get(nums[j])!! - 1
                if (cnt.get(nums[j]) == 0) {
                    cnt.remove(nums[j])
                }
                j++
            }

            dp[i + 1] = (prefix[i] - (if (j > 0) prefix[j - 1] else 0) + mod) % mod
            prefix[i + 1] = (prefix[i] + dp[i + 1]) % mod
            i++
        }

        return dp[n].toInt()
    }
}
