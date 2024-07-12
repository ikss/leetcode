package strings.medium

/**
 * You are given a string s and two integers x and y. You can perform two types of operations any number of times.
 *
 * * Remove substring "ab" and gain x points.
 * * * For example, when removing "ab" from "cabxbae" it becomes "cxbae".
 * * Remove substring "ba" and gain y points.
 * * * For example, when removing "ba" from "cabxbae" it becomes "cabxe".
 *
 * Return the maximum points you can gain after applying the above operations on s.
 *
 * [URL](https://leetcode.com/problems/count-number-of-homogenous-substrings/)
 */
object MaximumScoreFromRemovingSubstrings {
    fun maximumGain(s: String, x: Int, y: Int): Int {
        val (high, low) = if (x >= y) x to y else y to x
        val (first, second) = if (x >= y) "ab" to "ba" else "ba" to "ab"
        val sb = StringBuilder(s)

        return removeSubstring(sb, high, first) + removeSubstring(sb, low, second)
    }

    private fun removeSubstring(s: StringBuilder, cost: Int, substr: String): Int {
        var result = 0
        var i = 0
        while (i < s.length - 1) {
            if (s[i] == substr[0] && s[i + 1] == substr[1]) {
                s.delete(i, i + 2)
                if (i > 0) i--
                result += cost
            } else {
                i++
            }
        }

        return result
    }
}