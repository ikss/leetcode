package strings.easy

import java.util.*

/**
 * Given a string s of lower and upper case English letters.
 *
 * A good string is a string which doesn't have two adjacent characters `s[i]` and `s[i + 1]` where:
 * * 0 <= i <= s.length - 2
 * * `s[i]` is a lower-case letter and `s[i + 1]` is the same letter but in upper-case or vice-versa.
 *
 * To make the string good, you can choose two adjacent characters that make the string bad and remove them.
 * You can keep doing this until the string becomes good.
 *
 * Return the string after making it good. The answer is guaranteed to be unique under the given constraints.
 *
 * Notice that an empty string is also good.
 *
 * [URL](https://leetcode.com/problems/make-the-string-great/)
 */
object MakeTheStringGreat {

    fun makeGoodCycle(s: String): String {
        if (s.length == 1) return s
        var i = 0
        val arr = StringBuilder(s)
        while (i < arr.length - 1) {
            if (Math.abs(arr[i] - arr[i + 1]) == 32) {
                arr.delete(i, i + 2)
                i = maxOf(0, i - 1)
            } else {
                i++
            }
        }
        return arr.toString()
    }

    fun makeGoodStack(s: String): String {
        val stack = Stack<Char>()
        for (c in s) {
            if (stack.isEmpty() || Math.abs(stack.peek() - c) != 32) {
                stack.push(c)
            } else {
                stack.pop()
            }
        }
        val s = StringBuilder()

        while (!stack.isEmpty()) {
            s.insert(0, stack.pop())
        }

        return s.toString()
    }
}