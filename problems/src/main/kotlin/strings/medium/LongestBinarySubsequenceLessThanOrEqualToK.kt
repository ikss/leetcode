package strings.medium

import kotlin.math.ln

/**
 * You are given a binary string s and a positive integer k.
 *
 * Return the length of the longest subsequence of s that makes up a binary number less than or equal to k.
 *
 * Note:
 * * The subsequence can contain leading zeroes.
 * * The empty string is considered to be equal to 0.
 * * A subsequence is a string that can be derived from another string by deleting some or no characters without
 * changing the order of the remaining characters.

 *
 * [URL](https://leetcode.com/problems/longest-binary-subsequence-less-than-or-equal-to-k/)
 */
object LongestBinarySubsequenceLessThanOrEqualToK {

    fun longestSubsequence(s: String, k: Int): Int {
        var sm = 0
        var cnt = 0
        val bits = (ln(k.toDouble()) / ln(2.0)).toInt() + 1
        for (i in s.indices) {
            val ch = s[s.length - 1 - i]
            if (ch == '1') {
                if (i < bits && sm + (1 shl i) <= k) {
                    sm += 1 shl i
                    cnt++
                }
            } else {
                cnt++
            }
        }
        return cnt
    }
}