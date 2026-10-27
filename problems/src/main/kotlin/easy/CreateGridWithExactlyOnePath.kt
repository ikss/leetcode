package easy

/**
 * You are given two integers m and n, representing the number of rows and columns of a grid.
 *
 * Construct any m x n grid consisting only of the characters '.' and '#', where:
 * * '.' represents a free cell.
 * * '#' represents an obstacle cell.
 *
 * A valid path is a sequence of free cells that:
 * * Starts at the top-left cell (0, 0).
 * * Ends at the bottom-right cell (m - 1, n - 1).
 *
 * Moves only:
 * * Right, from (i, j) to (i, j + 1), or
 * * Down, from (i, j) to (i + 1, j).
 *
 * Return any grid such that there is exactly one valid path from the top-left cell to the bottom-right cell.
 *
 * [URL](https://leetcode.com/problems/create-grid-with-exactly-one-path/)
 */
object CreateGridWithExactlyOnePath {
    fun createGrid(m: Int, n: Int): Array<String> {
        val result = Array(m) { "" }

        val freeLeft = getFree(1, n)
        for (r in 0 until m - 1) {
            result[r] = freeLeft
        }
        result[m - 1] = getFree(n, n)

        return result
    }

    private fun getFree(m: Int, n: Int): String {
        val builder = StringBuilder(n)

        var i = 0
        while (i < m) {
            builder.append('.')
            i++
        }
        while (i < n) {
            builder.append('#')
            i++
        }

        return builder.toString()
    }
}
