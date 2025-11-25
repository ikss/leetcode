package hard

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
        var map = HashMap<AbbreviationWrapper, ArrayList<Pair<String, Int>>>()

        for (i in words.indices) {
            val w = words[i]
            val abbreviation = if (w.length < 4) w else w[0].toString() + (w.length - 2) + w[w.length - 1]

            val abbrWrapper = AbbreviationWrapper(abbreviation, 1)

            map.computeIfAbsent(abbrWrapper) { ArrayList() }.add(w to i)
        }

        val result = ArrayList<Pair<Int, String>>()
        do {
            val newMap = HashMap<AbbreviationWrapper, ArrayList<Pair<String, Int>>>()
            for ((k, v) in map) {
                if (v.size == 1) {
                    // If the abbreviation is unique, we can keep it as is
                    result.add(v[0].second to k.abbreviation)
                    continue
                }
                for ((w, i) in v) {
                    val sizeleft = w.length - k.prefixSize - 2
                    val newAbbr =
                        if (sizeleft <= 1) w else w.substring(0, k.prefixSize + 1) + sizeleft + w[w.length - 1]

                    val abbrWrapper = AbbreviationWrapper(newAbbr, k.prefixSize + 1)

                    newMap.computeIfAbsent(abbrWrapper) { ArrayList() }.add(w to i)
                }
            }
            map = newMap
        } while (map.isNotEmpty())

        return result.sortedBy { it.first }.map { it.second }
    }
}