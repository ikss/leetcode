package easy

/**
 * You are given a 2D 0-indexed integer array dimensions.
 *
 * For all indices i, 0 <= i < dimensions.length, `dimensions[i][0]` represents the length and `dimensions[i][1]`
 * represents the width of the rectangle i.
 *
 * Return the area of the rectangle having the longest diagonal. If there are multiple rectangles with the longest
 * diagonal, return the area of the rectangle having the maximum area.
 *
 * [URL](https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle/)
 */
object MaximumAreaOfLongestDiagonalRectangle {
    fun areaOfMaxDiagonal(dimensions: Array<IntArray>): Int {
        var maxDiagonal = Double.MIN_VALUE
        var area = 0

        for ((l, w) in dimensions) {
            val diag = Math.sqrt(Math.pow(l.toDouble(), 2.0) + Math.pow(w.toDouble(), 2.0))
            if (diag < maxDiagonal) continue
            else if (diag == maxDiagonal) area = maxOf(area, l * w)
            else area = l * w

            maxDiagonal = diag
        }

        return area
    }
}
