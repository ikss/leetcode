package arrays.medium

/**
 * You have two types of tiles: a 2 x 1 domino shape and a tromino shape. You may rotate these shapes.
 *
 * Given an integer n, return the number of ways to tile an 2 x n board.
 * Since the answer may be very large, return it modulo 10^9 + 7.
 *
 * In a tiling, every square must be covered by a tile. Two tilings are different if and only if there are two
 * 4-directionally adjacent cells on the board such that exactly one of the tilings has both squares occupied by a tile.
 *
 * [URL](https://leetcode.com/problems/domino-and-tromino-tiling/)
 */
object DominoAndTrominoTiling {
    private val MOD = 1_000_000_007

    fun numTilingsDp(n: Int): Int {
        if (n == 1) return 1
        if (n == 2) return 2
        val dp = IntArray(n + 1)
        dp[0] = 1
        dp[1] = 1
        dp[2] = 2
        for (i in 3..n) {
            dp[i] = (dp[i - 1] * 2 % MOD + dp[i - 3]) % MOD
        }
        return dp[n]
    }

    fun numTilings(n: Int): Int {
        var a = 0
        var b = 1
        var c = 1
        repeat(n - 1) {
            val temp = (c * 2 % MOD + a) % MOD
            a = b
            b = c
            c = temp
        }
        return c
    }
}
