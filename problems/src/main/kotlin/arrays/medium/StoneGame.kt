package arrays.medium

/**
 * Alice and Bob play a game with piles of stones. There are an even number of piles arranged in a row,
 * and each pile has a positive integer number of stones `piles[i]`.
 *
 * The objective of the game is to end with the most stones. The total number of stones across all the piles is odd,
 * so there are no ties.
 *
 * Alice and Bob take turns, with Alice starting first. Each turn, a player takes the entire pile of stones
 * either from the beginning or from the end of the row. This continues until there are no more piles left,
 * at which point the person with the most stones wins.
 *
 * Assuming Alice and Bob play optimally, return true if Alice wins the game, or false if Bob wins.
 *
 * [URL](https://leetcode.com/problems/stone-game/)
 */
object StoneGame {
    fun stoneGameMath(piles: IntArray): Boolean {
        return true
    }

    fun stoneGameDp(piles: IntArray): Boolean {
        val n = piles.size

        val dp = Array(n + 2) { IntArray(n + 2) }
        for (size in 1..n) {
            for (i in 0..n - size) {
                val j = i + size - 1
                val parity = (j + i + n) % 2
                dp[i + 1][j + 1] = if (parity == 1) {
                    maxOf(piles[i] + dp[i + 2][j + 1], piles[j] + dp[i + 1][j])
                } else {
                    maxOf(-piles[i] + dp[i + 2][j + 1], -piles[j] + dp[i + 1][j])
                }
            }

        }
        return dp[1][n] > 0
    }
}
