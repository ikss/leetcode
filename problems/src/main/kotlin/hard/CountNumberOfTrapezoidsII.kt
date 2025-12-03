package hard

import java.util.*


/**
 * You are given a 2D integer array points where `points[i] = [xi, yi]`
 * represents the coordinates of the ith point on the Cartesian plane.
 *
 * Return the number of unique trapezoids that can be formed by choosing any four distinct points from points.
 *
 * A trapezoid is a convex quadrilateral with at least one pair of parallel sides.
 * Two lines are parallel if and only if they have the same slope.
 *
 * [URL](https://leetcode.com/problems/count-number-of-trapezoids-ii/)
 */
object CountNumberOfTrapezoidsII {
    fun countTrapezoids(points: Array<IntArray>): Int {
        val n = points.size
        val inf = 1e9 + 7
        val slopeToIntercept = HashMap<Double, MutableList<Double>>()
        val midToSlope = HashMap<Int, MutableList<Double>>()
        var result = 0

        for (i in 0..<n) {
            val (x1, y1) = points[i]
            for (j in i + 1..<n) {
                val (x2, y2) = points[j]
                val dx = x1 - x2
                val dy = y1 - y2
                var k: Double
                var b: Double

                if (x2 == x1) {
                    k = inf
                    b = x1.toDouble()
                } else {
                    k = (1.0 * (y2 - y1)) / (x2 - x1)
                    b = (1.0 * (y1 * dx - x1 * dy)) / dx
                }
                if (k == -0.0) {
                    k = 0.0
                }
                if (b == -0.0) {
                    b = 0.0
                }
                val mid = (x1 + x2) * 10000 + (y1 + y2)
                slopeToIntercept.computeIfAbsent(k) { ArrayList<Double>() }.add(b)
                midToSlope.computeIfAbsent(mid) { ArrayList<Double>() }.add(k)
            }
        }

        for (sti in slopeToIntercept.values) {
            if (sti.size == 1) {
                continue
            }
            val cnt = TreeMap<Double, Int>()
            for (b in sti) {
                cnt[b] = cnt.getOrDefault(b, 0) + 1
            }
            var sum = 0
            for (count in cnt.values) {
                result += sum * count
                sum += count
            }
        }

        for (mts in midToSlope.values) {
            if (mts.size == 1) {
                continue
            }
            val cnt = TreeMap<Double, Int>()
            for (k in mts) {
                cnt[k] = cnt.getOrDefault(k, 0) + 1
            }
            var sum = 0
            for (count in cnt.values) {
                result -= sum * count
                sum += count
            }
        }

        return result
    }
}
