package data_structures.arrays.medium


/**
 * You are given an integer array coins representing coins of different denominations
 * and an integer amount representing a total amount of money.
 *
 * Return the fewest number of coins that you need to make up that amount.
 * If that amount of money cannot be made up by any combination of the coins, return -1.
 *
 * You may assume that you have an infinite number of each kind of coin.
 *
 * [URL](https://leetcode.com/problems/coin-change/)
 */
object CoinChange {
    fun coinChange(coins: IntArray, amount: Int): Int {
        val dp = IntArray(amount + 1) { amount + 1 }
        dp[0] = 0
        for (coin in coins) {
            for (i in coin..amount) {
                dp[i] = minOf(dp[i], dp[i - coin] + 1)
            }
        }
        return if (dp[amount] > amount) -1 else dp[amount]
    }
}
