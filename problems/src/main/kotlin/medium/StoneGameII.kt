package medium

/**
 * Alice and Bob continue their games with piles of stones. There are a number of piles arranged in a row,
 * and each pile has a positive integer number of stones `piles[i]`.
 * The objective of the game is to end with the most stones.
 *
 * Alice and Bob take turns, with Alice starting first. Initially, M = 1.
 *
 * On each player's turn, that player can take all the stones in the first X remaining piles, where 1 <= X <= 2M.
 * Then, we set M = max(M, X).
 *
 * The game continues until all the stones have been taken.
 *
 * Assuming Alice and Bob play optimally, return the maximum number of stones Alice can get.
 *
 * [URL](https://leetcode.com/problems/stone-game-ii/)
 */
object StoneGameII {
    fun stoneGameIIRecursive(piles: IntArray): Int {
        val suffixSum = piles.copyOf()
        for (i in suffixSum.size - 2 downTo 0) {
            suffixSum[i] += suffixSum[i + 1]
        }
        val dp = Array(piles.size) { IntArray(piles.size) }
        return dfs(0, 1, suffixSum, dp)
    }

    private fun dfs(pile: Int, m: Int, suffixSum: IntArray, memo: Array<IntArray>): Int {
        if (pile + 2 * m >= suffixSum.size) { // last player takes all
            return suffixSum[pile]
        }
        if (memo[pile][m] > 0) return memo[pile][m]
        var result = 0
        for (i in 1..2 * m) {
            // current take
            // take max of current + what lefts from other player max take
            result = maxOf(result, suffixSum[pile] - dfs(pile + i, maxOf(i, m), suffixSum, memo))
        }
        memo[pile][m] = result
        return result
    }

    fun stoneGameIIdp(piles: IntArray): Int {
        val n = piles.size

        val suffixSum = IntArray(n + 1)
        for (i in n - 1 downTo 0) {
            suffixSum[i] = suffixSum[i + 1] + piles[i]
        }

        val dp = Array(n + 1) { IntArray(n + 1) }

        for (i in 0..n) {
            dp[i][n] = suffixSum[i]
        }

        for (i in n - 1 downTo 0) {
            for (m in n - 1 downTo 1) {
                for (x in 1..2 * m) {
                    if (i + x > n) break

                    dp[i][m] = maxOf(dp[i][m], suffixSum[i] - dp[i + x][maxOf(m, x)])
                }
            }
        }

        return dp[0][1]
    }
}
