package medium

/**
 * There exist n rectangles in a 2D plane with edges parallel to the x and y axis. You are given two 2D integer arrays
 * bottomLeft and topRight where `bottomLeft[i] = [a_i, b_i]` and `topRight[i] = [c_i, d_i]` represent the bottom-left
 * and top-right coordinates of the ith rectangle, respectively.
 *
 * You need to find the maximum area of a square that can fit inside the intersecting region of at least two rectangles.
 * Return 0 if such a square does not exist.
 *
 * [URL](https://leetcode.com/problems/find-the-largest-area-of-square-inside-two-rectangles/)
 */
object FindTheLargestAreaOfSquareInsideTwoRectangles {
    fun largestSquareArea(bottomLeft: Array<IntArray>, topRight: Array<IntArray>): Long {
        var maxSide = 0L

        for (i in 0 until bottomLeft.size - 1) {
            for (j in i + 1 until bottomLeft.size) {
                val w = minOf(topRight[i][0], topRight[j][0]) - maxOf(bottomLeft[i][0], bottomLeft[j][0]).toLong()
                val h = minOf(topRight[i][1], topRight[j][1]) - maxOf(bottomLeft[i][1], bottomLeft[j][1]).toLong()

                maxSide = maxOf(maxSide, minOf(w, h))
            }
        }

        return maxSide * maxSide
    }
}
