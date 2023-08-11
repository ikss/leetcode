package arrays.medium

/**
 * You are given an integer array coins representing coins of different denominations
 * and an integer amount representing a total amount of money.
 *
 * Return the number of combinations that make up that amount.
 * If that amount of money cannot be made up by any combination of the coins, return 0.
 *
 * You may assume that you have an infinite number of each kind of coin.
 *
 * The answer is guaranteed to fit into a signed 32-bit integer.
 *
 * [URL](https://leetcode.com/problems/coin-change-ii/)
 */
object CoinChangeII {
    private var result = 0

    fun changeBacktrack(amount: Int, coins: IntArray): Int {
        result = 0
        coins.sortDescending()
        backtrack(0, 0, amount, coins)
        return result
    }

    private fun backtrack(currSum: Int, currIndex: Int, amount: Int, coins: IntArray) {
        if (currSum == amount) {
            result++
            return
        } else if (currSum > amount) {
            return
        }
        for (i in currIndex until coins.size) {
            val addedSum = coins[i] + currSum
            if (addedSum > amount) continue
            backtrack(addedSum, i, amount, coins)
        }
    }
    
    fun changeDp(amount: Int, coins: IntArray): Int {
        val n = coins.size
        val dp = Array(n + 1) { IntArray(amount + 1) }
        for (i in 0 until n) {
            dp[i][0] = 1
        }
        for (i in n - 1 downTo 0) {
            val coin = coins[i]
            for (j in 1..amount) {
                if (coin > j) {
                    dp[i][j] = dp[i + 1][j]
                } else {
                    dp[i][j] = dp[i + 1][j] + dp[i][j - coin]
                }
            }
        }

        return dp[0][amount]
    }
}
