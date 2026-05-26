package easy

import java.util.*

/**
 * You are given a string word. A letter is called special if it appears both in lowercase and uppercase in word.
 *
 * Return the number of special letters in word.
 *
 * [URL](https://leetcode.com/problems/count-the-number-of-special-characters-i/)
 */
object CountTheNumberOfSpecialCharactersI {
    fun numberOfSpecialChars(word: String): Int {
        val lowerCase = IntArray(26)
        val upperCase = IntArray(26)

        var result = 0

        for (c in word) {
            if (c in 'a'..'z') {
                val i = c - 'a'
                if (lowerCase[i] > 0) continue
                lowerCase[i]++
                if (upperCase[i] > 0) result++
            } else if (c in 'A'..'Z') {
                val i = c - 'A'
                if (upperCase[i] > 0) continue
                upperCase[i]++
                if (lowerCase[i] > 0) result++
            }
        }

        return result
    }
}
