package arrays.medium

/**
 * You are given an array prices where `prices[i]` is the price of a given stock on the ith day,
 * and an integer fee representing a transaction fee.
 *
 * Find the maximum profit you can achieve. You may complete as many transactions as you like,
 * but you need to pay the transaction fee for each transaction.
 *
 * Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
 *
 * [URL](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/)
 */
object BestTimeToBuyAndSellStockWithTransactionFee {
    fun maxProfit(prices: IntArray, fee: Int): Int {
        var sell = 0
        var buy = -prices[0]

        for (p in prices) {
            val tmp = buy
            buy = maxOf(buy, sell - p)
            sell = maxOf(sell, tmp + p - fee)
        }

        return sell
    }
}
