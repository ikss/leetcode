package strings.easy

/**
 * You are given an array of strings words and a string chars.
 *
 * A string is good if it can be formed by characters from chars (each character can only be used once).
 *
 * Return the sum of lengths of all good strings in words.
 *
 * [URL](https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/)
 */
object FindWordsThatCanBeFormedByCharacters {
    fun countCharacters(words: Array<String>, chars: String): Int {
        val hash = getHash(chars)

        var result = 0
        for (w in words) {
            if (isGood(w, hash)) {
                result += w.length
            }
        }

        return result
    }

    private fun isGood(w: String, hash: IntArray): Boolean {
        val whash = getHash(w)
        for (i in whash.indices) {
            if (whash[i] > hash[i]) return false
        }
        return true
    }

    private fun getHash(s: String): IntArray {
        val result = IntArray(26)
        for (c in s) {
            result[c - 'a']++
        }
        return result
    }
}