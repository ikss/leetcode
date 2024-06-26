package strings.medium

import java.util.*

/**
 * Given a string s of '(' , ')' and lowercase English characters.
 *
 * Your task is to remove the minimum number of parentheses ('(' or ')', in any positions)
 * so that the resulting parentheses string is valid and return any valid string.
 *
 * Formally, a parentheses string is valid if and only if:
 * * It is the empty string, contains only lowercase characters, or
 * * It can be written as AB (A concatenated with B), where A and B are valid strings, or
 * * It can be written as (A), where A is a valid string.
 *
 * [URL](https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/)
 */
object MinimumRemoveToMakeValidParentheses {
    fun minRemoveToMakeValid(s: String): String {
        val removes = Stack<Pair<Char, Int>>()

        for (i in s.indices) {
            val c = s[i]

            if (c == ')') {
                if (removes.isNotEmpty() && removes.peek().first == '(') {
                    removes.pop()
                } else {
                    removes.add(c to i)
                }
            } else if (c == '(') {
                removes.add(c to i)
            }
        }
        var result = StringBuilder(s)
        while (removes.isNotEmpty()) {
            val i = removes.pop().second
            result = result.deleteCharAt(i)
        }

        return result.toString()
    }
}