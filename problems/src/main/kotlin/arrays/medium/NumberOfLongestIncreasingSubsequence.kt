package arrays.medium

/**
 * Given an integer array nums, return the number of longest increasing subsequences.
 *
 * Notice that the sequence has to be strictly increasing.
 *
 * [URL](https://leetcode.com/problems/number-of-longest-increasing-subsequence/)
 */
object NumberOfLongestIncreasingSubsequence {
    fun findNumberOfLIS(nums: IntArray): Int {
        val n = nums.size
        val length = IntArray(n) { 1 }
        val count = IntArray(n) { 1 }

        for (i in 0 until n) {
            for (j in 0 until i) {
                if (nums[j] < nums[i]) {
                    if (length[j] + 1 > length[i]) {
                        length[i] = length[j] + 1
                        count[i] = 0
                    }
                    if (length[j] + 1 == length[i]) {
                        count[i] += count[j]
                    }
                }
            }
        }
        val maxLength = length.max()
        var result = 0

        for (i in 0 until n) {
            if (length[i] == maxLength) {
                result += count[i]
            }
        }

        return result
    }
}