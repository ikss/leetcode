package strings.easy

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
 * [URL](https://leetcode.com/problems/binary-search/)
 */
object LongestUnequalAdjacentGroupsSubsequenceI {
    fun getLongestSubsequence(words: Array<String>, groups: IntArray): List<String> {
        val result = ArrayList<String>()

        var prev = -1

        for (i in words.indices) {
            val curr = groups[i]
            if (curr == prev) continue
            prev = curr
            result.add(words[i])
        }

        return result
    }
}
