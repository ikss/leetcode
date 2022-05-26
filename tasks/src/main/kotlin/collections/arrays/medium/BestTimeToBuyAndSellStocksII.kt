package collections.arrays.medium

/**
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 *
 * On each day, you may decide to buy and/or sell the stock.
 * You can only hold at most one share of the stock at any time.
 * However, you can buy it then immediately sell it on the same day.
 *
 * Find and return the maximum profit you can achieve.
 *
 * [URL](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/)
 */
object BestTimeToBuyAndSellStocksII {
    fun maxProfit(prices: IntArray): Int {
        var result = 0
        var start = Int.MAX_VALUE
        var end = Int.MIN_VALUE
        for (i in prices.indices) {
            if (prices[i] < end) {
                result += end - start
                start = prices[i]
                end = Int.MIN_VALUE
            } else if (prices[i] < start) {
                start = prices[i]
            } else if (prices[i] > end) {
                end = prices[i]
            }

        }
        if (end > start) {
            result += end - start
        }
        return result
    }
}
