package hard

/**
 * There is a strange printer with the following two special properties:
 *
 * The printer can only print a sequence of the same character each time.
 * At each turn, the printer can print new characters starting from and ending at any place
 * and will cover the original existing characters.
 * Given a string s, return the minimum number of turns the printer needed to print it.
 *
 * [URL](https://leetcode.com/problems/strange-printer/)
 */
object StrangePrinter {
    fun strangePrinter(s: String): Int {
        val n = s.length
        val dp = Array(n) { IntArray(n) { Int.MAX_VALUE } }

        return solve(s, n, 0, n - 1, dp) + 1
    }

    private fun solve(s: String, n: Int, left: Int, right: Int, dp: Array<IntArray>): Int {
        if (dp[left][right] != Int.MAX_VALUE) {
            return dp[left][right]
        }

        var i = -1
        for (j in left until right) {
            if (i == -1 && s[j] != s[right]) {
                i = j
            }
            if (i != -1) {
                dp[left][right] = minOf(
                    dp[left][right], 1 + solve(s, n, i, j, dp) + solve(s, n, j + 1, right, dp)
                )
            }
        }

        if (i == -1) {
            dp[left][right] = 0
        }

        return dp[left][right]
    }
}