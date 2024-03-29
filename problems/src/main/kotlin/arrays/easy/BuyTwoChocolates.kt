package arrays.easy

/**
 * You are given an integer array prices representing the prices of various chocolates in a store.
 * You are also given a single integer money, which represents your initial amount of money.
 *
 * You must buy exactly two chocolates in such a way that you still have some non-negative leftover money.
 * You would like to minimize the sum of the prices of the two chocolates you buy.
 *
 * Return the amount of money you will have leftover after buying the two chocolates.
 * If there is no way for you to buy two chocolates without ending up in debt, return money.
 * Note that the leftover must be non-negative.
 *
 * [URL](https://leetcode.com/problems/buy-two-chocolates/)
 */
object BuyTwoChocolates {
    fun buyChoco(prices: IntArray, money: Int): Int {
        var min1 = Int.MAX_VALUE
        var min2 = Int.MAX_VALUE

        for (p in prices) {
            if (p < min1) {
                min2 = min1
                min1 = p
            } else {
                min2 = minOf(p, min2)
            }
        }
        return if (min1 + min2 > money) {
            money
        } else {
            money - (min1 + min2)
        }
    }
}
