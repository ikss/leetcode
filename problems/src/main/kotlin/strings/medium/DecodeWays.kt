package strings.medium

/**
 * A message containing letters from A-Z can be encoded into numbers using the following mapping:
 *
 *  * 'A' -> "1"
 *  * 'B' -> "2"
 *  * ...
 *  * 'Z' -> "26"
 *
 * To decode an encoded message, all the digits must be grouped then mapped back into letters using the reverse of the mapping above (there may be multiple ways). For example, "11106" can be mapped into:
 *
 *  * "AAJF" with the grouping (1 1 10 6)
 *  * "KJF" with the grouping (11 10 6)
 * Note that the grouping (1 11 06) is invalid because "06" cannot be mapped into 'F' since "6" is different from "06".
 *
 * Given a string s containing only digits, return the number of ways to decode it.
 *
 * The test cases are generated so that the answer fits in a 32-bit integer.
 *
 * [URL](https://leetcode.com/problems/decode-ways/)
 */
object DecodeWays {
    fun numDecodingsRecursive(s: String): Int {
        if (s.isEmpty()) return 0
        val memo = IntArray(s.length) { -1 }
        return numDecodings(0, s, memo)
    }

    private fun numDecodings(i: Int, s: String, memo: IntArray): Int {
        val length = s.length
        if (i == length) return 1
        if (s[i] == '0') return 0
        if (memo[i] != -1) return memo[i]

        var res = numDecodings(i + 1, s, memo)

        if (i < length - 1 && (s[i] == '1' || (s[i] == '2' && s[i + 1] < '7'))) {
            res += numDecodings(i + 2, s, memo)
        }
        memo[i] = res
        return res
    }

    fun numDecodingsDp(s: String): Int {
        if (s.isEmpty()) return 0
        val n = s.length
        val dp = IntArray(n + 1)
        dp[n] = 1
        for (i in n - 1 downTo 0) {
            if (s[i] == '0') {
                dp[i] = 0
            } else {
                dp[i] = dp[i + 1]
                if (i < n - 1 && (s[i] == '1' || (s[i] == '2' && s[i + 1] < '7'))) {
                    dp[i] += dp[i + 2]
                }
            }
        }
        return dp[0]
    }
}
