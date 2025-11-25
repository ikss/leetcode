package easy

import java.util.*

/**
 * You are given a string s consisting only of uppercase English letters.
 *
 * You can apply some operations to this string where, in one operation, you can remove any occurrence
 * of one of the substrings "AB" or "CD" from s.
 *
 * Return the minimum possible length of the resulting string that you can obtain.
 *
 * Note that the string concatenates after removing the substring and could produce new "AB" or "CD" substrings.
 *
 * [URL](https://leetcode.com/problems/minimum-string-length-after-removing-substrings/)
 */
object MinimumStringLengthAfterRemovingSubstrings {
    fun minLengthStringBuilder(s: String): Int {
        val str = StringBuilder(s)
        var i = 0

        while (i < str.length - 1) {
            if (
                (str[i] == 'A' && str[i + 1] == 'B') || (str[i] == 'C' && str[i + 1] == 'D')
            ) {
                str.delete(i, i + 2)
                i = if (i > 0) i - 1 else 0
            } else {
                i++
            }
        }

        return str.length
    }

    fun minLengthStack(s: String): Int {
        val stack = Stack<Char>()

        for (c in s) {
            if (!stack.isEmpty()) {
                if ((c == 'B' && stack.peek() == 'A') || (c == 'D' && stack.peek() == 'C')) {
                    stack.pop()
                    continue
                }
            }
            stack.push(c)
        }

        return stack.size
    }
}
