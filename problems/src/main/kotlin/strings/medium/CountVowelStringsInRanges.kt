package strings.medium

/**
 * You are given a 0-indexed array of strings words and a 2D array of integers queries.
 *
 * Each query `queries[i] = [li, ri]`z` asks us to find the number of strings present in the range li to ri
 * (both inclusive) of words that start and end with a vowel.
 *
 * Return an array ans of size queries.length, where `z`ans[i]` is the answer to the ith query.
 *
 * Note that the vowel letters are 'a', 'e', 'i', 'o', and 'u'.
 *
 * [URL](https://leetcode.com/problems/count-vowel-strings-in-ranges/)
 */
object CountVowelStringsInRanges {
    private val vowels = hashSetOf('a', 'e', 'i', 'o', 'u')

    fun vowelStrings(words: Array<String>, queries: Array<IntArray>): IntArray {
        val prefixSum = IntArray(words.size + 1)

        var prev = 0
        for (i in words.indices) {
            val w = words[i]
            if (w[0] in vowels && w[w.length - 1] in vowels) {
                prev++
            }
            prefixSum[i + 1] = prev
        }

        val result = IntArray(queries.size)

        for (i in queries.indices) {
            val (l, r) = queries[i]
            result[i] = prefixSum[r + 1] - prefixSum[l]
        }

        return result
    }
}