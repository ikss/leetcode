package arrays.medium


/**
 * Alice and Bob continue their games with piles of stones. There are several stones arranged in a row,
 * and each stone has an associated value which is an integer given in the array stoneValue.
 *
 * Alice and Bob take turns, with Alice starting first. On each player's turn, that player can take 1, 2, or 3
 * stones from the first remaining stones in the row.
 *
 * The score of each player is the sum of the values of the stones taken. The score of each player is 0 initially.
 *
 * The objective of the game is to end with the highest score, and the winner is the player with the highest score
 * and there could be a tie. The game continues until all the stones have been taken.
 *
 * Assume Alice and Bob play optimally.
 *
 * Return "Alice" if Alice will win, "Bob" if Bob will win, or "Tie" if they will end the game with the same score.
 *
 * [URL](https://leetcode.com/problems/stone-game-iii/)
 */
object StoneGameIII {
    fun stoneGameIII(stoneValue: IntArray): String {
        val n = stoneValue.size

        val dp = IntArray(n + 1)

        for (i in n - 1 downTo 0) {
            // take one
            dp[i] = stoneValue[i] - dp[i + 1]
            // take two
            if (i + 2 <= n) {
                dp[i] = maxOf(dp[i], stoneValue[i] + stoneValue[i + 1] - dp[i + 2])
            }
            // take three
            if (i + 3 <= n) {
                dp[i] = maxOf(dp[i], stoneValue[i] + stoneValue[i + 1] + stoneValue[i + 2] - dp[i + 3])
            }
        }
        return when {
            dp[0] > 0 -> "Alice"
            dp[0] < 0 -> "Bob"
            else -> "Tie"
        }
    }
}
