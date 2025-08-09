package arrays.medium

/**
 * Given an m x n matrix mat where every row is sorted in strictly increasing order,
 * return the smallest common element in all rows.
 *
 * If there is no common element, return -1.
 *
 * [URL](https://leetcode.com/problems/find-smallest-common-element-in-all-rows/)
 */
object FindSmallestCommonElementInAllRows {
    fun smallestCommonElement(mat: Array<IntArray>): Int {
        val n = mat.size
        val m = mat[0].size

        val indices = IntArray(n)
        var max = Int.MIN_VALUE

        for (i in 0 until n) {
            max = maxOf(max, mat[i][0])
        }

        while (true) {
            for (i in 0 until n) {
                while (mat[i][indices[i]] < max) {
                    indices[i]++
                    if (indices[i] >= m) return -1
                }
            }
            var found = true
            for (i in 0 until n) {
                if (mat[i][indices[i]] > max) {
                    found = false
                    max = mat[i][indices[i]]
                }
            }
            if (found) return max
        }
    }
}
