package strings.hard

/**
 * Given an array of strings words (without duplicates), return all the concatenated words in the given list of words.
 *
 * A concatenated word is defined as a string that is comprised entirely of at least two shorter words in the given array.
 *
 * [URL](https://leetcode.com/problems/concatenated-words/)
 */
object ConcatenatedWords {
    fun findAllConcatenatedWordsInADict(words: Array<String>): List<String> {
        words.sortBy { it.length }
        val result = mutableListOf<String>()
        val minSize = words[0].length * 2
        println(words.contentToString())
        for (w in words) {
            if (w.length >= minSize) {
                if (checkCandidate(w, 0, words)) {
                    result.add(w)
                }
            }
        }
        return result
    }

    private fun checkCandidate(w: String, index: Int, words: Array<String>): Boolean {
        if (w.length == index) return true
        for (candidate in words) {
            if (candidate.length + index > w.length || candidate.length > w.length - words[0].length) break
            if (intersect(w, candidate, index)) {
                if (checkCandidate(w, index + candidate.length, words)) return true
            }
        }
        return false
    }

    private fun intersect(w: String, candidate: String, index: Int): Boolean {
        for (i in candidate.indices) {
            if (w[index + i] != candidate[i]) return false
        }
        return true
    }
}