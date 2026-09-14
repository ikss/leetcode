package easy

/**
 * An axis-aligned rectangle is represented as a list `[x1, y1, x2, y2]`, where (x1, y1) is the coordinate of its
 * bottom-left corner, and (x2, y2) is the coordinate of its top-right corner.
 * Its top and bottom edges are parallel to the X-axis, and its left and right edges are parallel to the Y-axis.
 *
 * Two rectangles overlap if the area of their intersection is positive.
 * To be clear, two rectangles that only touch at the corner or edges do not overlap.
 *
 * Given two axis-aligned rectangles rec1 and rec2, return true if they overlap, otherwise return false.
 *
 * [URL](eetcode.com/problems/rectangle-overlap/)
 */
object RectangleOverlap {
    fun isRectangleOverlap(rec1: IntArray, rec2: IntArray): Boolean {
        val (x11, y11, x12, y12) = rec1
        val (x21, y21, x22, y22) = rec2

        if (x11 == x12 || y11 == y12 || x21 == x22 || y21 == y22) {
            return false
        }
        return !(
            x12 <= x21 || y12 <= y21 || x11 >= x22 || y11 >= y22
        )
    }
}