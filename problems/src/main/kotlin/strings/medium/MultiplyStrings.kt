package strings.medium

/**
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2,
 * also represented as a string.
 *
 * **Note:** You must not use any built-in BigInteger library or convert the inputs to integer directly.
 *
 * [URL](https://leetcode.com/problems/multiply-strings/)
 */
object MultiplyStrings {
    fun multiply(num1: String, num2: String): String {
        val l1 = num1.length
        val l2 = num2.length
        val result = StringBuilder(l1 + l2)
        for (i in 0 until l1 + l2) result.append('0')

        for (i in num1.indices) {
            var overflow = 0
            for (j in num2.indices) {
                val temp = (num1[l1 - i - 1] - '0') * (num2[l2 - j - 1] - '0')
                val index = l1 - i + l2 - j - 1
                overflow += result[index] - '0' + temp
                result[index] = '0' + (overflow % 10)
                overflow /= 10
            }
            if (overflow != 0) {
                result[l1 - i - 1] = '0' + overflow
            }
        }

        while (result[0] == '0' && result.length > 1) result.deleteCharAt(0)

        return result.toString()
    }
}