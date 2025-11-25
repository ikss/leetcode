package easy

/**
 * Given a string s, check if it can be constructed by taking a substring of it
 * and appending multiple copies of the substring together.
 *
 * [URL](https://leetcode.com/problems/repeated-substring-pattern/)
 */
object RepeatedSubstringPattern {
    fun repeatedSubstringPatternDivisors(s: String): Boolean {
        val n = s.length
        for (i in 1..n / 2) {
            if (n % i != 0) continue

            val sub = s.substring(0, i).repeat(n / i)
            if (s == sub) return true
        }
        return false
    }

    fun repeatedSubstringPatternConcatenation(s: String): Boolean {
        val t = s + s
        return t.substring(1, t.length - 1).contains(s)
    }
}
