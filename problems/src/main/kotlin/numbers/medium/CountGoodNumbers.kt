package numbers.medium

/**
 * A digit string is good if the digits (0-indexed) at even indices are even and the digits at odd indices
 * are prime (2, 3, 5, or 7).
 *
 * For example, "2582" is good because the digits (2 and 8) at even positions are even and the digits (5 and 2)
 * at odd positions are prime. However, "3245" is not good because 3 is at an even index but is not even.
 * Given an integer n, return the total number of good digit strings of length n. Since the answer may be large,
 * return it modulo 10^9 + 7.
 *
 * A digit string is a string consisting of digits 0 through 9 that may contain leading zeros.
 *
 * [URL](https://leetcode.com/problems/count-good-numbers/)
 */
object CountGoodNumbers {
    private val mod = 1_000_000_007
    fun countGoodNumbers(n: Long): Int {
        return ((quickmul(5, (n + 1) / 2) * quickmul(4, n / 2)) % mod).toInt()
    }

    // use fast exponentiation to calculate x^y % mod
    private fun quickmul(x: Int, y: Long): Long {
        var y = y
        var ret = 1L
        var mul = x.toLong()
        while (y > 0) {
            if (y % 2 == 1L) {
                ret = (ret * mul) % mod
            }
            mul = (mul * mul) % mod
            y /= 2
        }

        return ret
    }
}