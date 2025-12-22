package medium

/**
 * You are given an array of n strings strs, all of the same length.
 *
 * We may choose any deletion indices, and we delete all the characters in those indices for each string.
 *
 * For example, if we have strs = `["abcdef","uvwxyz"]` and deletion indices {0, 2, 3},
 * then the final array after deletions is `["bef", "vyz"]`.
 *
 * Suppose we chose a set of deletion indices answer such that after deletions,
 * the final array has its elements in lexicographic order (i.e., strs[0] <= strs[1] <= strs[2] <= ... <= strs[n - 1]).
 * Return the minimum possible value of answer.length.
 *
 * [URL](https://leetcode.com/problems/delete-columns-to-make-sorted-ii/)
 */
object DeleteColumnsToMakeSortedII {
    fun minDeletionSize(strs: Array<String>): Int {
        val m = strs.size
        val n = strs[0].length
        val cuts = BooleanArray(m - 1)

        var result = 0
        for (j in 0..<n) {
            var search = true
            for (i in 0..<m - 1) {
                if (!cuts[i] && strs[i][j] > strs[i + 1][j]) {
                    result++

                    search = false
                    break
                }
            }
            if (!search) {
                continue
            }

            for (i in 0..<m - 1) {
                if (strs[i][j] < strs[i + 1][j]) {
                    cuts[i] = true
                }
            }
        }

        return result
    }
}
