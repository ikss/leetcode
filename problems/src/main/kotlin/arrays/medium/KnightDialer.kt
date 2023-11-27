package arrays.medium

/**
 * The chess knight has a unique movement, it may move two squares vertically and one square horizontally,
 * or two squares horizontally and one square vertically (with both forming the shape of an L).
 *
 * We have a chess knight and a phone pad as shown below, the knight can only stand on a numeric cell (i.e. blue cell).
 *
 * Given an integer n, return how many distinct phone numbers of length n we can dial.
 *
 * You are allowed to place the knight on any numeric cell initially and then you should perform n - 1 jumps to dial
 * a number of length n. All jumps should be valid knight jumps.
 *
 * As the answer may be very large, return the answer modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/knight-dialer/)
 */
object KnightDialer {
    private val moves = arrayOf(
        listOf(4, 6),
        listOf(6, 8),
        listOf(7, 9),
        listOf(4, 8),
        listOf(3, 9, 0),
        listOf(),
        listOf(1, 7, 0),
        listOf(2, 6),
        listOf(1, 3),
        listOf(2, 4),
    )

    private const val MOD = 1_000_000_007

    fun knightDialer(n: Int): Int {
        val dp = Array(n) { IntArray(10) }
        for (square in 0 until 10) {
            dp[0][square] = 1
        }

        for (remain in 1 until n) {
            for (square in 0 until 10) {
                var temp = 0
                for (next in moves[square]) {
                    temp = (temp + dp[remain - 1][next]) % MOD
                }
                dp[remain][square] = temp
            }
        }

        var result = 0

        for (square in 0 until 10) {
            result = (result + dp[n - 1][square]) % MOD
        }

        return result
    }
}
