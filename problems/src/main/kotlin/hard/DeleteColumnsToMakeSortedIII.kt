package hard

/**
 * You are given an array of n strings strs, all of the same length.
 *
 * We may choose any deletion indices, and we delete all the characters in those indices for each string.
 *
 * For example, if we have `strs = ["abcdef","uvwxyz"]` and deletion indices {0, 2, 3},
 * then the final array after deletions is `["bef", "vyz"]`.
 *
 * Suppose we chose a set of deletion indices answer such that after deletions, the final array has every string (row)
 * in lexicographic order. (i.e., (strs[0][0] <= strs[0][1] <= ... <= strs[0][strs[0].length - 1]),
 * and (strs[1][0] <= strs[1][1] <= ... <= strs[1][strs[1].length - 1]), and so on).
 * Return the minimum possible value of answer.length.
 *
 * [URL](https://leetcode.com/problems/delete-columns-to-make-sorted-iii/)
 */
object DeleteColumnsToMakeSortedIII {
    fun minDeletionSize(strs: Array<String>): Int {
        val m = strs[0].length
        val dp = IntArray(m) { 1 }
        for (i in m - 2 downTo 0) {
            for (j in i + 1..<m) {
                var shouldSkip = false
                for (row in strs) {
                    if (row[i] > row[j]) {
                        shouldSkip = true
                        break
                    }
                }
                if (shouldSkip) {
                    continue
                }

                dp[i] = maxOf(dp[i], 1 + dp[j])
            }
        }

        return m - dp.max()
    }
}
