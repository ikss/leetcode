package easy

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

    fun backspaceCompareTwoPointers(s: String, t: String): Boolean {
        var i = s.length - 1
        var j = t.length - 1
        var skipS = 0
        var skipT = 0
        while (i >= 0 || j >= 0) {
            // Find position of next possible char in build(S)
            while (i >= 0) {
                if (s[i] == '#') {
                    skipS++
                    i--
                } else if (skipS > 0) {
                    skipS--
                    i--
                } else break
            }
            // Find position of next possible char in build(T)
            while (j >= 0) {
                if (t[j] == '#') {
                    skipT++
                    j--
                } else if (skipT > 0) {
                    skipT--
                    j--
                } else break
            }
            // If two actual characters are different
            if (i >= 0 && j >= 0 && s[i] != t[j]) return false
            // If expecting to compare char vs nothing
            if ((i >= 0) != (j >= 0)) return false
            i--
            j--
        }
        return true
    }
}