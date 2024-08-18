package numbers.medium

import java.util.*

/**
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 *
 * Given an integer n, return the nth ugly number.
 *
 * [URL](https://leetcode.com/problems/ugly-number-ii/)
 */
object UglyNumberII {
    fun nthUglyNumber(n: Int): Int {
        val set = TreeSet<Long>()
        var currentUgly = 1L
        set.add(currentUgly)

        for (i in 0 until n - 1) {
            currentUgly = set.pollFirst()!!

            set.add(currentUgly * 2)
            set.add(currentUgly * 3)
            set.add(currentUgly * 5)
        }

        return set.pollFirst()!!.toInt()
    }
}
