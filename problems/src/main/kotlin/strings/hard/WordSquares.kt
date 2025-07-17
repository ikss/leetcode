package strings.hard

/**
 * Given an array of unique strings words, return all the word squares you can build from words.
 * The same word from words can be used multiple times. You can return the answer in any order.
 *
 * A sequence of strings forms a valid word square if the kth row and column read the same string,
 * where 0 <= k < max(numRows, numColumns).
 *
 * * For example, the word sequence `["ball","area","lead","lady"]` forms a word square because each word reads the
 * same both horizontally and vertically.
 *
 * [URL](https://leetcode.com/problems/concatenated-words/)
 */
object WordSquares {
    fun wordSquares(words: Array<String>): List<List<String>> {
        val wordsByPrefix = HashMap<String, ArrayList<String>>()

        for (w in words) {
            for (i in 1 until w.length) {
                wordsByPrefix.computeIfAbsent(w.substring(0, i)) { ArrayList() }.add(w)
            }
        }

        val result = ArrayList<ArrayList<String>>()

        for (w in words) {
            backtrack(words, wordsByPrefix, result, arrayListOf(w))
        }

        return result
    }

    private fun backtrack(
        words: Array<String>,
        wordsByPrefix: Map<String, List<String>>,
        result: ArrayList<ArrayList<String>>,
        curr: ArrayList<String>,
    ) {
        if (curr.size == words[0].length) {
            result.add(ArrayList(curr))
            return
        }

        val prefix = StringBuilder()

        for (w in curr) {
            prefix.append(w[curr.size])
        }

        for (next in wordsByPrefix[prefix.toString()].orEmpty()) {
            curr.add(next)
            backtrack(words, wordsByPrefix, result, curr)
            curr.removeLast()
        }
    }
}
