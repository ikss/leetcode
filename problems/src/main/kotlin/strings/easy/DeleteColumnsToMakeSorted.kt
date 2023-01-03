package strings.easy

/**
 * You are given an array of n strings strs, all of the same length.
 *
 * The strings can be arranged such that there is one on each line, making a grid. For example,
 * strs = `["abc", "bce", "cae"]` can be arranged as:
 *
 * * abc
 * * bce
 * * cae
 *
 * You want to delete the columns that are not sorted lexicographically. In the above example (0-indexed),
 * columns 0 ('a', 'b', 'c') and 2 ('c', 'e', 'e') are sorted while column 1 ('b', 'c', 'a') is not,
 * so you would delete column 1.
 *
 * Return the number of columns that you will delete.
 *
 * [URL](https://leetcode.com/problems/delete-columns-to-make-sorted/)
 */
object DeleteColumnsToMakeSorted {
    fun minDeletionSize(strs: Array<String>): Int {
        var result = 0
        for (j in 0 until strs[0].length) {
            for (i in 1 until strs.size) {
                if (strs[i][j] < strs[i - 1][j]) {
                    result++
                    break
                }
            }
        }

        return result
    }
}