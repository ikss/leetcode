package strings


/**
 * Given a string s and a dictionary of strings wordDict, return true if s can be segmented
 * into a space-separated sequence of one or more dictionary words.
 *
 * Note that the same word in the dictionary may be reused multiple times in the segmentation.
 *
 * [URL](https://leetcode.com/problems/word-break/)
 */
object WordBreak {
    // TLE
    fun wordBreakBacktrack(s: String, wordDict: List<String>): Boolean {
        val min = wordDict.minOf { it.length }
        val max = wordDict.maxOf { it.length }
        val cache = Array<Boolean?>(s.length) { null }

        return backtrack(0, s, min, max, wordDict.toSet(), cache)
    }

    private fun backtrack(
        start: Int,
        s: String,
        min: Int,
        max: Int,
        words: Set<String>,
        cache: Array<Boolean?>,
    ): Boolean {
        if (start == s.length) return true
        cache[start]?.let { return it }

        for (i in start + min..s.length) {
            if (i - start > max) break
            val substr = s.substring(start, i)
            if (words.contains(substr)) {
                if (backtrack(i, s, min, max, words, cache)) return true
            }
        }

        return false
    }

    fun wordBreakDp(s: String, wordDict: List<String>): Boolean {
        val dp = BooleanArray(s.length)
        for (i in s.indices) {
            for (word in wordDict) {
                // Handle out of bounds case
                if (i < word.length - 1) {
                    continue
                }
                if (i == word.length - 1 || dp[i - word.length]) {
                    if (s.substring(i - word.length + 1, i + 1) == word) {
                        dp[i] = true
                        break
                    }
                }
            }
        }

        return dp[s.length - 1]
    }
}