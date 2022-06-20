package math.medium

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
object FactorialTrailingZeroes {
    fun trailingZeroesOptimal(n: Int): Int {
        var tmp = n
        var result = 0
        while (tmp >= 5) {
            tmp /= 5
            result += tmp
        }
        return result
    }

    fun trailingZeroesNonOptimal(n: Int): Int {
        val map = mutableMapOf<Int, Pair<Int, Int>>()
        var twos = 0
        var fifths = 0
        if (n < 5) return 0

        for (i in 2..n) {
            val pairs = getPairs(i, map)
            map[i] = pairs
            twos += pairs.first
            fifths += pairs.second
        }
        return Math.min(twos, fifths)
    }

    private fun getPairs(num: Int, map: MutableMap<Int, Pair<Int, Int>>): Pair<Int, Int> {
        var twos = 0
        var fifths = 0
        var tmp = num
        while (tmp % 5 == 0) {
            if (map[tmp] != null) {
                fifths += map[tmp]!!.second
                break
            }
            tmp /= 5
            fifths++
        }
        tmp = num
        while (tmp % 2 == 0) {
            if (map[tmp] != null) {
                twos += map[tmp]!!.first
                break
            }
            tmp /= 2
            twos++
        }
        return twos to fifths
    }
}
