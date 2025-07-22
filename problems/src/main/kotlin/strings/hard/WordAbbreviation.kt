package strings.hard

import java.util.*

/**
 * The following are the rules for a string abbreviation:
 *
 * 1. The initial abbreviation for each word is: the first character, then the number of characters in between, followed by the last character.
 *
 * 2. If more than one word shares the same abbreviation, then perform the following operation:
 *    * Increase the prefix (characters in the first part) of each of their abbreviations by 1.
 *        * For example, say you start with the words ["abcdef","abndef"] both initially abbreviated as "a4f". Then, a sequence of operations would be ["a4f","a4f"] -> ["ab3f","ab3f"] -> ["abc2f","abn2f"].
 *    * This operation is repeated until every abbreviation is unique.
 *
 * 3. At the end, if an abbreviation did not make a word shorter, then keep it as the original word.
 */
object WordAbbreviation {
    private data class AbbreviationWrapper(
        val abbreviation: String,
        val prefixSize: Int,
    )

    fun wordsAbbreviation(words: List<String>): List<String> {
        val abbreviationMap = HashMap<AbbreviationWrapper, ArrayList<Pair<String, Int>>>()

        for (i in words.indices) {
            val w = words[i]
            val abbreviation = if (w.length < 4) w else w[0].toString() + (w.length - 2) + w[w.length - 1]

            val abbrWrapper = AbbreviationWrapper(abbreviation, 1)

            abbreviationMap.computeIfAbsent(abbrWrapper) { ArrayList() }.add(w to i)
        }

        val pq = PriorityQueue<Pair<AbbreviationWrapper, List<Pair<String, Int>>>> { p1, p2 -> p2.second.size - p1.second.size }
        for ((k, v) in abbreviationMap) {
            pq.offer(k to v)
        }

        while (pq.peek()!!.second.size > 1) {
            val (abbrWrapper, words) = pq.poll()!!
            val (_, prefix) = abbrWrapper
            val map = HashMap<AbbreviationWrapper, ArrayList<Pair<String, Int>>>()
            for ((w, i) in words) {
                val sizeleft = w.length - prefix - 2
                val newAbbr = if (sizeleft <= 1) w else w.substring(0, prefix + 1) + sizeleft + w[w.length - 1]

                val abbrWrapper = AbbreviationWrapper(newAbbr, prefix + 1)

                map.computeIfAbsent(abbrWrapper) { ArrayList() }.add(w to i)
            }
            for ((k, v) in map) {
                pq.offer(k to v)
            }
        }

        val result = ArrayList<Pair<Int, String>>()

        while (pq.isNotEmpty()) {
            val (abbrWrapper, words) = pq.poll()!!
            result.add(words[0].second to abbrWrapper.abbreviation)
        }

        return result.sortedBy { it.first }.map { it.second }
    }
}