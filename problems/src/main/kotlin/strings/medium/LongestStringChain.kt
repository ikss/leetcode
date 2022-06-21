package strings.medium


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
    fun longestStrChain(words: Array<String>): Int {
        val dp = mutableMapOf<String, Int>()

        var res = 0
        words.sortedBy { it.length }.forEach { word ->
            var best = 0
            for (i in word.indices) {
                val prev = word.removeRange(i, i + 1)
                best = Math.max(best, (dp[prev] ?: 0) + 1)
            }
            dp[word] = best
            res = Math.max(res, best)
        }
        return res
    }
}
