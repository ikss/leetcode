package medium

import kotlin.math.pow

/**
 * Given an integer n, break it into the sum of k positive integers, where k >= 2,
 * and maximize the product of those integers.
 *
 * Return the maximum product you can get.
 *
 * [URL](https://leetcode.com/problems/integer-break/)
 */
object IntegerBreak {
    fun integerBreakDp(n: Int): Int {
        if (n <= 3) {
            return n - 1
        }

        val dp = IntArray(n + 1)
        for (i in 1..3) {
            dp[i] = i
        }

        for (num in 4..n) {
            var ans = num
            for (i in 2 until num) {
                ans = maxOf(ans, i * dp[num - i])
            }
            dp[num] = ans
        }

        return dp[n]
    }

    fun integerBreakMath(n: Int): Int {
        if (n <= 3) {
            return n - 1
        }

        val power = n / 3
        return if (n % 3 == 0) {
            3.0.pow(power).toInt()
        } else if (n % 3 == 1) {
            3.0.pow(power - 1).toInt() * 4
        } else {
            3.0.pow(power).toInt() * 2
        }
    }
}
