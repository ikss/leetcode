package hard

import java.util.*

/**
 * You are given a 2D integer array intervals, where `intervals[i] = [li, ri, weighti]`.
 * Interval i starts at position li and ends at ri, and has a weight of weighti. You can choose up to 4 non-overlapping
 * intervals. The score of the chosen intervals is defined as the total sum of their weights.
 *
 * Return the lexicographically smallest array of at most 4 indices from intervals with maximum score, representing
 * your choice of non-overlapping intervals.
 *
 * Two intervals are said to be non-overlapping if they do not share any points.
 * In particular, intervals sharing a left or right boundary are considered overlapping.
 *
 * [URL](https://leetcode.com/problems/maximum-score-of-non-overlapping-intervals/)
 */
object MaximumScoreOfNonoverlappingIntervals {

    fun maximumWeight(intervals: MutableList<MutableList<Int>>): IntArray {
        val n = intervals.size
        val arr = Array(n) { IntArray(4) }
        for (i in 0..<n) {
            arr[i][0] = intervals[i][0]
            arr[i][1] = intervals[i][1]
            arr[i][2] = intervals[i][2]
            arr[i][3] = i
        }
        arr.sortWith { a, b -> a[1].compareTo(b[1]) }

        val dp = Array(n + 1) { LongArray(5) }
        val indices = Array(n + 1) { Array(5) { ArrayList<Int>() } }

        for (i in 0..<n) {
            val (l, _, weight, idx) = arr[i]
            val k = binarySearch(arr, i, l)

            for (j in 1..4) {
                val s1 = dp[i][j]
                val s2 = dp[k][j - 1] + weight
                if (s1 > s2) {
                    dp[i + 1][j] = dp[i][j]
                    indices[i + 1][j] = ArrayList<Int>(indices[i][j])
                    continue
                }

                var newIndex = ArrayList<Int>(indices[k][j - 1])
                newIndex.add(idx)
                newIndex.sort()
                if (s1 == s2 && compareLists(indices[i][j], newIndex) < 0) {
                    newIndex = ArrayList<Int>(indices[i][j])
                }
                dp[i + 1][j] = s2
                indices[i + 1][j] = newIndex
            }
        }

        val result = indices[n][4]
        val ans = IntArray(result.size)
        for (i in result.indices) {
            ans[i] = result[i]
        }
        return ans
    }

    private fun binarySearch(arr: Array<IntArray>, end: Int, target: Int): Int {
        var left = 0
        var right = end
        while (left < right) {
            val mid = (left + right) / 2
            if (arr[mid][1] < target) {
                left = mid + 1
            } else {
                right = mid
            }
        }
        return left
    }

    private fun compareLists(a: ArrayList<Int>, b: ArrayList<Int>): Int {
        val minLen = minOf(a.size, b.size)
        for (i in 0..<minLen) {
            if (a[i] != b[i]) {
                return a[i].compareTo(b[i])
            }
        }
        return a.size.compareTo(b.size)
    }
}
