package medium

/**
 * Given n points on a 2D plane where `points[i] = [xi, yi]`, Return the widest vertical area between two points such
 * that no points are inside the area.
 *
 * A vertical area is an area of fixed-width extending infinitely along the y-axis (i.e., infinite height).
 * The widest vertical area is the one with the maximum width.
 *
 * Note that points on the edge of a vertical area are not considered included in the area.
 *
 * [URL](https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/)
 */
object WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
    fun maxWidthOfVerticalArea(points: Array<IntArray>): Int {
        points.sortBy { it[0] }

        var result = Int.MIN_VALUE
        for (i in 1 until points.size) {
            result = maxOf(result, points[i][0] - points[i - 1][0])
        }
        return result
    }
}
