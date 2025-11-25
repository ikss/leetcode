package medium

/**
 * You have a convex n-sided polygon where each vertex has an integer value. You are given an integer array values
 * where `values[i]` is the value of the ith vertex in clockwise order.
 *
 * Polygon triangulation is a process where you divide a polygon into a set of triangles and the vertices of each
 * triangle must also be vertices of the original polygon. Note that no other shapes other than triangles are allowed
 * in the division. This process will result in n - 2 triangles.
 *
 * You will triangulate the polygon. For each triangle, the weight of that triangle is the product of the values at its
 * vertices. The total score of the triangulation is the sum of these weights over all n - 2 triangles.
 *
 * Return the minimum possible score that you can achieve with some triangulation of the polygon.
 *
 * [URL](https://leetcode.com/problems/minimum-score-triangulation-of-polygon/)
 */
object MinimumScoreTriangulationOfPolygon {

    fun minScoreTriangulation(values: IntArray): Int {
        val n = values.size
        val memo = HashMap<Int, Int>()
        return dp(0, n - 1, values, n, memo)
    }

    fun dp(i: Int, j: Int, values: IntArray, n: Int, memo: HashMap<Int, Int>): Int {
        if (i + 2 > j) {
            return 0
        }
        if (i + 2 == j) {
            return values[i] * values[i + 1] * values[j]
        }
        val key = i * n + j
        if (!memo.containsKey(key)) {
            var minScore = Int.MAX_VALUE
            for (k in i + 1..<j) {
                minScore = minOf(
                    minScore,
                    values[i] * values[k] * values[j] + dp(i, k, values, n, memo) + dp(k, j, values, n, memo)
                )
            }
            memo[key] = minScore
        }
        return memo.getValue(key)
    }
}
