package strings.easy

/**
 * A string can be abbreviated by replacing any number of non-adjacent, non-empty substrings with their lengths.
 * The lengths should not have leading zeros.
 *
 * For example, a string such as "substitution" could be abbreviated as (but not limited to):
 * * "s10n" ("s ubstitutio n")
 * * "sub4u4" ("sub stit u tion")
 * * "12" ("substitution")
 * * "su3i1u2on" ("su bst i t u ti on")
 * * "substitution" (no substrings replaced)
 *
 * The following are not valid abbreviations:
 * * "s55n" ("s ubsti tutio n", the replaced substrings are adjacent)
 * * "s010n" (has leading zeros)
 * * "s0ubstitution" (replaces an empty substring)
 *
 * Given a string word and an abbreviation abbr, return whether the string matches the given abbreviation.
 *
 * A substring is a contiguous non-empty sequence of characters within a string.
 *
 * [URL](https://leetcode.com/problems/valid-word-abbreviation/)
 */
object ValidWordAbbreviation {
    fun validWordAbbreviation(word: String, abbr: String): Boolean {
        var wi = 0
        var abbri = 0

        while (wi < word.length && abbri < abbr.length) {
            var num = 0
            while (abbri < abbr.length && abbr[abbri].isDigit()) {
                num = num * 10 + (abbr[abbri] - '0')
                if (num == 0) return false
                abbri++
            }
            while (num > 0) {
                wi++
                num--
            }
            if (wi >= word.length || abbri >= abbr.length) {
                break
            }
            if (word[wi++] != abbr[abbri++]) {
                return false
            }
        }

        return wi == word.length && abbri == abbr.length
    }
}