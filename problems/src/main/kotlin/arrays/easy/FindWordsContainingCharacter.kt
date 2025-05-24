package arrays.easy

/**
 * You are given a 0-indexed array of strings words and a character x.
 *
 * Return an array of indices representing the words that contain the character x.
 *
 * Note that the returned array may be in any order.
 *
 * [URL](https://leetcode.com/problems/find-words-containing-character/)
 */
object FindWordsContainingCharacter {
    fun findWordsContaining(words: Array<String>, x: Char): List<Int> {
        val result = ArrayList<Int>()

        for (i in words.indices) {
            for (c in words[i]) {
                if (c == x) {
                    result.add(i)
                    break
                }
            }
        }

        return result
    }
}
