package arrays.medium

import java.util.*

/**
 * You are given an integer n denoting the number of cities in a country. The cities are numbered from 0 to n - 1.
 *
 * You are also given a 2D integer array roads where `roads[i] = [ai, bi]` denotes that there exists a bidirectional
 * road connecting cities ai and bi.
 *
 * You need to assign each city with an integer value from 1 to n, where each value can only be used once.
 * The importance of a road is then defined as the sum of the values of the two cities it connects.
 *
 * Return the maximum total importance of all roads possible after assigning the values optimally.
 *
 * [URL](https://leetcode.com/problems/asteroid-collision/)
 */
object MaximumTotalImportanceOfRoads {
    fun maximumImportance(n: Int, roads: Array<IntArray>): Long {
        val degree = IntArray(n)

        for ((s, e) in roads) {
            degree[s]++
            degree[e]++
        }
        degree.sort()

        var result = 0L
        var value = 1L

        for (d in degree) {
            result += value * d
            value++
        }

        return result
    }
}