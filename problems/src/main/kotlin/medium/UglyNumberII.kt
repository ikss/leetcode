package medium

import java.util.*

/**
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 *
 * Given an integer n, return the nth ugly number.
 *
 * [URL](https://leetcode.com/problems/ugly-number-ii/)
 */
object UglyNumberII {
    fun nthUglyNumberTreeSet(n: Int): Int {
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

    fun nthUglyNumberDp(n: Int): Int {
        val dp = IntArray(n)
        dp[0] = 1

        var i2 = 0
        var i3 = 0
        var i5 = 0

        for (i in 1 until n) {
            dp[i] = minOf(dp[i2] * 2, dp[i3] * 3, dp[i5] * 5)
            if (dp[i] == dp[i2] * 2) i2++
            if (dp[i] == dp[i3] * 3) i3++
            if (dp[i] == dp[i5] * 5) i5++
        }

        return dp[n - 1]
    }
}
