package easy

/**
 * You are given a string s. The score of a string is defined as the sum of the absolute difference
 * between the ASCII values of adjacent characters.
 *
 * Return the score of s.
 *
 * [URL](https://leetcode.com/problems/score-of-a-string/)
 */
object ScoreOfString {
    fun scoreOfString(s: String): Int {
        var result = 0
        for (i in 0 until s.length - 1) {
            result += Math.abs(s[i] - s[i + 1])
        }

        return result
    }
}