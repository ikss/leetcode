package arrays.hard

/**
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day, and an integer k.
 *
 * Find the maximum profit you can achieve. You may complete at most k transactions.
 *
 * Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
 *
 * [URL](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/)
 */
object BestTimeToBuyAndSellStocksIV {
    fun maxProfit(k: Int, prices: IntArray): Int {
        if (k == 0) {
            return 0
        }
        val buy = IntArray(k) { Int.MIN_VALUE }
        val sell = IntArray(k)
        for (price in prices) {
            buy[0] = maxOf(buy[0], -price)
            sell[0] = maxOf(sell[0], buy[0] + price)
            for (j in 1 until k) {
                buy[j] = maxOf(buy[j], sell[j - 1] - price)
                sell[j] = maxOf(sell[j], buy[j] + price)
            }
        }
        return sell[k - 1]
    }
}
