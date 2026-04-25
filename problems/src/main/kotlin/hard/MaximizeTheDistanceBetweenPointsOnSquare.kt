package hard

import java.util.*

/**
 * You are given an integer side, representing the edge length of a square with corners at (0, 0), (0, side), (side, 0),
 * and (side, side) on a Cartesian plane.
 *
 * You are also given a positive integer k and a 2D integer array points,
 * where `points[i] = [xi, yi]` represents the coordinate of a point lying on the boundary of the square.
 *
 * You need to select k elements among points such that the minimum Manhattan distance between any two points is maximized.
 *
 * Return the maximum possible minimum Manhattan distance between the selected k points.
 *
 * The Manhattan Distance between two cells (xi, yi) and (xj, yj) is |xi - xj| + |yi - yj|.
 *
 * [URL](https://leetcode.com/problems/implement-stack-using-queues/)
 */
object MaximizeTheDistanceBetweenPointsOnSquare {
    fun maxDistance(side: Int, points: Array<IntArray>, k: Int): Int {
        val arr = ArrayList<Long>()

        for ((x, y) in points) {
            if (x == 0) {
                arr.add(y.toLong())
            } else if (y == side) {
                arr.add(side.toLong() + x)
            } else if (x == side) {
                arr.add(side * 3L - y)
            } else {
                arr.add(side * 4L - x)
            }
        }
        arr.sort()

        var lo = 1L
        var hi = side.toLong()
        var ans = 0

        while (lo <= hi) {
            val mid = (lo + hi) / 2
            if (check(arr, side, k, mid)) {
                lo = mid + 1
                ans = mid.toInt()
            } else {
                hi = mid - 1
            }
        }
        return ans
    }

    private fun check(arr: MutableList<Long>, side: Int, k: Int, limit: Long): Boolean {
        val perimeter = side * 4L

        for (start in arr) {
            val end = start + perimeter - limit
            var cur: Long = start

            for (i in 0..<k - 1) {
                val idx = lowerBound(arr, cur + limit)
                if (idx == arr.size || arr[idx] > end) {
                    cur = -1
                    break
                }
                cur = arr[idx]
            }

            if (cur >= 0) {
                return true
            }
        }
        return false
    }

    private fun lowerBound(arr: MutableList<Long>, target: Long): Int {
        var left = 0
        var right = arr.size
        while (left < right) {
            val mid = left + (right - left) / 2
            if (arr[mid] < target) {
                left = mid + 1
            } else {
                right = mid
            }
        }
        return left
    }
}