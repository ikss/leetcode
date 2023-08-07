package arrays.medium

/**
 * You are given an m x n integer matrix _matrix_ with the following two properties:
 *
 * Each row is sorted in non-decreasing order.
 * The first integer of each row is greater than the last integer of the previous row.
 * Given an integer target, return true if target is in matrix or false otherwise.
 *
 * You must write a solution in O(log(m * n)) time complexity.
 *
 * [URL](https://leetcode.com/problems/search-a-2d-matrix/)
 */
object Search2DMatrix {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val n = matrix[0].size

        var l = 0
        var r = matrix.size * n - 1

        while (l <= r) {
            val mid = l + (r - l) / 2
            val row = mid / n
            val col = mid % n

            val num = matrix[row][col]
            if (num == target) {
                return true
            } else if (num > target) {
                r = mid - 1
            } else {
                l = mid + 1
            }

        }

        return false
    }
}
