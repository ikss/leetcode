package strings.medium

/**
 * Given a character array s, reverse the order of the words.
 *
 * A word is defined as a sequence of non-space characters. The words in s will be separated by a single space.
 *
 * Your code must solve the problem in-place, i.e. without allocating extra space.
 *
 * [URL](https://leetcode.com/problems/reverse-words-in-a-string-ii/)
 */
object ReverseWordsInStringII {
    fun reverseWords(s: CharArray) {
        reverse(s, 0, s.size)
        var start = 0
        var end = 0

        while (end <= s.size) {
            if (end == s.size || s[end] == ' ') {
                reverse(s, start, end)
                start = end + 1
            }
            end++
        }
    }

    private fun reverse(s: CharArray, start: Int, end: Int) {
        val size = end - start
        for (i in 0 until size / 2) {
            val tmp = s[start + i]
            s[start + i] = s[end - i - 1]
            s[end - i - 1] = tmp
        }
    }
}