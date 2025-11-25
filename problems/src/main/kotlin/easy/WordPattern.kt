package easy

/**
 * Given a pattern and a string s, find if s follows the same pattern.
 *
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 *
 * [URL](https://leetcode.com/problems/word-pattern/)
 */
object WordPattern {
    fun wordPattern(pattern: String, s: String): Boolean {
        val words = s.split(' ')
        if (pattern.length != words.size) return false

        val charToWord = hashMapOf<Char, String>()
        val wordToChar = hashMapOf<String, Char>()
        for (i in words.indices) {
            val c = pattern[i]
            val word = words[i]
            if (!charToWord.contains(c)) {
                charToWord[c] = words[i]
            }
            if (!wordToChar.contains(word)) {
                wordToChar[word] = c
            }

            if (charToWord[c] != word || wordToChar[word] != c) {
                return false
            }
        }

        return true
    }
}
