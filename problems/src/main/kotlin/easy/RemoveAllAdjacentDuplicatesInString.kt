package easy

import java.util.*

/**
 * You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing
 * two adjacent and equal letters and removing them.
 *
 * We repeatedly make duplicate removals on s until we no longer can.
 *
 * Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.
 *
 * [URL](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/)
 */
object RemoveAllAdjacentDuplicatesInString {
    fun removeDuplicates(s: String): String {
        val stack = Stack<Char>()

        for (c in s) {
            if (stack.isEmpty() || stack.peek() != c) {
                stack.push(c)
            } else {
                stack.pop()
            }

        }

        val result = StringBuilder()
        for (c in stack) {
            result.append(c)
        }
        return result.toString()
    }
}