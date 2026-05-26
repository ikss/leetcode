package medium

/**
 * You are given a string word. A letter c is called special if it appears both in lowercase and uppercase in word,
 * and every lowercase occurrence of c appears before the first uppercase occurrence of c.
 *
 * Return the number of special letters in word.
 *
 * [URL](https://leetcode.com/problems/count-the-number-of-special-characters-ii/)
 */
object CountTheNumberOfSpecialCharactersII {
    fun numberOfSpecialChars(word: String): Int {
        var result = 0

        val firstUpperCase = IntArray(26) { -1 }
        val lastLowerCase = IntArray(26) { -1 }

        for (i in word.indices) {
            val c = word[i]
            if (c in 'a'..'z') {
                lastLowerCase[c - 'a'] = i
            } else if (c in 'A'..'Z' && firstUpperCase[c - 'A'] == -1) {
                firstUpperCase[c - 'A'] = i
            }
        }

        for (i in 0 until 26) {
            val fu = firstUpperCase[i]
            val ll = lastLowerCase[i]
            if (fu > -1 && ll > -1 && ll < fu) {
                result++
            }
        }

        return result
    }
}
