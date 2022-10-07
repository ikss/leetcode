package arrays.hard

import java.util.*

/**
 * You are given an array of n integers, nums, where there are at most 50 unique values in the array.
 * You are also given an array of m customer order quantities, quantity, where `quantity[i]` is the amount of integers
 * the ith customer ordered. Determine if it is possible to distribute nums such that:
 *
 * * The ith customer gets exactly `quantity[i]` integers,
 * * The integers the ith customer gets are all equal, and
 * * Every customer is satisfied.
 *
 *  Return true if it is possible to distribute nums according to the above conditions.
 *
 * [URL](https://leetcode.com/problems/distribute-repeating-integers/)
 */
object DistributeRepeatingIntegers {
    fun canDistributeBacktrack(nums: IntArray, quantity: IntArray): Boolean {
        quantity.sortDescending()
        val frequencies = nums.groupBy { it }.map { it.value.size }.toIntArray()
        frequencies.sortDescending()
        return rec(frequencies, quantity, 0)
    }

    // try to fullfill the j-th order quantity
    private fun rec(dist: IntArray, quantity: IntArray, j: Int): Boolean {

        // stop condition. We've fulfilled all the order quantities.
        if (j == quantity.size) return true

        val used = mutableSetOf<Int>()
        for (i in dist.indices) {

            // Use a set to make sure that
            // we don't distribute from the same amount to this j-th order for more than once.
            if (dist[i] >= quantity[j] && used.add(dist[i])) {
                dist[i] -= quantity[j]
                if (rec(dist, quantity, j + 1)) return true
                dist[i] += quantity[j]
            }
        }
        return false
    }
}
