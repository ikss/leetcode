package strings.medium

import java.util.*

/**
 * Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.
 *
 * The following rules define a valid string:
 * * Any left parenthesis '(' must have a corresponding right parenthesis ')'.
 * * Any right parenthesis ')' must have a corresponding left parenthesis '('.
 * * Left parenthesis '(' must go before the corresponding right parenthesis ')'.
 * * '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".
 *
 * [URL](https://leetcode.com/problems/valid-parenthesis-string/)
 */
object ValidParenthesisString {
    fun checkValidStringTwoStacks(s: String): Boolean {
        val openBrackets = Stack<Int>()
        val asterisks = Stack<Int>()

        for (i in s.indices) {
            val c = s[i]

            if (c == '(') {
                openBrackets.push(i)
                continue
            } else if (c == '*') {
                asterisks.push(i)
                continue
            }
            if (openBrackets.isNotEmpty()) {
                openBrackets.pop()
                continue
            }
            if (asterisks.isNotEmpty()) {
                asterisks.pop()
                continue
            }
            return false
        }

        while (openBrackets.isNotEmpty() && asterisks.isNotEmpty()) {
            if (openBrackets.pop() > asterisks.pop()) {
                return false
            }
        }

        return openBrackets.isEmpty()
    }

    fun checkValidStringTwoPointers(s: String): Boolean {
        var openCount = 0
        var closeCount = 0
        val length = s.length - 1

        for (i in 0..length) {
            if (s[i] == ')') {
                openCount--
            } else {
                openCount++
            }

            if (s[length - i] == '(') {
                closeCount--
            } else {
                closeCount++
            }

            if (openCount < 0 || closeCount < 0) {
                return false
            }
        }

        return true
    }
}