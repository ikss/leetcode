package medium

/**
 * You are given a binary string s. You are allowed to perform two types of operations on the string in any sequence:
 *
 * * Type-1: Remove the character at the start of the string s and append it to the end of the string.
 * * Type-2: Pick any character in s and flip its value, i.e., if its value is '0' it becomes '1' and vice-versa.
 * 
 * Return the minimum number of type-2 operations you need to perform such that s becomes alternating.
 *
 * The string is called alternating if no two adjacent characters are equal.
 *
 * * For example, the strings "010" and "1010" are alternating, while the string "0100" is not.
 *
 * [URL](https://leetcode.com/problems/minimum-number-of-flips-to-make-the-binary-string-alternating/)
 */
object MinimumNumberOfFlipsToMakeTheBinaryStringAlternating {
    fun minFlips(s: String): Int {
        val n = s.length
        val pre = Array(n) { IntArray(2) }

        for (i in 0..<n) {
            val ch = s[i]
            // Compute the prefix array
            pre[i][0] = (if (i == 0) 0 else pre[i - 1][1]) + (if (ch == '1') 1 else 0)
            pre[i][1] = (if (i == 0) 0 else pre[i - 1][0]) + (if (ch == '0') 1 else 0)
        }

        var ans = minOf(pre[n - 1][0], pre[n - 1][1])
        // If the length is odd, consider the move operation
        if (n % 2 == 1) {
            val suf = Array(n) { IntArray(2) }
            for (i in n - 1 downTo 0) {
                val ch = s[i]
                // Suffix Array Construction
                suf[i][0] = (if (i == n - 1) 0 else suf[i + 1][1]) + (if (ch == '1') 1 else 0)
                suf[i][1] = (if (i == n - 1) 0 else suf[i + 1][0]) + (if (ch == '0') 1 else 0)
            }

            // Traverse all split points
            for (i in 0..<n - 1) {
                ans = minOf(ans, pre[i][0] + suf[i + 1][0], pre[i][1] + suf[i + 1][1])
            }
        }

        return ans
    }
}