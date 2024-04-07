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
    fun checkValidString(s: String): Boolean {
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
}