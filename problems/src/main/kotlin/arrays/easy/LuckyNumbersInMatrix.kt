package arrays.easy

/**
 * Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
 *
 * A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
 *
 * [URL](https://leetcode.com/problems/lucky-numbers-in-a-matrix/)
 */
object LuckyNumbersInMatrix {
    fun luckyNumbers(matrix: Array<IntArray>): List<Int> {
        val n = matrix.size
        val m = matrix[0].size

        var rMinMax = Int.MIN_VALUE
        for (i in 0 until n) {
            var rMin = Int.MAX_VALUE
            for (j in 0 until m) {
                rMin = minOf(rMin, matrix[i][j])
            }
            rMinMax = maxOf(rMinMax, rMin)
        }

        var cMaxMin = Int.MAX_VALUE
        for (j in 0 until m) {
            var cMax = Int.MIN_VALUE
            for (i in 0 until n) {
                cMax = maxOf(cMax, matrix[i][j])
            }
            cMaxMin = minOf(cMaxMin, cMax)
        }

        if (rMinMax == cMaxMin) {
            return listOf(rMinMax)
        }

        return emptyList()
    }
}
