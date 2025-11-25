package medium

/**
 * You are given an array of words where each word consists of lowercase English letters.
 * wordA is a predecessor of wordB if and only if we can insert exactly one letter anywhere in wordA
 * without changing the order of the other characters to make it equal to wordB.
 *
 * * For example, "abc" is a predecessor of "abac", while "cba" is not a predecessor of "bcad".
 * A word chain is a sequence of words `[word1, word2, ..., wordk]` with k >= 1, where word1 is a predecessor of word2,
 * word2 is a predecessor of word3, and so on. A single word is trivially a word chain with k == 1.
 *
 * Return the length of the longest possible word chain with words chosen from the given list of words.
 *
 * [URL](https://leetcode.com/problems/longest-string-chain/)
 */
object LongestStringChain {
    fun longestStrChainMy(words: Array<String>): Int {
        words.sortBy { it.length }

        var result = 1
        val distance = HashMap<String, Int>()
        for (i in words.indices) {
            result = maxOf(result, calculateDistance(words, distance, i))
        }

        return result
    }

    private fun isPredecessor(w1: String, w2: String): Boolean {
        var i = 0
        var j = 0
        var skipped = false
        while (i < w1.length) {
            if (w1[i] != w2[j]) {
                if (skipped) return false
                skipped = true
                j++
            } else {
                i++
                j++
            }
        }
        return true
    }

    private fun calculateDistance(words: Array<String>, distance: HashMap<String, Int>, curr: Int): Int {
        val word = words[curr]
        distance[word]?.let { return it }
        var result = 1

        for (i in curr + 1 until words.size) {
            val next = words[i]
            if (next.length == word.length) continue
            if (next.length > word.length + 1) break
            if (isPredecessor(word, next)) {
                result = maxOf(result, 1 + calculateDistance(words, distance, i))
            }
        }

        distance[word] = result
        return result
    }

    fun longestStrChain(words: Array<String>): Int {
        val dp = HashMap<String, Int>()
        words.sortBy { it.length }

        var result = 0
        for (word in words) {
            var best = 0
            for (i in word.indices) {
                val prev = word.substring(0, i) + word.substring(i + 1)
                best = maxOf(best, dp.getOrDefault(prev, 0) + 1)
            }
            dp[word] = best
            result = maxOf(result, best)
        }
        return result
    }
}
