package strings.medium

import java.util.*

/**
 * Given a 0-indexed string s, permute s to get a new string t such that:
 *
 * * All consonants remain in their original places. More formally, if there is an index i with 0 <= i < s.length
 * such that `s[i]` is a consonant, then `t[i] = s[i]`.
 * * The vowels must be sorted in the nondecreasing order of their ASCII values.
 * More formally, for pairs of indices i, j with 0 <= i < j < s.length such that `s[i]` and `s[j]` are vowels,
 * then `t[i]` must not have a higher ASCII value than `t[j]`.
 *
 * Return the resulting string.
 *
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in lowercase or uppercase.
 * Consonants comprise all letters that are not vowels.
 *
 * [URL](https://leetcode.com/problems/break-a-palindrome/)
 */
object SortVowelsInString {
    // Returns true if the character is a vowel.
    private fun isVowel(c: Char): Boolean {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'
    }

    fun sortVowels(s: String): String {
        val count = IntArray('u' - 'A' + 1)

        // Store the frequencies for each character.
        for (c in s) {
            if (isVowel(c)) {
                count[c - 'A']++
            }
        }

        // Sorted string having all the vowels.
        val sortedVowel = "AEIOUaeiou"
        val ans = StringBuilder(s.length)
        var j = 0
        for (c in s) {
            if (isVowel(c)) {
                // Skip to the character which is having remaining count.
                while (count[sortedVowel[j] - 'A'] == 0) {
                    j++
                }
                ans.append(sortedVowel[j])
                count[sortedVowel[j] - 'A']--
            } else {
                ans.append(c)
            }
        }
        return ans.toString()
    }
}