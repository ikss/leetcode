package easy

/**
 * In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different order.
 * The order of the alphabet is some permutation of lowercase letters.
 *
 * Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if
 * the given words are sorted lexicographically in this alien language.
 *
 * [URL](https://leetcode.com/problems/verifying-an-alien-dictionary/)
 */
object VerifyingAnAlienDictionary {
    fun isAlienSortedOfficial(words: Array<String>, order: String): Boolean {
        val orderMap = IntArray(26)
        for (i in order.indices) {
            orderMap[order[i] - 'a'] = i
        }
        for (i in 0 until words.size - 1) {
            for (j in 0 until words[i].length) {
                // If we do not find a mismatch letter between words[i] and words[i + 1],
                // we need to examine the case when words are like ("apple", "app").
                if (j >= words[i + 1].length) return false

                if (words[i][j] != words[i + 1][j]) {
                    val currentWordChar = words[i][j] - 'a'
                    val nextWordChar = words[i + 1][j] - 'a'
                    if (orderMap[currentWordChar] <= orderMap[nextWordChar]) {
                        break
                    }
                    return false
                }
            }
        }
        return true
    }

    fun isAlienSortedNaive(words: Array<String>, order: String): Boolean {
        val mapped = remap(words, order)
        return mapped == mapped.sorted()
    }

    private fun remap(words: Array<String>, order: String): List<String> {
        val map = mutableMapOf<Char, Char>()
        for (i in order.indices) {
            val char = order[i]
            map[char] = 'a' + i
        }

        return words.map { w ->
            buildString {
                for (c in w) {
                    append(map[c]!!)
                }
            }
        }
    }
}