package arrays.medium

import data_structures.ListNode

/**
 * You are given two integers m and n, which represent the dimensions of a matrix.
 *
 * You are also given the head of a linked list of integers.
 *
 * Generate an m x n matrix that contains the integers in the linked list presented in spiral order (clockwise),
 * starting from the top-left of the matrix. If there are remaining empty spaces, fill them with -1.
 *
 * Return the generated matrix.
 *
 * [URL](https://leetcode.com/problems/spiral-matrix-iv/)
 */
object SpiralMatrixIV {
    private val directions = listOf(0 to 1, 1 to 0, 0 to -1, -1 to 0)

    fun spiralMatrix(m: Int, n: Int, head: ListNode?): Array<IntArray> {
        val result = Array(m) { IntArray(n) { -1 } }

        var curr = head
        var currRow = 0
        var currCol = 0
        var currDir = 0

        while (curr != null) {
            result[currRow][currCol] = curr.`val`
            val newRow = currRow + directions[currDir].first
            val newCol = currCol + directions[currDir].second

            if (newRow !in 0 until m || newCol !in 0 until n || result[newRow][newCol] != -1) {
                currDir = (currDir + 1) % 4
            }
            currRow += directions[currDir].first
            currCol += directions[currDir].second
            curr = curr.next
        }

        return result
    }
}
