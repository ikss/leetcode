package medium

import java.util.*

/**
 * The abbreviation of a word is a concatenation of its first letter, the number of characters between the first
 * and last letter, and its last letter. If a word has only two characters, then it is an abbreviation of itself.
 *
 * For example:
 * * dog --> d1g because there is one letter between the first letter 'd' and the last letter 'g'.
 * * internationalization --> i18n because there are 18 letters between the first letter 'i' and the last letter 'n'.
 * * it --> it because any word with only two characters is an abbreviation of itself.
 *
 * Implement the ValidWordAbbr class:
 * * ValidWordAbbr(String[] dictionary) Initializes the object with a dictionary of words.
 * * boolean isUnique(string word) Returns true if either of the following conditions are met (otherwise returns false):
 * * * There is no word in dictionary whose abbreviation is equal to word's abbreviation.
 * * * For any word in dictionary whose abbreviation is equal to word's abbreviation, that word and word are the same.
 *
 * [URL](https://leetcode.com/problems/unique-word-abbreviation/)
 */
object UniqueWordAbbreviation {
    class ValidWordAbbr(dictionary: Array<String>) {
        val dict = dictionary.toSet()
        val abbrMap = HashMap<String, Boolean>()

        init {
            dict.forEach { word ->
                val abbr = getAbbr(word)
                abbrMap[abbr] = abbr !in abbrMap
            }
        }

        fun isUnique(word: String): Boolean {
            val uniqueInAbbrMap = abbrMap[getAbbr(word)]
            return uniqueInAbbrMap == null || (uniqueInAbbrMap && word in dict)
        }

        private fun getAbbr(word: String): String {
            if (word.length < 3) {
                return word
            }
            return buildString {
                append(word[0])
                append(word.length - 2)
                append(word[word.length - 1])
            }
        }

    }
}