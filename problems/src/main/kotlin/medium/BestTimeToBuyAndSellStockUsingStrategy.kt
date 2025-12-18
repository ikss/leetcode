package medium

/**
 * You are given two integer arrays prices and strategy, where:
 *
 * * `prices[i]` is the price of a given stock on the ith day.
 * * `strategy[i]` represents a trading action on the ith day, where:
 *   * -1 indicates buying one unit of the stock.
 *   * 0 indicates holding the stock.
 *   * 1 indicates selling one unit of the stock.
 *
 * You are also given an even integer k, and may perform at most one modification to strategy. A modification consists of:
 *
 * * Selecting exactly k consecutive elements in strategy.
 * * Set the first k / 2 elements to 0 (hold).
 * * Set the last k / 2 elements to 1 (sell).
 *
 * The profit is defined as the sum of `strategy[i] * prices[i]` `across all days.
 *
 * Return the maximum possible profit you can achieve.
 *
 * Note: There are no constraints on budget or stock ownership,
 * so all buy and sell operations are feasible regardless of past actions.
 *
 * [URL](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-using-strategy/)
 */
object BestTimeToBuyAndSellStockUsingStrategy {
    fun maxProfit(prices: IntArray, strategy: IntArray, k: Int): Long {
        val n = prices.size
        val oldProfit = LongArray(n)

        var curr = 0L
        for (i in prices.indices) {
            curr += prices[i] * strategy[i]
            oldProfit[i] = curr
        }
        val end = oldProfit[n - 1]
        var max = oldProfit[n - 1]

        var delta = 0L
        for (i in 0 until n) {
            if (i < k) {
                if (i < k / 2) {
                    if (strategy[i] != 0) {
                        delta -= prices[i] * strategy[i]
                    }
                } else {
                    if (strategy[i] != 1) {
                        delta += prices[i] * if (strategy[i] == 0) 1 else 2
                    }
                }
                continue
            }
            max = maxOf(max, end + delta)
            if (strategy[i - k] != 0) {
                delta += prices[i - k] * strategy[i - k]
            }
            delta -= prices[i - (k / 2)]
            if (strategy[i] != 1) {
                delta += prices[i] * if (strategy[i] == 0) 1 else 2
            }
        }
        max = maxOf(max, end + delta)

        return max
    }
}
