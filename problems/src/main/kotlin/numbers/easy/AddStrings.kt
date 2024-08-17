package numbers.easy

/**
 * Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
 *
 * You must solve the problem without using any built-in library for handling large integers (such as BigInteger).
 * You must also not convert the inputs to integers directly.
 *
 * [URL](https://leetcode.com/problems/add-strings/)
 */
object AddStrings {
    fun addStrings(num1: String, num2: String): String {
        val result = StringBuilder()
        var carry = 0

        var curr = 0
        while (curr < num1.length || curr < num2.length) {
            val n1 = if (curr < num1.length) num1[num1.length - curr - 1] - '0' else 0
            val n2 = if (curr < num2.length) num2[num2.length - curr - 1] - '0' else 0
            val num = n1 + n2 + carry

            carry = num / 10
            result.append(num % 10)
            curr++
        }

        if (carry > 0) result.append(carry)

        return result.reverse().toString()
    }
}
