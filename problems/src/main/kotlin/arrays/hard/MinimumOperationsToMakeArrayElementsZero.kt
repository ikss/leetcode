package arrays.hard

import java.util.*

/**
 * You are given a 2D array queries, where `queries[i]` is of the form `[l, r]`.
 * Each `queries[i]` defines an array of integers nums consisting of elements ranging from l to r, both inclusive.
 *
 * In one operation, you can:
 * * Select two integers a and b from the array.
 * * Replace them with floor(a / 4) and floor(b / 4).
 *
 * Your task is to determine the minimum number of operations required to reduce all elements of the array to zero for
 * each query. Return the sum of the results for all queries.
 *
 * [URL](https://leetcode.com/problems/minimum-operations-to-make-array-elements-zero/)
 */
object MinimumOperationsToMakeArrayElementsZero {
    fun minOperations(queries: Array<IntArray>): Long {
        var result = 0L

        for ((l,r) in queries) {
            result += (count(r) - count(l - 1) + 1) / 2
        }

        return result
    }

    fun count(n: Int): Long {
        var count = 0L
        var i = 1
        var base = 1

        while (base <= n) {
            val end = minOf(base * 2 - 1, n)
            count += ((i.toLong() + 1) / 2) * (end - base + 1)
            i++
            base *= 2
        }

        return count
    }
}
