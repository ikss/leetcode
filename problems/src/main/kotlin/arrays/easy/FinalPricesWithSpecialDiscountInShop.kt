package arrays.easy

import java.util.*

/**
 * You are given an integer array prices where `prices[i]` is the price of the ith item in a shop.
 *
 * There is a special discount for items in the shop. If you buy the ith item, then you will receive a discount
 * equivalent to `prices[j]` where j is the minimum index such that j > i and `prices[j] <= prices[i]`.
 * Otherwise, you will not receive any discount at all.
 *
 * Return an integer array answer where `answer[i]` is the final price you will pay for the ith item of the shop,
 * considering the special discount.
 *
 * [URL](https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/)
 */
object FinalPricesWithSpecialDiscountInShop {
    fun finalPrices(prices: IntArray): IntArray {
        val result = IntArray(prices.size)

        val stack = Stack<Int>()

        for (i in prices.indices) {
            result[i] = prices[i]
            while (stack.isNotEmpty() && prices[stack.peek()] >= prices[i]) {
                result[stack.pop()] -= prices[i]
            }
            stack.push(i)
        }

        return result
    }
}
