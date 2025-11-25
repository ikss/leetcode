package easy

/**
 * There is a malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly.
 *
 * Given a string text of words separated by a single space (no leading or trailing spaces) and a string brokenLetters
 * of all distinct letter keys that are broken, return the number of words in text you can fully type using this keyboard.
 *
 * [URL](https://leetcode.com/problems/maximum-number-of-words-you-can-type/)
 */
object MaximumNumberOfWordsYouCanType {
    fun canBeTypedWords(text: String, brokenLetters: String): Int {
        var result = 0
        val brokenSet = BooleanArray(26)

        for (br in brokenLetters) {
            brokenSet[br - 'a'] = true
        }

        var hasWrongLetter = false
        for (c in text) {
            if (c == ' ') {
                if (!hasWrongLetter) {
                    result++
                }
                hasWrongLetter = false
            } else if (brokenSet[c - 'a']) {
                hasWrongLetter = true
            }
        }
        if (!hasWrongLetter) {
            result++
        }

        return result
    }
}