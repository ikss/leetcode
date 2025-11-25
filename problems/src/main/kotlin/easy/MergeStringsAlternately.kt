package easy

/**
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with
 * word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 *
 * Return the merged string.
 *
 * [URL](https://leetcode.com/problems/merge-strings-alternately/)
 */
object MergeStringsAlternately {

    fun mergeAlternately(word1: String, word2: String): String {
        val result = StringBuilder()

        for (i in 0 until maxOf(word1.length, word2.length)) {
            if (i < word1.length) {
                result.append(word1[i])
            }
            if (i < word2.length) {
                result.append(word2[i])
            }
        }

        return result.toString()
    }
}