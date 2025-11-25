package medium

/**
 * Given two strings: s1 and s2 with the same size, check if some permutation of string s1 can break some permutation
 * of string s2 or vice-versa. In other words s2 can break s1 or vice-versa.
 *
 * A string x can break string y (both of size n) if `x[i] >= y[i]` (in alphabetical order) for all i between 0 and n-1.
 *
 * [URL](https://leetcode.com/problems/check-if-a-string-can-break-another-string/)
 */
object CheckIfStringCanBreakAnotherString {
    fun checkIfCanBreak(s1: String, s2: String): Boolean {
        val chars1 = s1.chars().sorted().toArray()
        val chars2 = s2.chars().sorted().toArray()

        var sign = 0

        for (i in chars1.indices) {
            val c1 = chars1[i]
            val c2 = chars2[i]
            if (c1 == c2) continue
            if (c1 > c2) {
                if (sign == 1) return false
                sign = -1
            } else {
                if (sign == -1) return false
                sign = 1
            }
        }
        return true
    }
}
