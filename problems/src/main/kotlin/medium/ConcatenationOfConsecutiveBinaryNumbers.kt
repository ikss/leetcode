package medium

import java.math.BigInteger

/**
 * Given an integer n, return the decimal value of the binary string formed by concatenating
 * the binary representations of 1 to n in order, modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/concatenation-of-consecutive-binary-numbers/)
 */
object ConcatenationOfConsecutiveBinaryNumbers {
    private const val MODULO = 1000000007

    fun concatenatedBinaryBigInt(n: Int): Int {
        val string = StringBuilder()
        for (i in 1..n) {
            string.append(i.toString(2))
        }
        val result = BigInteger(string.toString(), 2)
        return result.mod(MODULO.toBigInteger()).toInt()
    }

    fun concatenatedBinaryBitShift(n: Int): Int {
        var result: Long = 0
        var binaryDigits = 0
        for (i in 1..n) {
            if (i and i - 1 == 0) binaryDigits++
            result = ((result shl binaryDigits) + i) % MODULO
        }
        return result.toInt()
    }
}