package hard

/**
 * You are given an even number of people numPeople that stand around a circle and each person shakes hands with someone else so that there are numPeople / 2 handshakes total.
 *
 * Return the number of ways these handshakes could occur such that none of the handshakes cross.
 *
 * Since the answer could be very large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/handshakes-that-dont-cross/)
 */
object HandshakesThatDontCross {
    private val MOD = 1_000_000_007
    fun numberOfWays(numPeople: Int): Int {
        val dp = LongArray(numPeople / 2 + 1)
        dp[0] = 1

        for (n in 1..numPeople / 2) {
            dp[n] = calculateWays(n, dp)
        }
        return dp[numPeople / 2].toInt()
    }

    private fun calculateWays(n: Int, dp: LongArray): Long {
        var ways = 0L
        for (i in 0 until n) {
            ways += dp[i] * dp[n - i - 1]
            ways %= MOD
        }
        return ways
    }
}
