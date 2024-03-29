package strings.medium

/**
 * Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.
 *
 * An interleaving of two strings s and t is a configuration where they are divided into non-empty substrings such that:
 *
 * * s = s1 + s2 + ... + sn
 * * t = t1 + t2 + ... + tm
 * * |n - m| <= 1
 * * The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or t1 + s1 + t2 + s2 + t3 + s3 + ...
 *
 * Note: a + b is the concatenation of strings a and b.
 *
 * [URL](https://leetcode.com/problems/interleaving-string/)
 */
object InterleavingString {
    fun isInterleaveDp(s1: String, s2: String, s3: String): Boolean {
        if (s1.length + s2.length != s3.length) {
            return false
        }

        val dp = Array(s1.length + 1) { BooleanArray(s2.length + 1) }

        for (i in 0..s1.length) {
            for (j in 0..s2.length) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1] && s2[j - 1] == s3[j - 1]
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] && s1[i - 1] == s3[i - 1]
                } else {
                    val firstStrInterleave = dp[i - 1][j] && s1[i - 1] == s3[i + j - 1]
                    val secondStrInterleave = dp[i][j - 1] && s2[j - 1] == s3[i + j - 1]
                    dp[i][j] = firstStrInterleave || secondStrInterleave
                }
            }
        }
        return dp[s1.length][s2.length]
    }

    fun isInterleaveDpSpaceOptimized(s1: String, s2: String, s3: String): Boolean {
        if (s1.length + s2.length != s3.length) {
            return false
        }
        var dp = BooleanArray(s2.length + 1)

        for (i in 0..s1.length) {
            val temp = BooleanArray(s2.length + 1)
            for (j in 0..s2.length) {
                temp[j] = if (i == 0 && j == 0) {
                    true
                } else if (i == 0) {
                    temp[j - 1] && s2[j - 1] == s3[j - 1]
                } else if (j == 0) {
                    dp[j] && s1[i - 1] == s3[i - 1]
                } else {
                    (dp[j] && s1[i - 1] == s3[i + j - 1]) || (temp[j - 1] && s2[j - 1] == s3[i + j - 1])
                }
            }
            dp = temp
        }
        return dp[s2.length]
    }
}
