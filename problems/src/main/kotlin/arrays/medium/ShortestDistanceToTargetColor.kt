package arrays.medium

import java.util.*

/**
 * You are given an array colors, in which there are three colors: 1, 2 and 3.
 *
 * You are also given some queries. Each query consists of two integers i and c,
 * return the shortest distance between the given index i and the target color c. If there is no solution return -1.
 *
 * [URL](https://leetcode.com/problems/shortest-distance-to-target-color/)
 */
object ShortestDistanceToTargetColor {
    fun shortestDistanceColor(colors: IntArray, queries: Array<IntArray>): List<Int> {
        val sets = Array(3) { TreeSet<Int>() }

        for (i in colors.indices) {
            sets[colors[i] - 1].add(i)
        }

        val result = ArrayList<Int>()
        for ((i, c) in queries) {
            val set = sets[c - 1]

            val floor = set.floor(i)
            val ceil = set.ceiling(i)

            var min = Int.MAX_VALUE
            if (floor != null) {
                min = minOf(min, i - floor)
            }
            if (ceil != null) {
                min = minOf(min, ceil - i)
            }
            if (min == Int.MAX_VALUE) result.add(-1) else
                result.add(min)
        }

        return result
    }
}
