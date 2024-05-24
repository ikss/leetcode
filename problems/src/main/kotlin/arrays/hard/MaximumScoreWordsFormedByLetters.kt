package arrays.hard

/**
 * Given a list of words, list of  single letters (might be repeating) and score of every character.
 *
 * Return the maximum score of any valid set of words formed by using the given letters
 * (`words[i]` cannot be used two or more times).
 *
 * It is not necessary to use all characters in letters and each letter can only be used once.
 * Score of letters 'a', 'b', 'c', ... ,'z' is given by score[0], score[1], ... , score[25] respectively.
 *
 * [URL](https://leetcode.com/problems/maximum-score-words-formed-by-letters/)
 */
object MaximumScoreWordsFormedByLetters {
    fun maxScoreWords(words: Array<String>, letters: CharArray, score: IntArray): Int {
        val freq = IntArray(26)
        for (c in letters) {
            freq[c - 'a']++
        }
        return check(0, words, score, IntArray(26), 0, freq)
    }

    private fun isValid(subsetLetters: IntArray, freq: IntArray): Boolean {
        for (c in 0..25) {
            if (freq[c] < subsetLetters[c]) {
                return false
            }
        }
        return true
    }

    private fun check(
        w: Int,
        words: Array<String>,
        score: IntArray,
        subsetLetters: IntArray,
        totalScore: Int,
        freq: IntArray,
    ): Int {
        if (w == words.size) {
            return totalScore
        }
        // Not adding
        var result = check(w + 1, words, score, subsetLetters, totalScore, freq)
        // Adding
        val l = words[w].length
        var totalScore = totalScore
        for (i in 0 until l) {
            val c = words[w][i] - 'a'
            subsetLetters[c]++
            totalScore += score[c]
        }

        if (isValid(subsetLetters, freq)) {
            result = maxOf(result, check(w + 1, words, score, subsetLetters, totalScore, freq))
        }
        for (i in 0 until l) {
            val c = words[w][i] - 'a'
            subsetLetters[c]--
        }
        return result
    }
}
