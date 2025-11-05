package strings.medium

import java.util.*

/**
 * Given a list of phrases, generate a list of Before and After puzzles.
 *
 * A phrase is a string that consists of lowercase English letters and spaces only. No space appears in the start or
 * the end of a phrase. There are no consecutive spaces in a phrase.
 *
 * Before and After puzzles are phrases that are formed by merging two phrases where the last word of the first phrase
 * is the same as the first word of the second phrase.
 *
 * Return the Before and After puzzles that can be formed by every two phrases `phrases[i]` and `phrases[j]`
 * where i != j. Note that the order of matching two phrases matters, we want to consider both orders.
 *
 * You should return a list of distinct strings sorted lexicographically.
 *
 * [URL](https://leetcode.com/problems/before-and-after-puzzle/)
 */
object BeforeAndAfterPuzzle {
    fun beforeAndAfterPuzzles(phrases: Array<String>): List<String> {
        val byFirstWord = phrases.groupBy { it.substringBefore(' ') }

        val results = TreeSet<String>()
        for (phrase in phrases) {
            val lastWord = phrase.substringAfterLast(' ')
            val matchingPhrases = byFirstWord[lastWord] ?: continue
            for (match in matchingPhrases) {
                if (phrase !== match) {
                    results.add(phrase + match.substring(lastWord.length))
                }
            }
        }
        return results.toList()
    }
}