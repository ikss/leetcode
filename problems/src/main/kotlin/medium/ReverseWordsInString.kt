package medium

/**
 * Given an input string s, reverse the order of the words.
 *
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 *
 * Return a string of the words in reverse order concatenated by a single space.
 *
 * Note that s may contain leading or trailing spaces or multiple spaces between two words.
 * The returned string should only have a single space separating the words. Do not include any extra spaces.
 *
 * [URL](https://leetcode.com/problems/reverse-words-in-a-string/)
 */
object ReverseWordsInString {
    fun reverseWordsOneLiner(s: String): String =
        s.split(" ").map { it.trim() }.filter { it.isNotEmpty() }.reversed().joinToString(" ")

    fun reverseWordsSimple(s: String): String {
        val result = mutableListOf<String>()

        var start = -1
        for (i in s.indices) {
            val char = s[i]
            if (char == ' ') {
                if (start != -1) {
                    result.add(s.substring(start, i))
                    start = -1
                }
            } else if (start == -1) {
                start = i
            }
        }
        if (start != -1) {
            result.add(s.substring(start))
        }

        return result.reversed().joinToString(" ")
    }
}
