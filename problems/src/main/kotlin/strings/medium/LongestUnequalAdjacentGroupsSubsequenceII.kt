package strings.medium

/**
 * You are given a string array words and a binary array groups both of length n,
 * where `words[i]` is associated with `groups[i]`.
 *
 * Your task is to select the longest alternating subsequence from words.
 * A subsequence of words is alternating if for any two consecutive strings in the sequence,
 * their corresponding elements in the binary array groups differ. Essentially, you are to choose strings such that
 * adjacent elements have non-matching corresponding bits in the groups array.
 *
 * Formally, you need to find the longest subsequence of an array of indices `[0, 1, ..., n - 1]` denoted as
 * `[i0, i1, ..., ik-1]`, such that `groups[ij] != groups[ij+1]` for each 0 <= j < k - 1
 * and then find the words corresponding to these indices.
 *
 * Return the selected subsequence. If there are multiple answers, return any of them.
 *
 * [URL](https://leetcode.com/problems/longest-unequal-adjacent-groups-subsequence-ii/)
 */
object LongestUnequalAdjacentGroupsSubsequenceII {
    fun getWordsInLongestSubsequence(words: Array<String>, groups: IntArray): List<String> {
        val n = words.size
        val dp = Array(n) { index -> arrayListOf(words[index]) }

        for (i in 1 until n) {
            for (j in 0 until i) {
                if (groups[j] != groups[i] && fitHamming(words[j], words[i]) && dp[i].size < dp[j].size + 1) {
                    dp[i] = ArrayList(dp[j])
                    dp[i].add(words[i])
                }
            }
        }
        return dp.maxByOrNull { it.size } ?: emptyList()
    }

    private fun fitHamming(w1: String, w2: String): Boolean {
        if (w1.length != w2.length) {
            return false
        }

        var diff = 0

        for (i in w1.indices) {
            if (w1[i] == w2[i]) continue
            if (++diff > 1) break
        }

        return diff <= 1
    }
}
