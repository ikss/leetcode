package arrays.hard

/**
 * We can scramble a string s to get a string t using the following algorithm:
 *
 * If the length of the string is 1, stop.
 * If the length of the string is > 1, do the following:
 * * Split the string into two non-empty substrings at a random index, i.e., if the string is s, divide it to x and y
 * where s = x + y.
 * * Randomly decide to swap the two substrings or to keep them in the same order. i.e., after this step, s may become
 * s = x + y or s = y + x.
 * * Apply step 1 recursively on each of the two substrings x and y.
 *
 * Given two strings s1 and s2 of the same length, return true if s2 is a scrambled string of s1, otherwise, return false.
 *
 * [URL](https://leetcode.com/problems/arithmetic-slices-ii-subsequence/)
 */
object ScrambleString {
    fun isScramble(s1: String, s2: String): Boolean {
        val n = s1.length
        val dp = Array(n + 1) { Array(n) { BooleanArray(n) } }

        for (i in 0 until n) {
            for (j in 0 until n) {
                dp[1][i][j] = s1[i] == s2[j]
            }
        }

        for (l in 2..n) {
            for (i in 0 until n + 1 - l) {
                for (j in 0 until n + 1 - l) {
                    for (newLength in 1 until l) {
                        val dp1 = dp[newLength][i]
                        val dp2 = dp[l - newLength][i + newLength]
                        val prev = dp[l][i][j]
                        dp[l][i][j] = prev || (dp1[j] && dp2[j + newLength]) || (dp1[j + l - newLength] && dp2[j])
                    }
                }
            }
        }

        return dp[n][0][0]
    }
}
