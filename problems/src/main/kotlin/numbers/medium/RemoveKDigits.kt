package numbers.medium

import java.util.*

/**
 * Given string num representing a non-negative integer num, and an integer k,
 * return the smallest possible integer after removing k digits from num.
 *
 * [URL](https://leetcode.com/problems/remove-k-digits/)
 */
object RemoveKDigits {
    fun removeKdigits(num: String, k: Int): String {
        val stack = Stack<Int>()

        var removed = 0

        for (c in num) {
            val n = c - '0'
            while (stack.isNotEmpty() && stack.peek() > n && removed++ < k) {
                stack.pop()
            }
            stack.push(n)
        }

        while (removed++ < k) {
            stack.pop()
        }

        val result = StringBuilder(stack.size)


        for (c in stack) {
            if (result.isEmpty() && c == 0) continue
            result.append('0' + c)
        }

        return if (result.isEmpty()) "0" else result.toString()
    }
}
