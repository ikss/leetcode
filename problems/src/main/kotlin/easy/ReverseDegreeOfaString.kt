package easy

/**
 * Given a string s, calculate its reverse degree.
 *
 * The reverse degree is calculated as follows:
 * 1. For each character, multiply its position in the reversed alphabet ('a' = 26, 'b' = 25, ..., 'z' = 1)
 * with its position in the string (1-indexed).
 * 2. Sum these products for all characters in the string.
 *
 * Return the reverse degree of s.
 *
 * [URL](https://leetcode.com/problems/reverse-degree-of-a-string/)
 */
object ReverseDegreeOfaString {
    fun reverseDegree(s: String): Int {
        var result = 0
        for (i in s.indices) {
            val c = s[i]

            result += (i + 1) * ('z' - c + 1)
        }

        return result
    }
}