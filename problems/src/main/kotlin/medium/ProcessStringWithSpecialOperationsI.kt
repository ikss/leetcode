package medium

/**
 * You are given a string s consisting of lowercase English letters and the special characters: *, #, and %.
 *
 * Build a new string result by processing s according to the following rules from left to right:
 *
 * If the letter is a lowercase English letter append it to result.
 * * A '*' removes the last character from result, if it exists.
 * * A '#' duplicates the current result and appends it to itself.
 * * A '%' reverses the current result.
 *
 * Return the final string result after processing all characters in s.
 *
 * [URL](https://leetcode.com/problems/process-string-with-special-operations-i/)
 */
object ProcessStringWithSpecialOperationsI {
    fun processStr(s: String): String {
        val sb = StringBuilder()

        for (c in s) {
            when (c) {
                in 'a'..'z' -> sb.append(c)
                '*' -> sb.setLength(maxOf(sb.length - 1, 0))
                '#' -> sb.append(sb.toString())
                '%' -> sb.reverse()
            }
        }

        return sb.toString()
    }
}
