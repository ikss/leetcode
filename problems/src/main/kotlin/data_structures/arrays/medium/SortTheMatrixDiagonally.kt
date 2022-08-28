package data_structures.arrays.medium

import java.util.*


/**
 * A matrix diagonal is a diagonal line of cells starting from some cell in either the topmost row or leftmost column
 * and going in the bottom-right direction until reaching the matrix's end. For example, the matrix diagonal starting
 * from `mat[2][0]`, where mat is a 6 x 3 matrix, includes cells `mat[2][0]`, `mat[3][1]`, and `mat[4][2]`.
 *
 * Given an m x n matrix mat of integers, sort each matrix diagonal in ascending order and return the resulting matrix.
 *
 * [URL](https://leetcode.com/problems/sort-the-matrix-diagonally/)
 */
object SortTheMatrixDiagonally {
    fun diagonalSortPQ(mat: Array<IntArray>): Array<IntArray> {
        val m = mat.size
        val n = mat[0].size
        val d = hashMapOf<Int, PriorityQueue<Int>>()
        for (i in 0 until m) {
            for (j in 0 until n) {
                val queue = d.getOrPut(i - j) { PriorityQueue() }
                queue.add(mat[i][j])
            }
        }
        for (i in 0 until m) {
            for (j in 0 until n) {
                mat[i][j] = d[i - j]!!.poll()
            }
        }
        return mat
    }

    fun diagonalSortNaive(mat: Array<IntArray>): Array<IntArray> {
        for (i in 0 until mat.size - 1) {
            val arr = mutableListOf<Int>()

            var st = 0
            while (i + st < mat.size && st < mat[0].size) {
                arr.add(mat[i + st][st++])
            }
            arr.sort()
            st = 0
            while (i + st < mat.size && st < mat[0].size) {
                mat[i + st][st] = arr[st++]
            }
        }

        for (j in 1 until mat[0].size - 1) {
            val arr = mutableListOf<Int>()

            var st = 0
            while (st < mat.size && st + j < mat[0].size) {
                arr.add(mat[st][j + st++])
            }
            arr.sort()
            st = 0
            while (st < mat.size && st + j < mat[0].size) {
                mat[st][j + st] = arr[st++]
            }
        }

        return mat
    }
}
