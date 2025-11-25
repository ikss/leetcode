package medium

/**
 * Given a list of strings words and a string pattern, return a list of `words[i]` that match pattern.
 * You may return the answer in any order.
 * A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x
 * in the pattern with p(x), we get the desired word.
 *
 * Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter,
 * and no two letters map to the same letter.
 *
 * [URL](https://leetcode.com/problems/find-and-replace-pattern/)
 */
object FindAndReplacePattern {
    fun findAndReplacePatternStraightforward(words: Array<String>, pattern: String): List<String> {
        return words.filter { samePattern(it, pattern) }
    }

    private fun samePattern(word: String, pattern: String): Boolean {
        if (word.length != pattern.length) return false

        val mappingToPattern = mutableMapOf<Char, Char>()
        val mappingFromPattern = mutableMapOf<Char, Char>()

        for (i in pattern.indices) {
            val patternChar = pattern[i]
            val wordChar = word[i]

            val toPattern = mappingToPattern[wordChar]
            val fromPattern = mappingFromPattern[patternChar]

            if (
                (fromPattern != null && (toPattern == null || wordChar != fromPattern)) ||
                (toPattern != null && (fromPattern == null || patternChar != toPattern))
            ) {
                return false
            }

            mappingToPattern[wordChar] = patternChar
            mappingFromPattern[patternChar] = wordChar

        }
        return true
    }
}
