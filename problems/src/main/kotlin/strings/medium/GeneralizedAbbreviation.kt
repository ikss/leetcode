package strings.medium

/**
 * A word's generalized abbreviation can be constructed by taking any number of non-overlapping and non-adjacent
 * substrings and replacing them with their respective lengths.
 *
 * For example, "abcde" can be abbreviated into:
 * * "a3e" ("bcd" turned into "3")
 * * "1bcd1" ("a" and "e" both turned into "1")
 * * "5" ("abcde" turned into "5")
 * * "abcde" (no substrings replaced)
 *
 * However, these abbreviations are invalid:
 * * "23" ("ab" turned into "2" and "cde" turned into "3") is invalid as the substrings chosen are adjacent.
 * * "22de" ("ab" turned into "2" and "bc" turned into "2") is invalid as the substring chosen overlap.
 * Given a string word, return a list of all the possible generalized abbreviations of word.
 * Return the answer in any order.
 *
 * [URL](https://leetcode.com/problems/generalized-abbreviation/)
 */
object GeneralizedAbbreviation {

    fun generateAbbreviations(word: String): List<String> {
        val result = ArrayList<String>()
        backtrack(result, word, StringBuilder(), 0, 0)
        return result
    }

    private fun backtrack(
        result: ArrayList<String>,
        word: String,
        abbreviation: StringBuilder,
        index: Int,
        count: Int,
    ) {
        if (index == word.length) {
            if (count > 0) {
                abbreviation.append(count)
            }
            result.add(abbreviation.toString())
            return
        }

        val currLength = abbreviation.length

        if (count > 0) {
            abbreviation.append(count)
        }
        abbreviation.append(word[index])
        backtrack(result, word, abbreviation, index + 1, 0)
        abbreviation.setLength(currLength) // Backtrack

        // Option 2: Abbreviate the current character.
        backtrack(result, word, abbreviation, index + 1, count + 1)
    }
}