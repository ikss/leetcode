package easy

/**
 * A valid parentheses string is either empty "", "(" + A + ")", or A + B
 * where A and B are valid parentheses strings, and + represents string concatenation.
 * * For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
 *
 * A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into
 * s = A + B, with A and B nonempty valid parentheses strings.
 *
 * Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi
 * are primitive valid parentheses strings.
 *
 * Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.
 *
 * [URL](https://leetcode.com/problems/remove-outermost-parentheses/)
 */
object RemoveOutermostParentheses {
    fun removeOuterParentheses(s: String): String {
        var start = -1
        var level = 0
        val result = StringBuilder(s.length)
        for (i in s.indices) {
            val c = s[i]
            if (c == '(') {
                if (level == 0) {
                    start = i
                }
                level++
            } else if (c == ')') {
                if (--level == 0) {

                    if (i - 1 > start + 1) {
                        result.append(s.substring(start + 1, i))
                    }

                    start = -1
                }
            }
        }

        return result.toString()
    }
}
