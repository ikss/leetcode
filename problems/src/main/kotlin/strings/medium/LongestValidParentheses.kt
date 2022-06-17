package strings.medium

import java.util.*

/**
 * Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed
 * parentheses substring.
 *
 * [URL](https://leetcode.com/problems/longest-valid-parentheses/)
 */
object LongestValidParentheses {
    fun longestValidParentheses(s: String): Int {
        var max = 0
        val stack = Stack<Int>()
        stack.push(-1)
        for (i in s.indices) {
            if (s[i] == '(') {
                stack.push(i)
            } else {
                stack.pop()
                if (stack.empty()) {
                    stack.push(i)
                } else {
                    max = Math.max(max, i - stack.peek())
                }
            }
        }
        return max
    }
}
