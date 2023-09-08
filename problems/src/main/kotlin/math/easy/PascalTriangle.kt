package math.easy

/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 *
 * [URL](https://leetcode.com/problems/pascals-triangle/)
 */
object PascalTriangle {
    fun generate(numRows: Int): List<List<Int>> {
        val result = ArrayList<List<Int>>(numRows)
        result.add(listOf(1))

        for (i in 1 until numRows) {
            val row = mutableListOf(1)
            for (j in 1 until i) {
                row += result[i - 1][j - 1] + result[i - 1][j]
            }
            row.add(1)
            result.add(row)
        }

        return result
    }
}
