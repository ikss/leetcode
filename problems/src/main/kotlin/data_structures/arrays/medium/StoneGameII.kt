package data_structures.arrays.medium

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
    fun stoneGameII(piles: IntArray): Int {
        if (piles.isEmpty()) return 0

        // cache[i][j] is the max number of stones a player can get when the first pile is piles[i] and M == j.
        val cache = Array(piles.size) { IntArray(piles.size) }
        // suffixSum[i] starting from i sum up everything to the right: sum(piles[i, piles.length - 1])
        val suffixSum = IntArray(piles.size)
        suffixSum[suffixSum.size - 1] = piles[piles.size - 1]
        for (i in piles.size - 2 downTo 0) {
            suffixSum[i] = piles[i] + suffixSum[i + 1]
        }
        return helper(piles, suffixSum, cache, 0, 1)
    }

    // dfs with memoization
    private fun helper(piles: IntArray, suffixSum: IntArray, cache: Array<IntArray>, firstPile: Int, M: Int): Int {
        if (firstPile == piles.size) return 0 // no more piles left
        // Number of remaining piles is <= than the number of piles we can take in the current turn 2*M.
        // We just take all remaining piles.
        if (piles.size - firstPile <= 2 * M) return suffixSum[firstPile]
        if (cache[firstPile][M] != 0) return cache[firstPile][M]
        var result = 0
        // Try out all possible next moves, store the max amount of stones we can get
        for (x in 1..2 * M) {
            // suffixSum[firstPile] is the total number of stones left in the game, it's the maximum possible gain.
            // helper(...) is the max amount of stones the next player can get if we make the current move x.
            // We want to make the move that minimizes the final gain of the next player, this move maximizes our own final gain.
            result = maxOf(result, suffixSum[firstPile] - helper(piles, suffixSum, cache, firstPile + x, maxOf(M, x)))
        }
        cache[firstPile][M] = result
        return result
    }
}
