package medium

import java.util.*

/**
 * A parentheses string is a non-empty string consisting only of '(' and ')'.
 * It is valid if any of the following conditions is true:
 *
 * * It is ().
 * * It can be written as AB (A concatenated with B), where A and B are valid parentheses strings.
 * * It can be written as (A), where A is a valid parentheses string.
 *
 * You are given a parentheses string s and a string locked, both of length n.
 * locked is a binary string consisting only of '0's and '1's. For each index i of locked,
 * * If `locked[i]` is '1', you cannot `change s[i]`.
 * * But if `locked[i]` is '0', you can change `s[i]` to either '(' or ')'.
 *
 * Return true if you can make s a valid parentheses string. Otherwise, return false.
 *
 * [URL](https://leetcode.com/problems/check-if-a-parentheses-string-can-be-valid/)
 */
object CheckIfParenthesesStringCanBeValid {
    fun canBeValid(s: String, locked: String): Boolean {
        val n = s.length

        if (n % 2 == 1) {
            return false
        }

        val openBrackets = Stack<Int>()
        val unlocked = Stack<Int>()

        for (i in 0..<n) {
            if (locked[i] == '0') {
                unlocked.push(i)
                continue
            }
            if (s[i] == '(') {
                openBrackets.push(i)
                continue
            }
            if (!openBrackets.empty()) {
                openBrackets.pop()
            } else if (!unlocked.empty()) {
                unlocked.pop()
            } else {
                return false
            }
        }

        while (!openBrackets.empty() && !unlocked.empty() && openBrackets.peek() < unlocked.peek()) {
            openBrackets.pop()
            unlocked.pop()
        }

        return openBrackets.empty()
    }
}