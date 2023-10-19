package strings.easy

import java.util.*

/**
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors.
 * '#' means a backspace character.
 *
 * Note that after backspacing an empty text, the text will continue empty.
 *
 * [URL](https://leetcode.com/problems/backspace-string-compare/)
 */
object BackspaceStringCompare {
    fun backspaceCompareStack(s: String, t: String): Boolean {
        val s1 = toStack(s)
        val s2 = toStack(t)

        if (s1.size != s2.size) return false

        while (s1.isNotEmpty()) {
            if (s1.pop() != s2.pop()) return false
        }

        return true
    }

    private fun toStack(str: String): Stack<Char> {
        val stack = Stack<Char>()

        for (c in str) {
            if (c == '#') {
                if (stack.isNotEmpty()) {
                    stack.pop()
                }
            } else {
                stack.push(c)
            }
        }
        return stack
    }
}