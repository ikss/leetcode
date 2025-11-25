package medium

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
    private fun isVowel(c: Char): Boolean {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'
    }

    fun sortVowels(s: String): String {
        val array = IntArray('u' - 'A' + 1)
        var seenVowel = false

        for (c in s) {
            if (!isVowel(c)) continue
            seenVowel = true
            array[c - 'A']++
        }

        if (!seenVowel) return s

        val result = StringBuilder()

        var currIndex = 0
        for (c in s) {
            if (!isVowel(c)) {
                result.append(c)
                continue
            }

            while (array[currIndex] == 0) {
                currIndex++
            }
            result.append('A' + currIndex)
            array[currIndex]--
        }

        return result.toString()
    }
}