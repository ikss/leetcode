package easy

/**
 * Given an array of strings words, return true if it forms a valid word square.
 *
 * A sequence of strings forms a valid word square if the kth row and column read the same string,
 * where 0 <= k < max(numRows, numColumns).
 *
 * [URL](https://leetcode.com/problems/valid-word-square/)
 */
object ValidWordSquare {
    fun validWordSquare(words: List<String>): Boolean {
        for (row in words.indices) {
            if (!valid(words, row)) {
                return false
            }
        }
        return true
    }

    private fun valid(words: List<String>, row: Int): Boolean {
        val word = words[row]
        for (i in word.indices) {
            if (words.size <= i || words[i].length <= row || word[i] != words[i][row]) return false
        }
        return true
    }
}