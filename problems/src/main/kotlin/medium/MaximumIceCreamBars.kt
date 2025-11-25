package medium

/**
 * It is a sweltering summer day, and a boy wants to buy some ice cream bars.
 *
 * At the store, there are n ice cream bars. You are given an array costs of length n, where `costs[i]` is the price of
 * the ith ice cream bar in coins. The boy initially has _coins_ coins to spend,
 * and he wants to buy as many ice cream bars as possible.
 *
 * Return the maximum number of ice cream bars the boy can buy with _coins_ coins.
 *
 * Note: The boy can buy the ice cream bars in any order.
 *
 * [URL](https://leetcode.com/problems/maximum-ice-cream-bars/)
 */
object MaximumIceCreamBars {
    fun maxIceCream(costs: IntArray, coins: Int): Int {
        costs.sort()

        var rest = coins
        var result = 0
        for (c in costs) {
            if (c > rest) break
            rest -= c
            result++
        }
        return result
    }
}
