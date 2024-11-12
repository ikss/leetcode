package arrays.medium

import java.util.*

/**
 * You are given a 2D integer array items where `items[i] = [pricei, beautyi]`
 * denotes the price and beauty of an item respectively.
 *
 * You are also given a 0-indexed integer array queries. For each `queries[j]`,
 * you want to determine the maximum beauty of an item whose price is less than or equal to `queries[j]`.
 * If no such item exists, then the answer to this query is 0.
 *
 * Return an array answer of the same length as queries where `answer[j]` is the answer to the jth query.
 *
 * [URL](https://leetcode.com/problems/most-beautiful-item-for-each-query/)
 */
object MostBeautifulItemForEachQuery {
    fun maximumBeauty(items: Array<IntArray>, queries: IntArray): IntArray {
        items.sortBy { it[1] }
        val map = TreeMap<Int, Int>()

        for ((price, beauty) in items) {
            val existing = map[price] ?: 0
            map[price] = maxOf(existing, beauty)
            val next = price + 1
            var ceiling = map.ceilingEntry(next)
            while (ceiling != null && ceiling.value <= beauty) {
                map.remove(ceiling.key)
                ceiling = map.ceilingEntry(ceiling.key)
            }
        }

        val result = IntArray(queries.size)

        for (i in queries.indices) {
            val query = queries[i]
            result[i] = map.floorEntry(query)?.value ?: 0
        }

        return result
    }
}
