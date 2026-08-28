package hard

/**
 * You are given two strings s and target, each of length n, consisting of lowercase English letters.
 *
 * Return the lexicographically smallest string that is both a palindromic permutation of s
 * and strictly greater than target. If no such permutation exists, return an empty string.
 *
 * [URL](https://leetcode.com/problems/lexicographically-smallest-palindromic-permutation-greater-than-target/)
 */
object LexicographicallySmallestPalindromicPermutationGreaterThanTarget {

    fun lexPalindromicPermutation(s: String, target: String): String {
        val n = s.length
        if (n == 1) {
            return if (s > target) s else ""
        }

        val counts = IntArray(26)
        for (c in s) {
            counts[c - 'a']++
        }

        var oddChar = ""
        for (i in 0..25) {
            if (counts[i] % 2 == 1) {
                // More than one character appears an odd number of times, cannot form a palindrome
                if (oddChar != "") {
                    return ""
                }
                oddChar = ('a' + i).toString()
            }
            counts[i] /= 2 // It takes only half the characters to construct the left half
        }

        val prefix = StringBuilder()

        // Construct the left part of each digit greedily
        for (i in 0..<n / 2) {
            var found = false
            // Try to place the smallest character in lexicographical order
            for (j in 0..25) {
                if (counts[j] == 0) {
                    continue
                }

                counts[j]--
                if (check(prefix.toString(), 'a' + j, counts, oddChar, target)) {
                    // If the constructed palindrome is greater than target, choose the character
                    prefix.append('a' + j)
                    found = true
                    break
                }
                counts[j]++ // Not meeting the conditions, reset the counter
            }
            if (!found) {
                return "" // Cannot construct a palindrome larger than target
            }

            if (prefix[i] > target[i]) {
                // prefix is already greater than target
                val left = StringBuilder(prefix)
                for (j in 0..25) {
                    for (k in 0..<counts[j]) {
                        left.append('a' + j)
                    }
                }
                return left.toString() +
                        oddChar +
                        StringBuilder(left).reverse().toString()
            }
        }

        // Construct the final palindrome string
        return prefix.toString() +
                oddChar +
                StringBuilder(prefix).reverse().toString()
    }

    private fun check(
        prefix: String,
        c: Char,
        cnt: IntArray,
        oddChar: String,
        target: String,
    ): Boolean {
        val left = StringBuilder(prefix)
        left.append(c)
        for (i in 25 downTo 0) {
            for (k in 0..<cnt[i]) {
                left.append('a' + i)
            }
        }

        val palindrome =
            left.toString() +
                    oddChar +
                    StringBuilder(left).reverse().toString()

        return palindrome > target
    }
}
