package strings.medium

import java.util.*

/**
 * You are given a 0-indexed string s of even length n. The string consists of exactly n / 2 opening brackets
 * '[' and n / 2 closing brackets ']'.
 *
 * A string is called balanced if and only if:
 * * It is the empty string, or
 * * It can be written as AB, where both A and B are balanced strings, or
 * * It can be written as `[C]`, where C is a balanced string.
 *
 * You may swap the brackets at any two indices any number of times.
 *
 * Return the minimum number of swaps to make s balanced.
 *
 * [URL](https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/)
 */
object MinimumNumberOfSwapsToMakeTheStringBalanced {
    fun minSwapsStack(s: String): Int {
        val stack = Stack<Char>()
        var unbalanced = 0

        for (c in s) {
            if (c == '[') {
                stack.push(c)
                continue
            }
            if (stack.isNotEmpty()) {
                stack.pop()
                continue
            }
            unbalanced++
        }
        return (unbalanced + 1) / 2
    }

    fun minSwapsCount(s: String): Int {
        var unbalanced = 0

        for (c in s) {
            if (c == '[') {
                unbalanced++
            } else if (unbalanced > 0) {
                unbalanced--
            }
        }
        return (unbalanced + 1) / 2
    }
}