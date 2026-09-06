package hard

/**
 * Given two strings s and t, return the number of distinct subsequences of s which equals t.
 *
 * The test cases are generated so that the answer fits on a 32-bit signed integer.
 *
 * [URL](https://leetcode.com/problems/distinct-subsequences/)
 */
object DistinctSubsequences {
    fun numDistinctDp(s: String, t: String): Int {
        val slen = s.length
        val tlen = t.length

        val dp = Array(slen + 1) { IntArray(tlen + 1) }

        for (r in 0..tlen) {
            dp[slen][r] = 0
        }

        for (c in 0..slen) {
            dp[c][tlen] = 1
        }

        // Iterate over the strings in reverse so as to
        // satisfy the way we've modeled our recursive solution
        for (i in slen - 1 downTo 0) {
            for (j in tlen - 1 downTo 0) {
                // Remember, we always need this result
                dp[i][j] = dp[i + 1][j]

                // If the characters match, we add the
                // result of the next recursion call (in this
                // case, the value of a cell in the dp table
                if (s[i] == t[j]) {
                    dp[i][j] += dp[i + 1][j + 1]
                }
            }
        }

        return dp[0][0]
    }

    fun numDistinctDpSpaceOptimized(s: String, t: String): Int {
        val slen = s.length
        val tlen = t.length

        var dp = IntArray(tlen + 1)

        for (c in 0..slen) {
            dp[tlen] = 1
        }

        for (i in slen - 1 downTo 0) {
            val newDp = IntArray(tlen + 1) { dp[it] }
            for (j in tlen - 1 downTo 0) {
                if (s[i] == t[j]) {
                    newDp[j] += dp[j + 1]
                }
            }
            dp = newDp
        }

        return dp[0]
    }
}
