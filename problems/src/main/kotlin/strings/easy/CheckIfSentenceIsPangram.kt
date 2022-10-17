package strings.easy

/**
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 *
 * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram,
 * or false otherwise.
 *
 * [URL](https://leetcode.com/problems/check-if-the-sentence-is-pangram/)
 */
object CheckIfSentenceIsPangram {
    fun checkIfPangram(sentence: String): Boolean {
        val hash = IntArray(26)

        for (c in sentence) {
            hash[c - 'a']++
        }
        println(hash.contentToString())
        return hash.none { it == 0 }
    }
}