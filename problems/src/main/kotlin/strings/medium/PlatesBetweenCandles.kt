package strings.medium

import java.util.*

/**
 * There is a long table with a line of plates and candles arranged on top of it. You are given a 0-indexed string s
 * consisting of characters '*' and '|' only, where a '*' represents a plate and a '|' represents a candle.
 *
 * You are also given a 0-indexed 2D integer array queries where `queries[i] = [lefti, righti]` denotes the substring
 * `s[lefti ... righti]` (inclusive). For each query, you need to find the number of plates between candles that are in
 * the substring. A plate is considered between candles if there is at least one candle to its left and at least one
 * candle to its right in the substring.
 *
 * * For example, s = "||**||**|*", and a query `[3, 8]` denotes the substring "*||**|". The number of plates between
 * candles in this substring is 2, as each of the two plates has at least one candle in the substring to its
 * left and right.
 *
 * Return an integer array answer where `answer[i]` is the answer to the ith query.
 *
 * [URL](https://leetcode.com/problems/plates-between-candles/)
 */
object PlatesBetweenCandles {
    fun platesBetweenCandles(s: String, queries: Array<IntArray>): IntArray {
        val results = IntArray(queries.size)

        val candleIndices = TreeMap<Int, Int>()
        var rollingSum = 0
        for (i in s.indices) {
            val c = s[i]
            if (c == '|') {
                candleIndices[i] = rollingSum
            } else if (c == '*') {
                rollingSum++
            }
        }

        for (i in queries.indices) {
            val (left, right) = queries[i]
            val leftCandle = candleIndices.ceilingEntry(left) ?: continue
            val rightCandle = candleIndices.floorEntry(right) ?: continue
            if (leftCandle.key >= rightCandle.key) continue

            results[i] = rightCandle.value - leftCandle.value
        }

        return results
    }
}
