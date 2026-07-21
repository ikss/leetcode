package medium

/**
 * You are given a binary string s of length n, where:
 *
 * * '1' represents an active section.
 * * '0' represents an inactive section.
 * You can perform at most one trade to maximize the number of active sections in s. In a trade, you:
 *
 * * Convert a contiguous block of '1's that is surrounded by '0's to all '0's.
 * * Afterward, convert a contiguous block of '0's that is surrounded by '1's to all '1's.
 *
 * Return the maximum number of active sections in s after making the optimal trade.
 *
 * Note: Treat s as if it is augmented with a '1' at both ends, forming t = '1' + s + '1'.
 * The augmented '1's do not contribute to the final count.
 *
 * [URL](https://leetcode.com/problems/maximize-active-section-with-trade-i/)
 */
object MaximizeActiveSectionWithTradeI {
    fun maxActiveSectionsAfterTrade(s: String): Int {
        val n = s.length
        var countOnes = 0
        for (c in s) {
            if (c == '1') countOnes++
        }

        var maxZeroesSum = 0
        var prev = -1
        var cur = 0

        var i = 0
        while (i < n) {
            val start = i
            while (i < n && s[i] == s[start]) {
                i++
            }
            if (s[start] == '0') {
                cur = i - start
                if (prev != -1) {
                    maxZeroesSum = maxOf(maxZeroesSum, prev + cur)
                }
                prev = cur
            }
        }

        return countOnes + maxZeroesSum
    }
}