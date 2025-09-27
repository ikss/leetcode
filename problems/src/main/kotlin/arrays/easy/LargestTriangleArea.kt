package arrays.easy

/**
 * Given an array of points on the X-Y plane points where `points[i] = [xi, yi]`, return the area of the larges
 * triangle that can be formed by any three different points. Answers within 10-5 of the actual answer will be accepted.
 *
 * [URL](https://leetcode.com/problems/largest-triangle-area/)
 */
object LargestTriangleArea {
    fun largestTriangleArea(points: Array<IntArray>): Double {
        var result = 0.0

        for (i in 0 until points.size - 2) {
            val pi = points[i]
            for (j in i + 1 until points.size - 1) {
                val pj = points[j]
                for (k in j + 1 until points.size) {
                    val pk = points[k]

                    val s1 = getDistance(pi, pj)
                    val s2 = getDistance(pi, pk)
                    val s3 = getDistance(pj, pk)

                    if (isValid(s1, s2, s3)) {
                        result = maxOf(result, area(s1, s2, s3))
                    }
                }
            }
        }

        return result
    }

    private fun getDistance(p1: IntArray, p2: IntArray): Double {
        val dx = Math.abs(p1[0] - p2[0]).toDouble()
        val dy = Math.abs(p1[1] - p2[1]).toDouble()

        if (dx == 0.0) return dy
        if (dy == 0.0) return dx
        return Math.sqrt(dx * dx + dy * dy)
    }

    private fun isValid(p1: Double, p2: Double, p3: Double): Boolean {
        return p1 + p2 > p3 && p1 + p3 > p2 && p2 + p3 > p1
    }

    private fun area(s1: Double, s2: Double, s3: Double): Double {
        val p = (s1 + s2 + s3) / 2

        return Math.sqrt(p * (p - s1) * (p - s2) * (p - s3))
    }
}
