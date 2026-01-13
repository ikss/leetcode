package medium

import data_structures.ListNode

/**
 * You are given a 2D integer array squares. Each `squares[i] = [xi, yi, li]` represents the coordinates of the
 * bottom-left point and the side length of a square parallel to the x-axis.
 *
 * Find the minimum y-coordinate value of a horizontal line such that the total area of the squares above the line
 * equals the total area of the squares below the line.
 *
 * Answers within 10-5 of the actual answer will be accepted.
 *
 * Note: Squares may overlap. Overlapping areas should be counted multiple times.
 *
 * [URL](https://leetcode.com/problems/separate-squares-i/)
 */
object SeparateSquaresI {
    fun separateSquares(squares: Array<IntArray>): Double {
        var totalSum = 0.0

        var miny = 0.0
        var maxy = 0.0
        for ((_, y, l) in squares) {
            val sum = l.toDouble() * l
            totalSum += sum

            maxy = maxOf(maxy, y.toDouble() + l)
        }

        val halfSum = totalSum / 2
        var result = -1.0

        while (Math.abs(maxy - miny) > 0.000001) {
            val mid = miny + (maxy - miny) / 2
            val bottomSum = getSum(squares, mid)

            result = mid
            if (bottomSum < halfSum) {
                miny = mid
            } else {
                maxy = mid
            }
        }

        return result
    }

    private fun getSum(squares: Array<IntArray>, mid: Double): Double {
        var totalSum = 0.0

        for ((_, y, l) in squares) {
            if (y > mid) continue

            val sum = l * minOf(l.toDouble(), mid - y)
            totalSum += sum
        }

        return totalSum
    }
}
