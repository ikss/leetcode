package arrays.easy

/**
 * You are given an array prices where `prices[i]` is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the
 * future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 * [URL](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
 */
object BestTimeToBuyAndSellStocks {

    fun maxProfitSimple(prices: IntArray): Int {
        var minLeft = prices[0]
        var maxProfit = 0
        for (i in 1 until prices.size) {
            maxProfit = maxOf(maxProfit, prices[i] - minLeft)
            minLeft = minOf(minLeft, prices[i])
        }
        return maxProfit
    }

    // Kadane algorithm for max subarray problem https://en.wikipedia.org/wiki/Maximum_subarray_problem
    fun maxProfitKadane(prices: IntArray): Int {
        var maxCur = 0
        var maxProfit = 0
        for (i in 1 until prices.size) {
            maxCur += prices[i] - prices[i - 1]
            maxCur = maxOf(0, maxCur)
            maxProfit = maxOf(maxCur, maxProfit)
        }
        return maxProfit
    }
}
