package numbers.medium

import java.math.BigInteger

/**
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer
 * (similar to C/C++'s atoi function).
 *
 * [URL](https://leetcode.com/problems/string-to-integer-atoi/)
 */
object StringToInteger {
    fun myAtoi(s: String): Int {
        if (s.isEmpty()) {
            return 0
        }
        val trimmed = s.trim().toCharArray()
        var indexStart = 0
        val res = StringBuilder()
        var positive = true
        if (trimmed[0] == '-') {
            positive = false
            indexStart++
        } else if (trimmed[0] == '+') {
            indexStart++
        }
        for (i in indexStart until trimmed.size) {
            if (!trimmed[i].isDigit()) break
            res.append(trimmed[i])
        }
        if (res.isEmpty()) {
            return 0
        }
        if (!positive) {
            res.insert(0, '-')
        }
        return BigInteger(res.toString())
            .max(Integer.MIN_VALUE.toBigInteger())
            .min(Integer.MAX_VALUE.toBigInteger())
            .toInt()
    }
}
