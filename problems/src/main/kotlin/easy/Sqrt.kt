package easy

/**
 * Given a non-negative integer x, compute and return the square root of x.
 *
 * Since the return type is an integer, the decimal digits are truncated,
 * and only the integer part of the result is returned.
 *
 * Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
 *
 * [URL](https://leetcode.com/problems/sqrtx/)
 */
object Sqrt {
    fun mySqrt(x: Int): Int {
        if (x < 2) return x

        var l = 0
        var r = x
        val longX = x.toLong()
        while (l <= r) {
            val mid = (r - l) / 2 + l
            val sqr = mid.toLong() * mid
            if (sqr == longX) {
                return mid
            } else if (sqr > x) {
                r = mid - 1
            } else {
                l = mid + 1
            }
        }
        return l - 1
    }
}
