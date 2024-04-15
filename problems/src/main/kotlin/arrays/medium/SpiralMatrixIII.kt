package arrays.medium

/**
 * You start at the cell (rStart, cStart) of an rows x cols grid facing east. The northwest corner
 * is at the first row and column in the grid, and the southeast corner is at the last row and column.
 *
 * You will walk in a clockwise spiral shape to visit every position in this grid.
 * Whenever you move outside the grid's boundary, we continue our walk outside the grid
 * (but may return to the grid boundary later.). Eventually, we reach all rows * cols spaces of the grid.
 *
 * Return an array of coordinates representing the positions of the grid in the order you visited them.
 *
 * [URL](https://leetcode.com/problems/spiral-matrix-iii/)
 */
object SpiralMatrixIII {
    private val dirs = listOf(0 to 1, 1 to 0, 0 to -1, -1 to 0)

    fun spiralMatrixIII(rows: Int, cols: Int, rStart: Int, cStart: Int): Array<IntArray> {
        val result = ArrayList<IntArray>()
        result.add(intArrayOf(rStart, cStart))

        var steps = 0
        var row = rStart
        var col = cStart

        while (result.size < rows * cols) {
            for (i in dirs.indices) {
                if (i % 2 == 0) steps++

                val (di, dj) = dirs[i]
                for (step in 0 until steps) {
                    row += di
                    col += dj

                    if (row in 0..<rows && col in 0..<cols) {
                        result.add(intArrayOf(row, col))
                    }
                }
            }
        }

        return result.toTypedArray()
    }
}
