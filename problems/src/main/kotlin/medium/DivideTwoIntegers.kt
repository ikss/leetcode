package medium

/**
 * Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
 *
 * The integer division should truncate toward zero, which means losing its fractional part.
 * For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.
 *
 * Return the quotient after dividing dividend by divisor.
 *
 * Note: Assume we are dealing with an environment that could only store integers within the
 * 32-bit signed integer range: [−2^31, 2^31 − 1]. For this problem, if the quotient is strictly greater than 2^31 - 1,
 * then return 2^31 - 1, and if the quotient is strictly less than -2^31, then return -2^31.
 *
 * [URL](https://leetcode.com/problems/divide-two-integers/)
 */
object DivideTwoIntegers {
    fun divide(dividend: Int, divisor: Int): Int {
        if (Int.MIN_VALUE == dividend && divisor == -1) {
            return Int.MAX_VALUE
        }
        var res = 0
        var a = Math.abs(dividend)
        val b = Math.abs(divisor)
        while (a - b >= 0) {
            var tmp = b
            var count = 1
            while (a - (tmp shl 1) >= 0) {
                tmp = tmp shl 1
                count = count shl 1
            }
            a -= tmp
            res += count
        }
        return if (dividend > 0 == divisor > 0) res else -res
    }
}
