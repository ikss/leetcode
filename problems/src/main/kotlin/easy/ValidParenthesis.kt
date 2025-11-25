package easy

import java.util.*

/**
 * Given a string s containing just the characters `'(', ')', '{', '}', '[' and ']'`, determine if the input string is valid.
 * An input string is valid if:
 * * Open brackets must be closed by the same type of brackets.
 * * Open brackets must be closed in the correct order.
 *
 * [URL](https://leetcode.com/problems/valid-parentheses/)
 */
object ValidParenthesis {
    private val charMap = mapOf(')' to '(', ']' to '[', '}' to '{')

    fun isValid(s: String): Boolean {
        if (s.isEmpty()) return true

        val stack = Stack<Char>()

        for (c in s) {
            when (c) {
                '(', '{', '[' -> stack.push(c)
                else -> if (stack.isEmpty() || stack.pop() != charMap[c]) return false
            }
        }

        return stack.isEmpty()
    }
}
