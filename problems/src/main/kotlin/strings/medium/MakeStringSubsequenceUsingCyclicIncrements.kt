package strings.medium

/**
 * You are given two 0-indexed strings str1 and str2.
 *
 * In an operation, you select a set of indices in str1, and for each index i in the set, increment `str1[i]` to the
 * next character cyclically. That is 'a' becomes 'b', 'b' becomes 'c', and so on, and 'z' becomes 'a'.
 *
 * Return true if it is possible to make str2 a subsequence of str1 by performing the operation at most once,
 * and false otherwise.
 *
 * Note: A subsequence of a string is a new string that is formed from the original string by deleting some
 * (possibly none) of the characters without disturbing the relative positions of the remaining characters.
 *
 * [URL](https://leetcode.com/problems/make-string-a-subsequence-using-cyclic-increments/)
 */
object MakeStringSubsequenceUsingCyclicIncrements {
    fun canMakeSubsequence(str1: String, str2: String): Boolean {
        var i1 = 0
        var i2 = 0

        while (i1 < str1.length && i2 < str2.length) {
            if (str1[i1] == str2[i2] || (str1[i1] + 1 == str2[i2]) || (str1[i1] - 25 == str2[i2])) {
                i2++
            }
            i1++
        }
        return i2 == str2.length
    }
}