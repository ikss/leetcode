package medium

/**
 * You are given a 2D integer array points, where `points[i] = [xi, yi]` represents the coordinates
 * of the ith point on the Cartesian plane.
 *
 * A horizontal trapezoid is a convex quadrilateral with at least one pair of horizontal sides
 * (i.e. parallel to the x-axis). Two lines are parallel if and only if they have the same slope.
 *
 * Return the number of unique horizontal trapezoids that can be formed by choosing any four distinct points from points.
 *
 * Since the answer may be very large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/count-number-of-trapezoids-i/)
 */
object CountNumberOfTrapezoidsI {
    fun countTrapezoids(points: Array<IntArray>): Int {
        val mod = 1_000_000_007
        val countByY = HashMap<Int, Int>()

        for (arr in points) {
            val old = countByY[arr[1]] ?: 0
            countByY[arr[1]] = old + 1
        }

        var totalcomb = 0L
        var result = 0L
        for ((_, count) in countByY) {
            if (count > 1) {
                val comb = comb(count)
                result = (result + totalcomb * comb) % mod
                totalcomb = (totalcomb + comb) % mod
            }
        }

        return result.toInt()
    }

    private fun comb(n: Int): Long {
        return n.toLong() * (n - 1) / 2
    }
}
