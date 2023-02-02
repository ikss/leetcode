package strings.easy

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