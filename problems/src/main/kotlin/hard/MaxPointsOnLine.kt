package hard

/**
 * Given an array of points where `points[i] = [xi, yi]` represents a point on the X-Y plane,
 * return the maximum number of points that lie on the same straight line.
 * *
 * [URL](https://leetcode.com/problems/max-points-on-a-line/)
 */
object MaxPointsOnLine {
    fun maxPoints(points: Array<IntArray>): Int {
        val n = points.size
        if (n < 3) {
            return n
        }
        var result = 0
        for (i in 0 until n) {
            val cnt = hashMapOf<Double, Int>()
            for (j in 0 until n) {
                if (j != i) {
                    val yDiff = (points[j][1] - points[i][1]).toDouble()
                    val xDiff = (points[j][0] - points[i][0]).toDouble()
                    cnt.merge(Math.atan2(yDiff, xDiff), 1, Integer::sum)
                }
            }
            result = maxOf(result, cnt.values.max() + 1)
        }
        return result
    }
}
