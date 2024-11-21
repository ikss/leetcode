package strings.easy

/**
 * You are given an array of strings words and a string pref.
 *
 * Return the number of strings in words that contain pref as a prefix.
 *
 * A prefix of a string s is any leading contiguous substring of s.
 *
 * [URL](https://leetcode.com/problems/counting-words-with-a-given-prefix/)
 */
object CountingWordsWithGivenPrefix {
    fun prefixCount(words: Array<String>, pref: String): Int {
        return words.count { it.startsWith(pref) }
    }
}
