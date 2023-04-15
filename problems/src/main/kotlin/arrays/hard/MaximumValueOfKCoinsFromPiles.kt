package arrays.hard

import java.util.*

/**
 * There are n piles of coins on a table. Each pile consists of a positive number of coins of assorted denominations.
 *
 * In one move, you can choose any coin on top of any pile, remove it, and add it to your wallet.
 *
 * Given a list piles, where `piles[i]` is a list of integers denoting the composition of the ith pile from top to
 * bottom, and a positive integer k, return the maximum total value of coins you can have in your wallet if you choose
 * exactly k coins optimally.
 *
 * [URL](https://leetcode.com/problems/maximum-value-of-k-coins-from-piles/)
 */
object MaximumValueOfKCoinsFromPiles {
    fun maxValueOfCoins(piles: List<List<Int>>, k: Int): Int {
        val n = piles.size
        val dp = Array(n + 1) { IntArray(k + 1) }

        for (i in 1..n) {
            for (coins in 0..k) {
                var curSum = 0
                for (currCoins in 0..minOf(piles[i - 1].size, coins)) {
                    if (currCoins > 0) {
                        curSum += piles[i - 1][currCoins - 1]
                    }
                    dp[i][coins] = maxOf(dp[i][coins], dp[i - 1][coins - currCoins] + curSum)
                }
            }
        }

        return dp[n][k]
    }
}
