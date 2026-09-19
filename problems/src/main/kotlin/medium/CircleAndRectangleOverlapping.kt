package medium

/**
 * You are given a circle represented as (radius, xCenter, yCenter) and an axis-aligned rectangle represented as
 * (x1, y1, x2, y2), where (x1, y1) are the coordinates of the bottom-left corner,
 * and (x2, y2) are the coordinates of the top-right corner of the rectangle.
 *
 * Return true if the circle and rectangle are overlapped otherwise return false.
 * In other words, check if there is any point (xi, yi) that belongs to the circle and the rectangle at the same time.
 *
 * [URL](https://leetcode.com/problems/circle-and-rectangle-overlapping)
 */
object CircleAndRectangleOverlapping {
    fun checkOverlap(radius: Int, xCenter: Int, yCenter: Int, x1: Int, y1: Int, x2: Int, y2: Int): Boolean {
        var dist = 0.0
        if (xCenter !in x1..x2) {
            dist += minOf(Math.pow(x1 - xCenter.toDouble(), 2.0), Math.pow(x2 - xCenter.toDouble(), 2.0))
        }
        if (yCenter !in y1..y2) {
            dist += minOf(Math.pow(y1 - yCenter.toDouble(), 2.0), Math.pow(y2 - yCenter.toDouble(), 2.0))
        }
        return dist <= radius * radius
    }
}
