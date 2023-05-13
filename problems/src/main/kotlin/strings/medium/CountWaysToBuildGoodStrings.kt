package strings.medium


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
        // Use dp[i] to record to number of good strings of length i.
        val dp = IntArray(high + 1)
        dp[0] = 1
        val mod = 1000000007

        // Iterate over each length `end`.
        for (end in 1..high) {
            // check if the current string can be made by append zero `0`s or one `1`s.
            if (end >= zero) {
                dp[end] += dp[end - zero]
            }
            if (end >= one) {
                dp[end] += dp[end - one]
            }
            dp[end] %= mod
        }

        // Add up the number of strings with each valid length [low ~ high].
        var answer = 0
        for (i in low..high) {
            answer = (answer + dp[i]) % mod
        }
        return answer
    }
}
