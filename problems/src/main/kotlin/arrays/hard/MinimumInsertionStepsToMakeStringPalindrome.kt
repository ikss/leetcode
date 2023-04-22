package arrays.hard

/**
 * Given an integer array nums, return the number of all the arithmetic subsequences of nums.
 *
 * A sequence of numbers is called arithmetic if it consists of at least three elements and if the difference between
 * any two consecutive elements is the same.
 *
 * Given a string s. In one step you can insert any character at any index of the string.
 *
 * Return the minimum number of steps to make s palindrome.
 *
 * A Palindrome String is one that reads the same backward as well as forward.
 *
 * [URL](https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/)
 */
object MinimumInsertionStepsToMakeStringPalindrome {
    fun minInsertions(s: String): Int {
        return s.length - longestPalindromeSubseq(s)
    }

    private fun longestPalindromeSubseq(s: String): Int {
        val l = s.length
        var dp = IntArray(l)

        for (i in l - 1 downTo 0) {
            val tmp = IntArray(l)
            tmp[i] = 1

            for (j in i + 1 until l) {
                if (s[i] == s[j]) {
                    tmp[j] = dp[j - 1] + 2
                } else {
                    tmp[j] = maxOf(dp[j], tmp[j - 1])
                }
            }
            dp = tmp
        }

        return dp[l - 1]
    }
}
