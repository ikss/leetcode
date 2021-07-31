package strings.easy

/**
 * We define the usage of capitals in a word to be right when one of the following cases holds:

 * * All letters in this word are capitals, like "USA".
 * * All letters in this word are not capitals, like "leetcode".
 * * Only the first letter in this word is capital, like "Google".
 * Given a string word, return true if the usage of capitals in it is right.
 *
 * URL: [https://leetcode.com/problems/detect-capital/]
 */
object DetectCapital {

    fun detectCapitalUse(word: String): Boolean {
        var wasCapital = true
        word.toCharArray().forEachIndexed { i, c ->
            wasCapital = if (c.isUpperCase()) {
                if (!wasCapital) {
                    return false
                }
                true
            } else {
                if (wasCapital && i > 1) {
                    return false
                }
                false
            }
        }
        return true
    }
}
