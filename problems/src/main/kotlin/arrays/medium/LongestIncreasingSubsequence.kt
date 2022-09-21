package arrays.medium

/**
 * Given an integer array nums, return the length of the longest strictly increasing subsequence.
 *
 * A subsequence is a sequence that can be derived from an array by deleting some or no elements without changing
 * the order of the remaining elements. For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7].
 *
 * [URL](https://leetcode.com/problems/longest-increasing-subsequence/)
 */
object LongestIncreasingSubsequence {
    fun lengthOfLIS(nums: IntArray): Int {
        val piles = IntArray(nums.size)
        var size = 0
        for (num in nums) {
            var i = 0
            var j = size
            while (i != j) {
                val m = (i + j) / 2
                if (piles[m] < num) {
                    i = m + 1
                } else {
                    j = m
                }
            }
            piles[i] = num
            if (i == size) {
                size++
            }
        }
        return size
    }
}
