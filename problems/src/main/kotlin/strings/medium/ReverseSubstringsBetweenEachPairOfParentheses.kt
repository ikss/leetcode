package strings.medium

import java.util.*

/**
 * You are given a string s that consists of lower case English letters and brackets.
 *
 * Reverse the strings in each pair of matching parentheses, starting from the innermost one.
 *
 * Your result should not contain any brackets.
 *
 * [URL](https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/)
 */
object ReverseSubstringsBetweenEachPairOfParentheses {
    fun reverseParentheses(s: String): String {
        val stack = Stack<Char>()
        val currQueue = ArrayDeque<Char>()

        for (c in s) {
            when (c) {
                ')' -> {
                    while (stack.peek() != '(') {
                        currQueue.offer(stack.pop())
                    }
                    stack.pop()
                    while (currQueue.isNotEmpty()) {
                        stack.push(currQueue.poll())
                    }
                }
                else -> stack.push(c)
            }
        }

        val result = StringBuilder()
        while (stack.isNotEmpty()) {
            result.insert(0, stack.pop())
        }

        return result.toString()
    }
}
