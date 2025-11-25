package easy

/**
 * You are given a string s consisting of digits.
 * Perform the following operation repeatedly until the string has exactly two digits:
 *
 * * For each pair of consecutive digits in s, starting from the first digit,
 * calculate a new digit as the sum of the two digits modulo 10.
 * * Replace s with the sequence of newly calculated digits, maintaining the order in which they are computed.
 *
 * Return true if the final two digits in s are the same; otherwise, return false.
 *
 * [URL](https://leetcode.com/problems/check-if-digits-are-equal-in-string-after-operations-i/)
 */
object CheckIfDigitsAreEqualInStringAfterOperationsI {
    fun hasSameDigits(s: String): Boolean {
        val s = StringBuilder(s)
        var len = s.length
        while (len > 2) {
            for (i in 0 until s.length - 1) {
                val num = (s[i] - '0') + (s[i + 1] - '0')
                s[i] = '0' + (num % 10)
            }
            len--
        }
        return s[0] == s[1]
    }
}
