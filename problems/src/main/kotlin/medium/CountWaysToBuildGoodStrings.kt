package medium

/**
 * Given the integers zero, one, low, and high, we can construct a string by starting with an empty string,
 * and then at each step perform either of the following:
 * * Append the character '0' zero times.
 * * Append the character '1' one times.
 * * This can be performed any number of times.
 *
 * A good string is a string constructed by the above process having a length between low and high (inclusive).
 *
 * Return the number of different good strings that can be constructed satisfying these properties.
 * Since the answer can be large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/count-ways-to-build-good-strings/)
 */
object CountWaysToBuildGoodStrings {
    fun countGoodStrings(low: Int, high: Int, zero: Int, one: Int): Int {
        val dp = IntArray(high + 1)
        val mod = 1000000007
        dp[0] = 1

        for (i in 1 .. high) {
            if (i >= zero) {
                dp[i] += dp[i - zero]
                dp[i] %= mod
            }
            if (i >= one) {
                dp[i] += dp[i - one]
                dp[i] %= mod
            }
        }

        var result = 0

        for (i in low .. high) {
            result += dp[i]
            result %= mod
        }

        return result
    }
}
