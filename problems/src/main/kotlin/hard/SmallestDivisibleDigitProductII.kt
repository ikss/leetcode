package hard

import kotlin.math.max

/**
 * You are given a string num which represents a positive integer, and an integer t.
 *
 * A number is called zero-free if none of its digits are 0.
 *
 * Return a string representing the smallest zero-free number greater than or equal to num such that the product
 * of its digits is divisible by t. If no such number exists, return "-1".
 *
 * [URL](https://leetcode.com/problems/smallest-divisible-digit-product-ii/)
 */
object SmallestDivisibleDigitProductII {

    fun smallestNumber(num: String, t: Long): String {
        var temp = t
        for (i in 2..9) {
            while (temp % i == 0L) {
                temp /= i.toLong()
            }
        }
        if (temp > 1) {
            return "-1"
        }

        val n = num.length
        val rem = LongArray(n + 1)
        rem[0] = t
        var pos = n - 1

        val numChars = num.toCharArray()
        for (i in num.indices) {
            if (num[i] == '0') {
                pos = i
                break
            }
            rem[i + 1] = rem[i] / gcd(rem[i], (num[i] - '0').toLong())
        }

        if (rem[n] == 1L) {
            return num
        }

        for (i in pos downTo 0) {
            while (++numChars[i] <= '9') {
                var tNow = rem[i] / gcd(rem[i], (numChars[i] - '0').toLong())
                var k = 9

                for (j in n - 1 downTo i + 1) {
                    while (tNow % k != 0L) {
                        k--
                    }
                    tNow /= k.toLong()
                    numChars[j] = '0' + k
                }

                if (tNow == 1L) {
                    return String(numChars)
                }
            }
        }

        val ans = StringBuilder()
        var originalT = t
        for (i in 9 downTo 2) {
            while (originalT % i == 0L) {
                ans.append('0' + i)
                originalT /= i.toLong()
            }
        }

        val padding = max(n + 1 - ans.length, 0)
        for (i in 0..<padding) {
            ans.append('1')
        }

        return ans.reverse().toString()
    }

    private fun gcd(a: Long, b: Long): Long {
        var a = a
        var b = b
        while (b != 0L) {
            val temp = b
            b = a % b
            a = temp
        }
        return a
    }
}
