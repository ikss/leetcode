package easy

/**
 * Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the
 * index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
 *
 * * For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at
 * 3 (inclusive). The resulting string will be "dcbaefd".
 * Return the resulting string.
 *
 * [URL](https://leetcode.com/problems/reverse-prefix-of-word/)
 */
object ReversePrefixOfWord {
    fun reversePrefix(word: String, ch: Char): String {
        val chIndex = word.indexOf(ch)
        if (chIndex == -1) {
            return word
        }

        val result = StringBuilder()

        for (i in word.indices) {
            // Add characters through ch to the result in reverse order
            if (i <= chIndex) {
                result.append(word[chIndex - i])
            } else {
                result.append(word[i])
            }
        }

        return result.toString()
    }
}