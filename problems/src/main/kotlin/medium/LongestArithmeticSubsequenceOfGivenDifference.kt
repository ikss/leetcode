package medium

/**
 * Given an integer array arr and an integer difference, return the length of the longest subsequence in arr which is
 * an arithmetic sequence such that the difference between adjacent elements in the subsequence equals difference.
 *
 * A subsequence is a sequence that can be derived from arr by deleting some or no elements without changing the order
 * of the remaining elements.
 *
 * [URL](https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference/)
 */
object LongestArithmeticSubsequenceOfGivenDifference {
    fun longestSubsequence(arr: IntArray, difference: Int): Int {
        val dp = HashMap<Int, Int>()
        var result = 1

        for (elem in arr) {
            val oldVal = dp.getOrDefault(elem - difference, 0)
            dp[elem] = oldVal + 1
            result = maxOf(result, oldVal + 1)
        }

        return result
    }
}