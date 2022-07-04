package math.medium

/**
 * Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).
 *
 * [URL](https://leetcode.com/problems/powx-n/)
 */
object Pow {
    fun myPow(x: Double, n: Int): Double {
        var ans = 1.0
        var x = x
        var absN = Math.abs(n.toLong())
        while (absN > 0) {
            if ((absN and 1L) == 1L) {
                ans *= x
            }
            absN = absN shr 1
            x *= x
        }
        return if (n < 0) 1 / ans else ans
    }
}
