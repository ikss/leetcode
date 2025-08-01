package math.easy

/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 *
 * [URL](https://leetcode.com/problems/pascals-triangle/)
 */
object PascalTriangle {
    fun generate(numRows: Int): List<List<Int>> {
        val result = arrayListOf(listOf(1))

        for (row in 1 until numRows) {
            val newRow = arrayListOf(1)
            val prevRow = result[row - 1]

            for (i in 0 until prevRow.size - 1) {
                newRow += prevRow[i] + prevRow[i + 1]
            }
            newRow += 1
            result += newRow
        }
        return result
    }
}
