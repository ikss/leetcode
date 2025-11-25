package medium

import java.util.*

/**
 * You are given a 0-indexed string pattern of length n consisting of the characters 'I'
 * meaning increasing and 'D' meaning decreasing.
 *
 * A 0-indexed string num of length n + 1 is created using the following conditions:
 * * num consists of the digits '1' to '9', where each digit is used at most once.
 * * If `pattern[i] == 'I'`, then `num[i] < num[i + 1]`.
 * * If `pattern[i] == 'D'`, then `num[i] > num[i + 1]`.
 * 
 * Return the lexicographically smallest possible string num that meets the conditions.
 *
 * [URL](https://leetcode.com/problems/construct-smallest-number-from-di-string/)
 */
object ConstructSmallestNumberFromDIString {

    fun smallestNumber(pattern: String): String {
        val result = StringBuilder(pattern.length + 1)
        val numStack = Stack<Int>()

        // Iterate through the pattern
        for (index in 0..pattern.length) {
            // Push the next number onto the stack
            numStack.push(index + 1)

            // If 'I' is encountered or we reach the end, pop all stack elements
            if (index == pattern.length || pattern[index] == 'I') {
                while (!numStack.isEmpty()) {
                    result.append(numStack.pop())
                }
            }
        }

        return result.toString()
    }
}