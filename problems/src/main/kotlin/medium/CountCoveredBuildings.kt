package medium

/**
 * You are given a positive integer n, representing an n x n city. You are also given a 2D grid buildings,
 * where `buildings[i] = [x, y]` denotes a unique building located at coordinates `[x, y]`.
 *
 * A building is covered if there is at least one building in all four directions: left, right, above, and below.
 *
 * Return the number of covered buildings.
 *
 * [URL](https://leetcode.com/problems/count-covered-buildings/)
 */
object CountCoveredBuildings {
    fun countCoveredBuildings(n: Int, buildings: Array<IntArray>): Int {
        val minRow = IntArray(n + 1) { Int.MAX_VALUE }
        val maxRow = IntArray(n + 1) { -1 }
        val minCol = IntArray(n + 1) { Int.MAX_VALUE }
        val maxCol = IntArray(n + 1) { -1 }

        for ((r, c) in buildings) {
            minRow[c] = minOf(minRow[c], r)
            maxRow[c] = maxOf(maxRow[c], r)
            minCol[r] = minOf(minCol[r], c)
            maxCol[r] = maxOf(maxCol[r], c)
        }

        var result = 0

        for ((r, c) in buildings) {
            if (minRow[c] < r && maxRow[c] > r && minCol[r] < c && maxCol[r] > c) {
                result++
            }
        }

        return result
    }
}
