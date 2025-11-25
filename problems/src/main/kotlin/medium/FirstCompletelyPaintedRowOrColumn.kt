package medium

/**
 * You are given a 0-indexed integer array arr, and an m x n integer matrix mat. arr and mat both contain all
 * the integers in the range `[1, m * n]`.
 *
 * Go through each index i in arr starting from index 0 and paint the cell in mat containing the integer `arr[i]`.
 *
 * Return the smallest index i at which either a row or a column will be completely painted in mat.
 *
 * [URL](https://leetcode.com/problems/first-completely-painted-row-or-column/)
 */
object FirstCompletelyPaintedRowOrColumn {
    fun firstCompleteIndex(arr: IntArray, mat: Array<IntArray>): Int {
        val rowCount = mat.size
        val colCount = mat[0].size
        val indices = HashMap<Int, Pair<Int, Int>>()

        for (r in mat.indices) {
            for (c in mat[0].indices) {
                indices[mat[r][c]] = r to c
            }
        }

        val rows = IntArray(mat.size)
        val cols = IntArray(mat[0].size)

        for (i in arr.indices) {
            val n = arr[i]
            val (r, c) = indices[n]!!

            if (++cols[c] == rowCount || ++rows[r] == colCount) {
                return i
            }
        }

        return -1
    }
}
