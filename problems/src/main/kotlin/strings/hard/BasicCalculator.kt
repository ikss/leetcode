package strings.hard

import java.util.*


/**
 * Given a string s representing a valid expression, implement a basic calculator to evaluate it,
 * and return the result of the evaluation.
 *
 * Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions,
 * such as eval().
 *
 * [URL](https://leetcode.com/problems/basic-calculator/)
 */
object BasicCalculator {
    fun calculate(s: String): Int {
        val stack = Stack<Int>()
        var sign = 1
        var result = 0

        var i = 0
        while (i < s.length) {
            val c = s[i]
            when {
                c.isDigit() -> {
                    var number = c - '0'
                    while (i + 1 < s.length && s[i + 1].isDigit()) {
                        number = number * 10 + (s[++i] - '0')
                    }
                    result += number * sign
                }
                c == '+' -> {
                    sign = 1
                }
                c == '-' -> {
                    sign = -1
                }
                c == '(' -> {
                    stack.push(result)
                    stack.push(sign)
                    result = 0
                    sign = 1
                }
                c == ')' -> {
                    result = result * stack.pop() + stack.pop()
                }
            }
            i++
        }
        return result
    }
}
