package strings.medium

import java.util.*

/**
 * You are given a string s that consists of lowercase English letters.
 *
 * A string is called special if it is made up of only a single character. For example, the string "abc" is not special,
 * whereas the strings "ddd", "zz", and "f" are special.
 *
 * Return the length of the longest special substring of s which occurs at least thrice,
 * or -1 if no special substring occurs at least thrice.
 *
 * A substring is a contiguous non-empty sequence of characters within a string.
 *
 * [URL](https://leetcode.com/problems/find-longest-special-substring-that-occurs-thrice-i/)
 */
object FindLongestSpecialSubstringThatOccursThriceI {
    fun maximumLength(s: String): Int {
        val counts = HashMap<String, Int>()

        var curr = '-'
        var count = 0
        for (c in s) {
            if (c != curr) {
                count = 1
                curr = c
            } else {
                count++
            }
            var str = c.toString()
            for (i in 0 until count) {
                counts[str] = counts.getOrDefault(str, 0) + 1
                str += c
            }
        }

        var result = -1
        for ((k, v) in counts) {
            if (v >= 3) {
                result = maxOf(result, k.length)
            }
        }
        return result
    }
}
