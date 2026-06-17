package hard

/**
 * You are given a string s consisting of lowercase English letters and the special characters: '*', '#', and '%'.
 *
 * You are also given an integer k.
 *
 * Build a new string result by processing s according to the following rules from left to right:
 * * If the letter is a lowercase English letter append it to result.
 * * A '*' removes the last character from result, if it exists.
 * * A '#' duplicates the current result and appends it to itself.
 * * A '%' reverses the current result.
 *
 * Return the kth character of the final string result. If k is out of the bounds of result, return '.'.
 *
 * [URL](https://leetcode.com/problems/process-string-with-special-operations-ii/)
 */
object ProcessStringWithSpecialOperationsII {
    fun processStr(s: String, k: Long): Char {
        var k = k
        var len = 0L
        for (c in s) {
            when (c) {
                '*' -> if (len > 0) len--
                '#' -> len *= 2
                '%' -> {}
                else -> len++
            }
        }
        if (k + 1 > len) {
            return '.'
        }
        for (i in s.length - 1 downTo 0) {
            val c = s[i]
            when (c) {
                '*' -> len++
                '#' -> {
                    if (k + 1 > (len + 1) / 2) {
                        k -= len / 2
                    }
                    len = (len + 1) / 2
                }

                '%' -> k = len - k - 1
                else -> {
                    if (k + 1 == len) {
                        return c
                    }
                    len--
                }
            }
        }
        return '.'
    }
}
