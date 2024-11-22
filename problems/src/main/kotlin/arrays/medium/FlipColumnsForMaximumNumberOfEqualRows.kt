package arrays.medium

/**
 * You are given an m x n binary matrix matrix.
 *
 * You can choose any number of columns in the matrix and flip every cell in that column
 * (i.e., Change the value of the cell from 0 to 1 or vice versa).
 *
 * Return the maximum number of rows that have all values equal after some number of flips.
 *
 * [URL](https://leetcode.com/problems/flip-columns-for-maximum-number-of-equal-rows/)
 */
object FlipColumnsForMaximumNumberOfEqualRows {
    fun maxEqualRowsAfterFlips(matrix: Array<IntArray>): Int {
        val map = HashMap<String, Int>()

        var result = 0
        for (r in matrix) {
            val sb = StringBuilder()
            for (i in r.indices) {
                val c = r[i]
                if (c == r[0]) sb.append('T') else sb.append('F')
            }
            val str = sb.toString()
            val value = map.getOrDefault(str, 0) + 1
            map[str] = value
            result = maxOf(result, value)
        }

        return result
    }
}
