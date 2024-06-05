package strings.easy

import java.util.*


/**
 * Given a string array words, return an array of all characters that show up in all strings within the words
 * (including duplicates). You may return the answer in any order.
 *
 * [URL](https://leetcode.com/problems/find-common-characters/)
 */
object FindCommonCharacters {

    fun commonChars(words: Array<String>): List<String> {
        val wordsSize = words.size
        val commonCharacterCounts = IntArray(26)
        val currentCharacterCounts = IntArray(26)
        val result = ArrayList<String>()

        for (c in words[0]) {
            commonCharacterCounts[c - 'a']++
        }

        for (wi in 1 until wordsSize) {
            Arrays.fill(currentCharacterCounts, 0)

            for (c in words[wi]) {
                currentCharacterCounts[c - 'a']++
            }

            for (c in 0..25) {
                commonCharacterCounts[c] = minOf(commonCharacterCounts[c], currentCharacterCounts[c])
            }
        }

        for (i in 0..25) {
            for (commonCount in 0 until commonCharacterCounts[i]) {
                result.add(('a' + i).toString())
            }
        }

        return result
    }
}