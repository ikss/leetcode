package medium

/**
 * Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).
 *
 * [URL](https://leetcode.com/problems/powx-n/)
 */
object Pow {
    fun myPow(x: Double, n: Int): Double {
        if (n == 0) return 1.0
        var x = x
        var n = n.toLong()

        if (n < 0) {
            n *= -1
            x = 1 / x
        }

        var result = 1.0
        while (n != 0L) {
            if (n and 1 == 1L) {
                result *= x
                n -= 1
            }

            x *= x
            n /= 2
        }

        return result
    }
}
