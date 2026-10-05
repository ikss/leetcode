package medium

import data_structures.TreeNode
import java.util.ArrayDeque
import java.util.Stack

/**
 * Given a balanced parentheses string s, return the score of the string.
 *
 * The score of a balanced parentheses string is based on the following rule:
 * * "()" has score 1.
 * * AB has score A + B, where A and B are balanced parentheses strings.
 * * (A) has score 2 * A, where A is a balanced parentheses string.
 *
 * [URL](https://leetcode.com/problems/score-of-parentheses/)
 */
object ScoreOfParentheses {
    fun scoreOfParentheses(s: String): Int {
        val stack = Stack<Int>()
        stack.push(0)

        for (c in s) {
            if (c == '(') {
                stack.push(0)
            } else {
                val v = stack.pop()
                val w = stack.pop()
                stack.push(w + maxOf(1, 2 * v))
            }
        }
        return stack.pop()
    }
}
