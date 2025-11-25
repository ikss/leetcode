package medium

/**
 * Given a binary string s, return the number of substrings with all characters 1's.
 * Since the answer may be too large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/number-of-substrings-with-only-1s/)
 */
object NumberOfSubstringsWithOnly1s {
    fun numSub(s: String): Int {
        var result = 0

        var curr = 0
        for (c in s) {
            if (c == '1') {
                curr++
                result += curr
                result %= 1_000_000_007
            } else {
                curr = 0
            }
        }

        return result
    }
}