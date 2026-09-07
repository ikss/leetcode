package hard

/**
 * Given a string s, return the number of distinct non-empty subsequences of s.
 * Since the answer may be very large, return it modulo 10^9 + 7.
 *
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
 * of the characters without disturbing the relative positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not.
 *
 * [URL](https://leetcode.com/problems/distinct-subsequences-ii/)
 */
object DistinctSubsequencesII {
    fun distinctSubseqII(s: String): Int {
        val mod = 1_000_000_007
        val n = s.length
        val dp = IntArray(n + 1)
        dp[0] = 1

        val last = IntArray(26) { -1 }
        for (i in 0 until n) {
            val x = s[i] - 'a'
            dp[i + 1] = dp[i] * 2 % mod
            if (last[x] >= 0) {
                dp[i + 1] -= dp[last[x]]
            }
            dp[i + 1] %= mod
            last[x] = i
        }
        dp[n]--
        if (dp[n] < 0) dp[n] += mod
        return dp[n]
    }
}
