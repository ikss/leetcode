package medium

/**
 * You are given a 2D integer array items, where `items[i] = [factori, pricei]` represents the ith item. You are also given an integer budget.
 *
 * There are unlimited copies of each item available for purchase.You may buy any number of copies of any items
 * such that the total cost of the purchased copies is at most budget.
 *
 * After buying items, you may receive free copies according to the following rules:
 * * For each item i that you bought at least one copy of, you receive one free copy of every item j such that
 * j != i and factori divides factorj.
 * * Buying multiple copies of the same item i does not give additional free copies through item i.
 * * The same item j can be received multiple times for free if it is received from purchases of different item types.
 *
 * Return the maximum total number of item copies you can obtain, including both purchased copies and free copies,
 * while spending at most budget on purchased items.
 *
 * [URL](https://leetcode.com/problems/maximum-number-of-items-from-sale-i/)
 */
object MaximumNumberOfItemsFromSaleI {
    fun maximumSaleItems(items: Array<IntArray>, budget: Int): Int {
        val dp = IntArray(budget + 1)
        var minPrice = Int.MAX_VALUE

        for ((factor, price) in items) {
            minPrice = minOf(minPrice, price)
            var cnt = 0
            for (other in items) {
                if (other[0] % factor == 0) {
                    cnt++
                }
            }
            for (j in budget downTo price) {
                dp[j] = maxOf(dp[j], dp[j - price] + cnt)
            }
        }
        var result = 0
        for (j in 0..budget) {
            result = maxOf(result, dp[j] + (budget - j) / minPrice)
        }
        return result
    }
}
