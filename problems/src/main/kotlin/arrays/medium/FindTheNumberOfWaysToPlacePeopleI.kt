package arrays.medium

/**
 * You are given a 2D array points of size n x 2 representing integer coordinates of some points on a 2D plane,
 * where `points[i] = [xi, yi]`.
 *
 * Count the number of pairs of points (A, B), where
 *
 * A is on the upper left side of B, and
 * there are no other points in the rectangle (or line) they make (including the border).
 * Return the count.
 *
 * [URL](https://leetcode.com/problems/find-the-number-of-ways-to-place-people-i/)
 */
object FindTheNumberOfWaysToPlacePeopleI {
    fun numberOfPairs(points: Array<IntArray>): Int {
        points.sortWith { p1, p2 -> if (p1[0] == p2[0]) p2[1] - p1[1] else p1[0] - p2[0] }

        var result = 0
        for (i in 0 until points.size - 1) {
            for (j in i + 1 until points.size) {
                val p1 = points[i]
                val p2 = points[j]

                if (p1[0] <= p2[0] && p1[1] >= p2[1] && noPointsBeetween(p1, p2, points)) {
                    result++
                }
            }
        }
        return result
    }

    private fun noPointsBeetween(p1: IntArray, p2: IntArray, points: Array<IntArray>): Boolean {
        val (x1, x2) = if (p1[0] <= p2[0]) p1[0] to p2[0] else p2[0] to p1[0]
        val (y1, y2) = if (p1[1] <= p2[1]) p1[1] to p2[1] else p2[1] to p1[1]

        for ((x, y) in points) {
            if (x == p1[0] && y == p1[1]) continue
            if (x == p2[0] && y == p2[1]) continue

            if (x in x1..x2 && y in y1..y2) return false
        }
        return true
    }
}
