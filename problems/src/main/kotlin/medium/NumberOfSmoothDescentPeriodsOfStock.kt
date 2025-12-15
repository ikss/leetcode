package medium

/**
 * You are given an integer array prices representing the daily price history of a stock,
 * where `prices[i]` is the stock price on the ith day.
 *
 * A smooth descent period of a stock consists of one or more contiguous days such that the price on each day is lower
 * than the price on the preceding day by exactly 1. The first day of the period is exempted from this rule.
 *
 * Return the number of smooth descent periods.
 *
 * [URL](https://leetcode.com/problems/number-of-smooth-descent-periods-of-a-stock/)
 */
object NumberOfSmoothDescentPeriodsOfStock {
    fun getDescentPeriods(prices: IntArray): Long {
        var result = 1L
        var curr = 1L

        for (i in 1 until prices.size) {
            result++
            val prev = prices[i - 1]

            if (prev - prices[i] != 1) {
                curr = 1
                continue
            }

            result += curr
            curr++
        }

        return result
    }
}
