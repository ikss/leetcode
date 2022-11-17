package math.medium

/**
 * Given the coordinates of two rectilinear rectangles in a 2D plane,
 * return the total area covered by the two rectangles.
 *
 * The first rectangle is defined by its bottom-left corner (ax1, ay1) and its top-right corner (ax2, ay2).
 *
 * The second rectangle is defined by its bottom-left corner (bx1, by1) and its top-right corner (bx2, by2).
 *
 * [URL](https://leetcode.com/problems/rectangle-area/)
 */
object RectangleArea {
    fun computeArea(ax1: Int, ay1: Int, ax2: Int, ay2: Int, bx1: Int, by1: Int, bx2: Int, by2: Int): Int {
        val s1 = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2)
        val s2 = Math.abs(bx1 - bx2) * Math.abs(by1 - by2)

        if (s1 == 0 || s2 == 0) return s1 + s2

        val left = maxOf(ax1, bx1)
        val right = minOf(ax2, bx2)
        val xOverlap = right - left

        val bottom = maxOf(ay1, by1)
        val top = minOf(ay2, by2)
        val yOverlap = top - bottom

        var areaOfOverlap = 0

        if (xOverlap > 0 && yOverlap > 0) {
            areaOfOverlap = xOverlap * yOverlap
        }

        return s1 + s2 - areaOfOverlap
    }
}
