package strings.easy

/**
 * A sentence is a string of single-space separated words where each word consists only of lowercase letters.
 *
 * A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
 *
 * Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.
 *
 * [URL](https://leetcode.com/problems/uncommon-words-from-two-sentences/)
 */
object UncommonWordsFromTwoSentences {
    fun uncommonFromSentences(s1: String, s2: String): Array<String> {
        val map = HashMap<String, Int>()
        for (w in s1.split(" ")) {
            map.merge(w, 1, Int::plus)
        }
        for (w in s2.split(" ")) {
            map.merge(w, 1, Int::plus)
        }
        val result = ArrayList<String>()

        for ((k, v) in map) {
            if (v == 1) {
                result.add(k)
            }
        }

        return result.toTypedArray()
    }
}