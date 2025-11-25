package medium

import java.util.*

/**
 * Given an n x n matrix where each of the rows and columns is sorted in ascending order,
 * return the kth smallest element in the matrix.
 *
 * Note that it is the kth smallest element in the sorted order, not the kth distinct element.
 *
 * You must find a solution with a memory complexity better than O(n^2).
 *
 * [URL](https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/)
 */
object KthSmallestElementInSortedMatrix {
    fun kthSmallestBinarySearch(matrix: Array<IntArray>, k: Int): Int {
        val n = matrix.size
        var lo = matrix[0][0]
        var hi = matrix[n - 1][n - 1] + 1 //[lo, hi)
        while (lo < hi) {
            val mid = lo + (hi - lo) / 2
            var count = 0
            var j = n - 1
            for (i in matrix.indices) {
                while (j >= 0 && matrix[i][j] > mid) {
                    j--
                }
                count += (j + 1)
            }

            if (count < k) lo = mid + 1 else hi = mid
        }
        return lo
    }

    fun kthSmallestPriorityQueue(matrix: Array<IntArray>, k: Int): Int {
        val queue = PriorityQueue<Int>(k) { a, b -> b - a }
        matrix.forEach { submatrix -> submatrix.forEach { queue.offer(it) } }
        while (queue.size > k) queue.poll()
        return queue.poll()
    }
}
