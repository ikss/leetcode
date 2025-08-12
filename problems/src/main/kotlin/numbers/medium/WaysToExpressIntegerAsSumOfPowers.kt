package numbers.medium

/**
 * Given two positive integers n and x.
 *
 * Return the number of ways n can be expressed as the sum of the xth power of unique positive integers,
 * in other words, the number of sets of unique integers [n1, n2, ..., nk] where n = n1^x + n2^x + ... + nk^x.
 *
 * Since the result can be very large, return it modulo 10^9 + 7.
 *
 * For example, if n = 160 and x = 3, one way to express n is n = 2^3 + 3^3 + 5^3.
 *
 * [URL](https://leetcode.com/problems/count-good-numbers/)
 */
object WaysToExpressIntegerAsSumOfPowers {
    fun numberOfWays(n: Int, x: Int): Int {
        val dp = IntArray(n + 1)

        dp[0] = 1
        dp[1] = 1

        var num = 2
        var pow = Math.pow(num.toDouble(), x.toDouble())

        while (pow <= n) {
            val powInt = pow.toInt()
            for (i in n - powInt downTo 0) {
                if (dp[i] > 0) {
                    dp[i + powInt] += dp[i]
                    dp[i + powInt] %= 1_000_000_007
                }
            }
            num++
            pow = Math.pow(num.toDouble(), x.toDouble())
        }

        return dp[n]
    }
}