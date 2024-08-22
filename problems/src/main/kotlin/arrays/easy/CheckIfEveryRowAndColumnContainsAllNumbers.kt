package arrays.easy

/**
 * An n x n matrix is valid if every row and every column contains all the integers from 1 to n (inclusive).
 *
 * Given an n x n integer matrix matrix, return true if the matrix is valid. Otherwise, return false.
 *
 * [URL](https://leetcode.com/problems/buy-two-chocolates/)
 */
object CheckIfEveryRowAndColumnContainsAllNumbers {
    fun checkValid(matrix: Array<IntArray>): Boolean {
        val n = matrix.size

        for (r in matrix.indices) {
            val set = IntArray(n)
            for (c in matrix[0].indices) {
                val num = matrix[r][c]
                if (set[num - 1] > 0) return false
                set[num - 1]++
            }
        }

        for (c in matrix[0].indices) {
            val set = IntArray(n)
            for (r in matrix.indices) {
                val num = matrix[r][c]
                if (set[num - 1] > 0) return false
                set[num - 1]++
            }
        }

        return true
    }
}
