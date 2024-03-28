package strings.easy

import java.util.*

/**
 * You are given a 0-indexed string num of length n consisting of digits.
 *
 * Return true if for every index i in the range 0 <= i < n, the digit i occurs `num[i]` times in num,
 * otherwise return false.
 *
 * [URL](https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/)
 */
object CheckIfNumberHasEqualDigitCountAndDigitValue {
    fun digitCount(num: String): Boolean {
        val count = IntArray(10)

        for (n in num) {
            count[n - '0']++
        }

        for (i in num.indices) {
            if ((num[i] - '0') != count[i]) {
                return false
            }
        }
        return true
    }
}