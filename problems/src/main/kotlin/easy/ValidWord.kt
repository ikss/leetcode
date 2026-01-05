package easy

/**
 * A word is considered valid if:
 * * It contains a minimum of 3 characters.
 * * It contains only digits (0-9), and English letters (uppercase and lowercase).
 * * It includes at least one vowel.
 * * It includes at least one consonant.
 *
 * You are given a string word.
 * Return true if word is valid, otherwise, return false.
 *
 * Notes:
 * 'a', 'e', 'i', 'o', 'u', and their uppercases are vowels.
 * A consonant is an English letter that is not a vowel.
 *
 * [URL](https://leetcode.com/problems/valid-word/)
 */
object ValidWord {
    private val vowels = setOf('a', 'e', 'i', 'o', 'u')

    fun isValid(word: String): Boolean {
        var hasVowel = false
        var hasConsonant = false
        if (word.length < 3) return false

        for (c in word) {
            if (c !in '0'..'9' && c !in 'a'..'z' && c !in 'A'..'Z') {
                return false
            }
            if (c.lowercaseChar() in vowels) {
                hasVowel = true
            } else if (c !in '0'..'9') {
                hasConsonant = true
            }
        }

        return hasVowel && hasConsonant
    }
}
