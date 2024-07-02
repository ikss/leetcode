package arrays.medium

import kotlin.math.max
import kotlin.math.min


/**
 * Given n points on a 2D plane, find if there is such a line parallel to the y-axis that reflects the given points
 * symmetrically.
 *
 * In other words, answer whether or not if there exists a line that after reflecting all points over the given line,
 * the original points' set is the same as the reflected ones.
 *
 * Note that there can be repeated points.
 *
 * [URL](https://leetcode.com/problems/line-reflection/)
 */
object LineReflection {
    fun isReflected(points: Array<IntArray>): Boolean {
        val pointSet = HashSet<Pair<Int, Int>>()
        val sum: Int
        var maxX: Int
        var minX: Int

        minX = Int.MAX_VALUE
        maxX = Int.MIN_VALUE
        for (point in points) {
            maxX = maxOf(maxX, point[0])
            minX = minOf(minX, point[0])
            pointSet.add(point[0] to point[1])
        }

        sum = maxX + minX
        for (point in points) {
            if (!pointSet.contains(sum - point[0] to point[1])) {
                return false
            }
        }
        return true
    }
}
