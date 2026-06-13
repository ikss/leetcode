package easy

/**
 * You are given an array of strings words, where each string represents a word containing lowercase English letters.
 *
 * You are also given an integer array weights of length 26,
 * where `weights[i]` represents the weight of the ith lowercase English letter.
 *
 * The weight of a word is defined as the sum of the weights of its characters.
 *
 * For each word, take its weight modulo 26 and map the result to a lowercase
 * English letter using reverse alphabetical order (0 -> 'z', 1 -> 'y', ..., 25 -> 'a').
 *
 * Return a string formed by concatenating the mapped characters for all words in order.
 *
 * [URL](https://leetcode.com/problems/weighted-word-mapping/)
 */
object WeightedWordMapping {
    fun mapWordWeights(words: Array<String>, weights: IntArray): String {
        val result = StringBuilder(words.size)

        for (w in words) {
            result.append(mapToChar(w, weights))
        }

        return result.toString()
    }

    private fun mapToChar(w: String, weights: IntArray): Char {
        var result = 0

        for (c in w) {
            result += weights[c - 'a']
        }

        return 'a' + (26 - result % 26 - 1)
    }
}
