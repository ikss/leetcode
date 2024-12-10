package strings.medium

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
 * [URL](https://leetcode.com/problems/find-longest-special-substring-that-occurs-thrice-ii/)
 */
object FindLongestSpecialSubstringThatOccursThriceII {
    fun maximumLength(s: String): Int {
        val counts = Array(26) { IntArray(s.length + 1) }

        var curr = '-'
        var count = 0
        for (c in s) {
            if (c != curr) {
                count = 1
                curr = c
            } else {
                count++
            }
            val ind = c - 'a'
            counts[ind][count]++
        }

        var result = -1
        for (c in 0 until 26) {
            for (len in s.length - 1 downTo 1) {
                counts[c][len] += counts[c][len + 1]
                if (counts[c][len] >= 3) {
                    result = maxOf(result, len)
                    break
                }
            }
        }

        return result
    }
}
