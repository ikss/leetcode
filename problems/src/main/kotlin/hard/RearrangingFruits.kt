package hard

import java.util.*
import kotlin.math.abs

/**
 * You have two fruit baskets containing n fruits each. You are given two 0-indexed integer arrays basket1 and basket2
 * representing the cost of fruit in each basket. You want to make both baskets equal.
 * To do so, you can use the following operation as many times as you want:
 *
 * Choose two indices i and j, and swap the ith fruit of basket1 with the jth fruit of basket2.
 * The cost of the swap is `min(basket1[i], basket2[j])`.
 * Two baskets are considered equal if sorting them according to the fruit cost makes them exactly the same baskets.
 *
 * Return the minimum cost to make both the baskets equal or -1 if impossible.
 *
 * [URL](https://leetcode.com/problems/rearranging-fruits/)
 */
object RearrangingFruits {

    fun minCost(basket1: IntArray, basket2: IntArray): Long {
        val freq = TreeMap<Int, Int>()
        var m = Int.MAX_VALUE
        for (b1 in basket1) {
            freq.put(b1, freq.getOrDefault(b1, 0) + 1)
            m = minOf(m, b1)
        }
        for (b2 in basket2) {
            freq.put(b2, freq.getOrDefault(b2, 0) - 1)
            m = minOf(m, b2)
        }

        val merge = ArrayList<Int>()
        for ((key, count) in freq) {
            if (count % 2 != 0) return -1
            for (i in 0..<abs(count) / 2) {
                merge.add(key)
            }
        }

        var res = 0L
        for (i in 0..<merge.size / 2) {
            res += minOf(2 * m, merge[i])
        }
        return res
    }
}