package medium

import java.util.*

/**
 * Given two strings s and part, perform the following operation on s
 * until all occurrences of the substring part are removed:
 * * Find the leftmost occurrence of the substring part and remove it from s.
 *
 * Return s after removing all occurrences of part.
 *
 * A substring is a contiguous sequence of characters in a string.
 *
 * [URL](https://leetcode.com/problems/remove-all-occurrences-of-a-substring/)
 */
object RemoveAllOccurrencesOfSubstring {

    fun removeOccurrences(s: String, part: String): String {
        // Precompute KMP longest prefix-suffix array for the pattern
        val kmpLPS = computeLongestPrefixSuffix(part)

        // Using stack to track characters and support pattern matching
        val charStack = Stack<Char>()

        // Array to store pattern matching indices during traversal
        val patternIndexes = IntArray(s.length + 1)

        var strIndex = 0
        var patternIndex = 0
        while (strIndex < s.length) {
            val currentChar = s[strIndex]
            charStack.push(currentChar)

            if (currentChar == part[patternIndex]) {
                // Track the next pattern index when characters match
                patternIndexes[charStack.size] = ++patternIndex

                if (patternIndex == part.length) {
                    // Remove entire matched pattern from stack
                    var remainingLength = part.length
                    while (remainingLength != 0) {
                        charStack.pop()
                        remainingLength--
                    }

                    // Restore pattern index for next potential match
                    patternIndex = if (charStack.isEmpty())
                        0
                    else
                        patternIndexes[charStack.size]
                }
            } else if (patternIndex != 0) {
                // Backtrack pattern matching using KMP LPS
                strIndex--
                patternIndex = kmpLPS[patternIndex - 1]
                charStack.pop()
            } else {
                // Reset pattern index tracking when no match is possible
                patternIndexes[charStack.size] = 0
            }
            strIndex++
        }

        // Convert remaining stack characters to result string
        val result = StringBuilder()
        while (!charStack.isEmpty()) {
            result.append(charStack.pop())
        }

        return result.reverse().toString()
    }

    private fun computeLongestPrefixSuffix(pattern: String): IntArray {
        // Array to store the longest proper prefix which is also a suffix
        val lps = IntArray(pattern.length)

        // Initialize tracking variables for prefix and current position
        var current = 1
        var prefixLength = 0
        while (current < pattern.length) {
            // If characters match, extend the prefix length
            if (pattern[current] == pattern[prefixLength]) {
                // Store the length of matching prefix
                lps[current] = ++prefixLength
                current++
            } else if (prefixLength != 0) {
                // Backtrack to the previous longest prefix-suffix
                prefixLength = lps[prefixLength - 1]
            } else {
                // No prefix-suffix match found
                lps[current] = 0
                current++
            }
        }

        // Return the computed longest prefix-suffix array
        return lps
    }
}