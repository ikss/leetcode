package arrays.easy

/**
 * You are given an array coordinates, `coordinates[i] = [x, y]`, where `[x, y]` represents the coordinate of a point.
 * Check if these points make a straight line in the XY plane.
 *
 * [URL](https://leetcode.com/problems/check-if-it-is-a-straight-line/)
 */
object CheckIfItIsStraightLine {
    fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
        if (coordinates.size < 3) return true

        val (diffX, diffY) = getDiffs(coordinates[0], coordinates[1])

        for (i in 2 until coordinates.size) {
            val (anotherDiffX, anotherDiffY) = getDiffs(coordinates[0], coordinates[i])
            if (diffX * anotherDiffY != diffY * anotherDiffX) return false
        }
        return true
    }

    private fun getDiffs(p1: IntArray, p2: IntArray): Pair<Int, Int> {
        val (x1, y1) = p1
        val (x2, y2) = p2

        val xdif = x1 - x2
        val ydif = y1 - y2

        return xdif to ydif
    }
}
